/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Util.HibernateUtil;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale.Category;
import javax.swing.JOptionPane;
import model.Avioes;
import model.Clientes;
import model.TableModelViagens;
import model.Viagens;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.classic.Session;
import sun.security.jca.GetInstance;
import view.JFrameCadViagens;

/**
 *
 * @author evandro, gabriel, luiz felipe, adriano
 */
public class ControllerViagens {
    
    private JFrameCadViagens viewViagens;
    private TableModelViagens viewTabela;
    
    public ControllerViagens(JFrameCadViagens viewViagens, TableModelViagens t) {
        this.viewViagens = viewViagens;        
        viewTabela = t;
    }
    
    public void save() {
        
        Viagens viagem = newFromView();
        if(viagem == null) {
            return;            
        } else {
           // aviao.toString();
            
            Session s = HibernateUtil.getSessionFactory().getCurrentSession();              
        
            try {
                s.beginTransaction();
                s.save(viagem);
                s.getTransaction().commit();
                viewTabela.add(viagem); 
            } catch(HibernateException e) {
                System.out.print(e.getMessage());
                viewViagens.showError("Já existe um registro com essa matrícula no banco de dados"); 
                //depois de pronto, arrumar essas mensagens, pois podem não ser somente de chave duplicada .. 
            }            
        }  
        
    }  
    
    public void selectAll() {
    
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        viewTabela.getLinesJTable().clear();
        
        try {
            s.beginTransaction();
            Criteria c = s.createCriteria(Viagens.class);
            List<Viagens> alist = c.list();
            for (Viagens v : alist){
                viewTabela.add(v);
            }
        } catch (HibernateException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(viewViagens, "Erro ao extrair dados do Banco de Dados: " + e.getMessage());
        }
        
    }

    public void removeOne() {
       
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        int index = viewViagens.getjTable1().getSelectedRow();
        if (index == -1)
            return;
        Viagens v = viewTabela.select(index);
        try {
            s.beginTransaction();
            s.delete(v);
            s.getTransaction().commit();
            viewTabela.remove(index);
        } catch (HibernateException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(viewViagens, "Erro ao remover dados do Banco de Dados: " + e.getMessage());
        }

    }
    
    public void edit() {
    
        Viagens v = newFromView();
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        int index = viewViagens.getjTable1().getSelectedRow();
        if (index == -1) {
            return;
        }

        try {
            s.beginTransaction();
            s.flush();
            s.clear();
            s.update(v);
            s.getTransaction().commit();
            viewTabela.update(index, v);
        } catch (HibernateException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(viewViagens, "Erro ao atualizar dados no Banco de Dados: " + e.getMessage());
        }



    }
    
    public void selectOne() {
        
        int index = viewViagens.getjTable1().getSelectedRow();
        if (index == -1)
            return;
        Viagens v = viewTabela.select(index);
        viewViagens.getInputCodigo().setText(Integer.toString(v.getCodigo()));
        viewViagens.getInputDataChegada().setDate(v.getDataChegada());
        viewViagens.getInputDataSaida().setDate(v.getDataSaida());
        viewViagens.getInputCidadeOrigem().setText(v.getCidadeDe());
        viewViagens.getInputCidadeDestino().setText(v.getCidadeAte());
        viewViagens.getInputValor().setText(String.valueOf(v.getValor()));
        viewViagens.getComboBoxAviao().setSelectedItem(v.getAvioes());
        viewViagens.getComboBoxCliente().setSelectedItem(v.getClientes());
    }

        
    //get all values form viewalunos
    private Viagens newFromView() {
        
            Date dataSaida, dataChegada;
            String codigo, origem, destino, valor;
            Clientes c;
            Avioes a;

            codigo = viewViagens.getInputCodigo().getText();
            origem = viewViagens.getInputCidadeOrigem().getText();
            destino = viewViagens.getInputCidadeDestino().getText();
            valor = viewViagens.getInputValor().getText();
            dataSaida = viewViagens.getInputDataSaida().getDate();
            dataChegada = viewViagens.getInputDataChegada().getDate();
            c = (Clientes) viewViagens.getComboBoxCliente().getSelectedItem();
            a = (Avioes) viewViagens.getComboBoxAviao().getSelectedItem();
            

            if (codigo.isEmpty() || origem.isEmpty() || dataSaida == null || destino.isEmpty() || dataChegada == null) {
                viewViagens.showError("Todos os campos devem ser preenchidos");
                return null;
            } else {

                Viagens v = new Viagens(Integer.parseInt(codigo), a, c, dataSaida, dataChegada, origem, destino, Float.parseFloat(valor));
                clearFields();
                return v;

            }


    }
    
    public void clearFields(){
        
        viewViagens.getInputCodigo().setText("");
        viewViagens.getInputCidadeDestino().setText("");
        viewViagens.getInputCidadeOrigem().setText("");
        viewViagens.getInputDataChegada().setDate(null);
        viewViagens.getInputDataSaida().setDate(null);
        viewViagens.getInputValor().setText("");
        viewViagens.getComboBoxAviao().setSelectedIndex(-1);
        viewViagens.getComboBoxCliente().setSelectedIndex(-1);
        
    }
    
    public void populateComboBoxs(){
        
        viewViagens.getComboBoxAviao().removeAllItems();
        viewViagens.getComboBoxCliente().removeAllItems();
        
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        
        try {
            s.beginTransaction();
            Criteria cc = s.createCriteria(Clientes.class);
            Criteria ca = s.createCriteria(Avioes.class);
            List<Clientes> clist = cc.list();
            List<Avioes> alist = ca.list();
            for (Clientes c : clist){
                viewViagens.getComboBoxCliente().addItem(c);
            }
            for (Avioes a : alist){
                viewViagens.getComboBoxAviao().addItem(a);
            }
        } catch (HibernateException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(viewViagens, "Erro ao popular comboBoxes: " + e.getMessage());
        }
        
    }

    
    //getters and setters
    public void setViewViagens(JFrameCadViagens viewViagens) {
        this.viewViagens = viewViagens;
    }
    
    public TableModelViagens getViewTabela() {
        return viewTabela;
    }




}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Util.HibernateUtil;
import java.util.List;
import java.util.Locale.Category;
import javax.swing.JOptionPane;
import model.Clientes;
import model.TableModelClientes;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.classic.Session;
import view.JFrameCadClientes;

/**
 *
 * @author evandro, gabriel, luiz felipe, adriano
 */
public class ControllerClientes {
    
    private JFrameCadClientes viewClientes;
    private TableModelClientes viewTabela;
    private Clientes alunos;
    
    public ControllerClientes (JFrameCadClientes viewClientes, TableModelClientes t) {
        this.viewClientes = viewClientes;        
        viewTabela = t;
    }
    
    public void save() {
        
        Clientes clientes = newFromView();
        if(clientes == null) {
            return;            
        } else {
           // alunos.toString();
            
            Session s = HibernateUtil.getSessionFactory().getCurrentSession();              
        
            try {
                s.beginTransaction();
                s.save(clientes);
                s.getTransaction().commit();
                viewTabela.add(clientes); //tem que mudar isso pra um select
            } catch(HibernateException e) {
                System.out.print(e.getMessage());
                viewClientes.showError("Já existe um registro com essa matrícula no banco de dados"); 
                //depois de pronto, arrumar essas mensagens, pois podem não ser somente de chave duplicada .. 
            }            
        }  
        
    }  
    
    public void selectAll() {
    
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        viewTabela.getLinesJTable().clear();
        
        try {
            s.beginTransaction();
            Criteria c = s.createCriteria(Clientes.class);
            List<Clientes> clist = c.list();
            for (Clientes a : clist){
                viewTabela.add(a);
            }
        } catch (HibernateException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(viewClientes, "Erro ao extrair dados do Banco de Dados: " + e.getMessage());
        }
        
    }

    public void removeOne() {
       
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        int index = viewClientes.getjTable1().getSelectedRow();
        if (index == -1)
            return;
        Clientes a = viewTabela.select(index);
        try {
            s.beginTransaction();
            s.delete(a);
            s.getTransaction().commit();
            viewTabela.remove(index);
        } catch (HibernateException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(viewClientes, "Erro ao remover dados do Banco de Dados: " + e.getMessage());
        }

    }
    
    public void edit() {
    
        Clientes a = newFromView();
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        int index = viewClientes.getjTable1().getSelectedRow();
        if (index == -1) {
            return;
        }

        try {
            s.beginTransaction();
            s.flush();
            s.clear();
            s.update(a);
            s.getTransaction().commit();
            viewTabela.update(index, a);
        } catch (HibernateException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(viewClientes, "Erro ao atualizar dados no Banco de Dados: " + e.getMessage());
        }



    }
    
    public void selectOne() {
        
        int index = viewClientes.getjTable1().getSelectedRow();
        if (index == -1)
            return;
        Clientes c = viewTabela.select(index);
        viewClientes.getInputCodigo().setText(String.valueOf(c.getCodigo()));
        viewClientes.getInputEndereco().setText(c.getEndereco());
        viewClientes.getInputTelefone().setText(c.getTelefone());
        viewClientes.getInputNome().setText(c.getNome());
        
    }

        
    //get all values form viewalunos
    private Clientes newFromView() {
        
        int cod;
        String name, address, phone, bloodtype; 
        cod = Integer.parseInt((viewClientes.getInputCodigo()).getText());
        name = viewClientes.getInputNome().getText();
        address = viewClientes.getInputEndereco().getText();
        phone = viewClientes.getInputTelefone().getText();
        
        if(name.isEmpty() || address.isEmpty() || phone.isEmpty()) {
            viewClientes.showError("Todos os campos devem ser preenchidos");
            return null;
        } else {
            Clientes a = new Clientes(cod, name, address, phone);
            clearFields();
            return a;
        }    
        
    }
    
    public void clearFields(){
        
        viewClientes.getInputCodigo().setText("");
        viewClientes.getInputNome().setText("");
        viewClientes.getInputTelefone().setText("");
        viewClientes.getInputEndereco().setText("");
        
    }

    
    //getters and setters
    public void setViewClientes(JFrameCadClientes viewC) {
        this.viewClientes = viewC;
    }
    
    public TableModelClientes getViewTabela() {
        return viewTabela;
    }




}

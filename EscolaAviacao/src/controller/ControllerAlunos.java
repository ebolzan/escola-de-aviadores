/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Util.HibernateUtil;
import java.util.List;
import java.util.Locale.Category;
import javax.swing.JOptionPane;
import model.Alunos;
import model.TableModelAlunos;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.classic.Session;
import view.JFrameCadAlunos;

/**
 *
 * @author evandro, gabriel, luiz felipe, adriano
 */
public class ControllerAlunos {
    
    private JFrameCadAlunos viewAlunos;
    private TableModelAlunos viewTabela;
    private Alunos alunos;
    
    public ControllerAlunos(JFrameCadAlunos viewAlunos, TableModelAlunos t) {
        this.viewAlunos = viewAlunos;        
        viewTabela = t;
    }
    
    public void save() {
        
        Alunos alunos = newFromView();
        if(alunos == null) {
            return;            
        } else {
           // alunos.toString();
            
            Session s = HibernateUtil.getSessionFactory().getCurrentSession();              
        
            try {
                s.beginTransaction();
                s.save(alunos);
                s.getTransaction().commit();
                viewTabela.add(alunos); //tem que mudar isso pra um select
            } catch(HibernateException e) {
                System.out.print(e.getMessage());
                viewAlunos.showError("Já existe um registro com essa matrícula no banco de dados"); 
                //depois de pronto, arrumar essas mensagens, pois podem não ser somente de chave duplicada .. 
            }            
        }  
        
    }  
    
    public void selectAll() {
    
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        viewTabela.getLinesJTable().clear();
        
        try {
            s.beginTransaction();
            Criteria c = s.createCriteria(Alunos.class);
            List<Alunos> alist = c.list();
            for (Alunos a : alist){
                viewTabela.add(a);
            }
        } catch (HibernateException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(viewAlunos, "Erro ao extrair dados do Banco de Dados: " + e.getMessage());
        }
        
    }

    public void removeOne() {
       
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        int index = viewAlunos.getjTable1().getSelectedRow();
        if (index == -1)
            return;
        Alunos a = viewTabela.select(index);
        try {
            s.beginTransaction();
            s.delete(a);
            s.getTransaction().commit();
            viewTabela.remove(index);
        } catch (HibernateException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(viewAlunos, "Erro ao remover dados do Banco de Dados: " + e.getMessage());
        }

    }
    
    public void edit() {
    
        Alunos a = newFromView();
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        int index = viewAlunos.getjTable1().getSelectedRow();
        if (index == -1) {
            return;
        }

        try {
            s.beginTransaction();
            s.merge(a);
            viewTabela.update(index, a);
        } catch (HibernateException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(viewAlunos, "Erro ao atualizar dados no Banco de Dados: " + e.getMessage());
        }



    }
    
    public void selectOne() {
        
        int index = viewAlunos.getjTable1().getSelectedRow();
        if (index == -1)
            return;
        Alunos a = viewTabela.select(index);
        viewAlunos.getInputMatricula().setText(Integer.toString(a.getMatricula()));
        viewAlunos.getInputEndereco().setText(a.getEndereco());
        viewAlunos.getInputTipoSanguineo().setText(a.getTipoSangue());
        viewAlunos.getInputTelefone().setText(a.getTelefone());
        viewAlunos.getInputNome().setText(a.getNome());
        
    }

        
    //get all values form viewalunos
    private Alunos newFromView() {
        
        String registration, name, address, phone, bloodtype; 
        registration = viewAlunos.getInputMatricula().getText();
        name = viewAlunos.getInputNome().getText();
        address = viewAlunos.getInputEndereco().getText();
        phone = viewAlunos.getInputTelefone().getText();
        bloodtype = viewAlunos.getInputTipoSanguineo().getText();
        
        if(registration.isEmpty() || name.isEmpty() || address.isEmpty() || bloodtype.isEmpty()) {
            viewAlunos.showError("Todos os campos devem ser preenchidos");
            return null;
        } else {
            Alunos a = new Alunos(Integer.parseInt(registration), address, phone, bloodtype, name);
            clearFields();
            return a;
        }    
        
    }
    
    public void clearFields(){
        
        viewAlunos.getInputMatricula().setText("");
        viewAlunos.getInputMatricula().setText("");
        viewAlunos.getInputNome().setText("");
        viewAlunos.getInputTelefone().setText("");
        viewAlunos.getInputTipoSanguineo().setText("");
        viewAlunos.getInputEndereco().setText("");
        
    }

    
    //getters and setters
    public void setViewAlunos(JFrameCadAlunos viewAlunos) {
        this.viewAlunos = viewAlunos;
    }
    
    public TableModelAlunos getViewTabela() {
        return viewTabela;
    }




}

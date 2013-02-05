/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Util.HibernateUtil;
import javax.swing.JOptionPane;
import model.Alunos;
import org.hibernate.HibernateException;
import org.hibernate.classic.Session;
import view.JFrameCadAlunos;

/**
 *
 * @author evandro, gabriel, luiz felipe, adriano
 */
public class ControllerAlunos {
    
    private JFrameCadAlunos viewAlunos;
    private Alunos alunos;
    
    public ControllerAlunos(JFrameCadAlunos viewAlunos)
    {
        this.viewAlunos = viewAlunos;        
    }
    
    public void save()
    {
        Alunos alunos = newFromView();
        
        if(alunos == null)
        {
            return;            
        }
        else
        {
            //tdo 
            System.out.println("endereco "+alunos.getEndereco());
            System.out.println("nome "+alunos.getNome());
            System.out.println("matricula "+alunos.getMatricula());
            System.out.println("telefone "+alunos.getTelefone());
            System.out.println("sangue "+alunos.getTipoSangue());
            
            Session s = HibernateUtil.getSessionFactory().getCurrentSession();              
        
            try 
            {
                s.beginTransaction();
                s.save(alunos);
                s.getTransaction().commit();
            }
            catch(HibernateException e)
            {
                System.out.print(e.getMessage());
                viewAlunos.showError("deu algum erro, verifique a saída da excessão, programador"); 
                //depois de pronto, arrumar essas mensagens, pois podem não ser somente de chave duplicada .. 
            }            
        }        
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

    public void setViewAlunos(JFrameCadAlunos viewAlunos) {
        this.viewAlunos = viewAlunos;
    }
}

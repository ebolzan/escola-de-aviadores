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
    
    public ControllerAlunos(JFrameCadAlunos viewAlunos, Alunos alunos)
    {
        this.viewAlunos = viewAlunos;        
        this.alunos = alunos;
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
                viewAlunos.showError("voce esta tentando inserir uma chave duplicada");
            }            
        }        
    }   
        
    //get all values form viewalunos
    private Alunos newFromView()
    {
        String registration, name, adress, phone, bloodtype; 
        registration = viewAlunos.getInputMatricula().getText();
        name = viewAlunos.getInputNome().getText();
        adress = viewAlunos.getInputEndereco().getText();
        phone = viewAlunos.getInputTelefone().getText();
        bloodtype = viewAlunos.getInputTipoSanguineo().getText();
        
        if(registration.isEmpty() || name.isEmpty() || adress.isEmpty() || bloodtype.isEmpty())
        {
            viewAlunos.showError("Campos requeridos devem ser preenchidos");
            return null;
        }
        
        try{
            int r = Integer.parseInt(registration);
            Alunos alunos = new Alunos(r, adress, phone, name);
            
            //if bloodtype have some value
            if(!bloodtype.isEmpty())
                alunos.setTipoSangue(bloodtype);
            
            return alunos;
            
        }
        catch(NumberFormatException e)
        {
            viewAlunos.showError(e.getMessage());
            return null;
        }        
    }
    
}

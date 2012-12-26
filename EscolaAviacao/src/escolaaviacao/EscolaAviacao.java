/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package escolaaviacao;

import Util.HibernateUtil;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.Alunos;
import org.hibernate.HibernateException;
import org.hibernate.classic.Session;
import view.JFrameCadAlunos;

/**
 *
 * @author evandro
 */
public class EscolaAviacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JFrameCadAlunos  frame = new JFrameCadAlunos();
        frame.setVisible(true);
        
//        Alunos a1 = new Alunos(1220, "Santa maria", "2323 - 2323", "Evandro BOlzan");
//        a1.setTipoSangue("A+");
//        
//        Session s = HibernateUtil.getSessionFactory().getCurrentSession();              
//        
//        try 
//        {
//            s.beginTransaction();
//            s.save(a1);
//            s.getTransaction().commit();
//        }
//        catch(HibernateException e)
//        {
//            System.out.print(e.getMessage());
//            JOptionPane.showMessageDialog(null, e+"voce esta tentando inserir uma chave duplicada");
//        }                                                
    }
}

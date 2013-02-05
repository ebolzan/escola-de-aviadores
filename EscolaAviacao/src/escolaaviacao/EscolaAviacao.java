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
import view.JFramePrincipal;

/**
 *
 * @author evandro
 */
public class EscolaAviacao {


    public static void main(String[] args) {

        new JFramePrincipal().setVisible(true); 
        
/*        Alunos a1 = new Alunos(20135689, "Santa maria", "(55)9999-9999", "A+", "Evandro Bolzan");
        
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();              
        
        try {
            s.beginTransaction();
            s.save(a1);
            s.getTransaction().commit();
        }
        catch(HibernateException e) {
            e.printStackTrace();
        }   
*/
    }
}

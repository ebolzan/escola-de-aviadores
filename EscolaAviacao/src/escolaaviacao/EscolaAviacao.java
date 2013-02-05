/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package escolaaviacao;

import Util.HibernateUtil;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.Alunos;
import org.hibernate.Criteria;
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
        
/*   teste 1  - insert Hibernate*/
/*      Alunos a1 = new Alunos(20135689, "Santa maria", "(55)9999-9999", "A+", "Evandro Bolzan");
        
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
        
        /*teste 2 - select * com Hibernate usando Criteria*/
/*        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        List<Alunos> alist;
        try {
            s.beginTransaction();
            Criteria c = s.createCriteria(Alunos.class);
            alist = c.list();
            System.out.println(alist.size());
            for (Alunos a : alist){
                System.out.println(a.toString());
            }
        } catch (HibernateException e){
            e.printStackTrace();
        }
*/
    }
}

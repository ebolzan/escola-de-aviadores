/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Reports.Conexao;
import Reports.ReportUtils;
import Util.HibernateUtil;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale.Category;
import java.util.Map;
import javax.swing.JOptionPane;
import model.Avioes;
import model.TableModelAvioes;
import net.sf.jasperreports.engine.JRException;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.classic.Session;
import sun.security.jca.GetInstance;
import view.JFrameCadAvioes;

/**
 *
 * @author evandro, gabriel, luiz felipe, adriano
 */
public class ControllerAvioes {
    
    private JFrameCadAvioes viewAvioes;
    private TableModelAvioes viewTabela;
    
    public ControllerAvioes(JFrameCadAvioes viewAvioes, TableModelAvioes t) {
        this.viewAvioes = viewAvioes;        
        viewTabela = t;
    }
    
    public void save() {
        
        Avioes aviao = newFromView();
        if(aviao == null) {
            return;            
        } else {
           // aviao.toString();
            
            Session s = HibernateUtil.getSessionFactory().getCurrentSession();              
        
            try {
                s.beginTransaction();
                s.save(aviao);
                s.getTransaction().commit();
                viewTabela.add(aviao); 
            } catch(HibernateException e) {
                System.out.print(e.getMessage());
                viewAvioes.showError("Já existe um registro com essa matrícula no banco de dados"); 
                //depois de pronto, arrumar essas mensagens, pois podem não ser somente de chave duplicada .. 
            }            
        }  
        
    }  
    
    public void selectAll() {
    
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        viewTabela.getLinesJTable().clear();
        
        try {
            s.beginTransaction();
            Criteria c = s.createCriteria(Avioes.class);
            List<Avioes> alist = c.list();
            for (Avioes a : alist){
                viewTabela.add(a);
            }
        } catch (HibernateException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(viewAvioes, "Erro ao extrair dados do Banco de Dados: " + e.getMessage());
        }
        
    }

    public void removeOne() {
       
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        int index = viewAvioes.getjTable1().getSelectedRow();
        if (index == -1)
            return;
        Avioes a = viewTabela.select(index);
        try {
            s.beginTransaction();
            s.delete(a);
            s.getTransaction().commit();
            viewTabela.remove(index);
        } catch (HibernateException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(viewAvioes, "Erro ao remover dados do Banco de Dados: " + e.getMessage());
        }

    }
    
    public void edit() {
    
        Avioes a = newFromView();
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        int index = viewAvioes.getjTable1().getSelectedRow();
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
            JOptionPane.showMessageDialog(viewAvioes, "Erro ao atualizar dados no Banco de Dados: " + e.getMessage());
        }



    }
    
    public void selectOne() {
        
        int index = viewAvioes.getjTable1().getSelectedRow();
        if (index == -1)
            return;
        Avioes a = viewTabela.select(index);
        viewAvioes.getInputCodigo().setText(Integer.toString(a.getCodigo()));
        viewAvioes.getInputDataFab().setDate(a.getAnoFab());
        viewAvioes.getInputDataManut().setDate(a.getDataManut());
        viewAvioes.getInputDescricao().setText(a.getDescricao());
        viewAvioes.getInputMarca().setText(a.getMarca());
        
    }

        
    //get all values form viewalunos
    private Avioes newFromView() {
        
            Date dataFab, dataManu;
            String codigo, marca, descricao;

            codigo = viewAvioes.getInputCodigo().getText();
            marca = viewAvioes.getInputMarca().getText();
            dataFab = viewAvioes.getInputDataFab().getDate();
            dataManu = viewAvioes.getInputDataManut().getDate();
            descricao = viewAvioes.getInputDescricao().getText();

            if (codigo.isEmpty() || marca.isEmpty() || dataFab == null || descricao.isEmpty() || dataManu == null) {
                viewAvioes.showError("Todos os campos devem ser preenchidos");
                return null;
            } else {

                Avioes a = new Avioes(Integer.parseInt(codigo), marca, dataManu, descricao, dataFab);
                clearFields();
                return a;

            }


    }
    
    public void clearFields(){
        
        viewAvioes.getInputCodigo().setText("");
        viewAvioes.getInputMarca().setText("");
        viewAvioes.getInputDescricao().setText("");
        viewAvioes.getInputDataFab().setDate(null);
        viewAvioes.getInputDataManut().setDate(null);
        
    }

    
    //getters and setters
    public void setViewAvioes(JFrameCadAvioes viewAvioes) {
        this.viewAvioes = viewAvioes;
    }
    
    public TableModelAvioes getViewTabela() {
        return viewTabela;
    }


}

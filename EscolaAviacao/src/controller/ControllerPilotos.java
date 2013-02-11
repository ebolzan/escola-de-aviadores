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
import model.Pilotos;
import model.TableModelPilotos;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.classic.Session;
import view.JFrameCadPilotos;

/**
 *
 * @author evandro, gabriel, luiz felipe, adriano
 */
public class ControllerPilotos {
    
    private JFrameCadPilotos viewPilotos;
    private TableModelPilotos viewTabela;
    
    public ControllerPilotos (JFrameCadPilotos viewPiloto, TableModelPilotos t) {
        this.viewPilotos = viewPiloto;        
        viewTabela = t;
    }
    
    public void save() {
        
        Pilotos pilotos = newFromView();
        if(pilotos == null) {
            return;            
        } else {
            Session s = HibernateUtil.getSessionFactory().getCurrentSession();              
        
            try {
                s.beginTransaction();
                s.save(pilotos);
                s.getTransaction().commit();
                viewTabela.add(pilotos); //tem que mudar isso pra um select
            } catch(HibernateException e) {
                System.out.print(e.getMessage());
                viewPilotos.showError("Já existe um registro com esse Breve no banco de dados"); 
                //depois de pronto, arrumar essas mensagens, pois podem não ser somente de chave duplicada .. 
            }            
        }  
        
    }  
    
    public void selectAll() {
    
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        viewTabela.getLinesJTable().clear();
        
        try {
            s.beginTransaction();
            Criteria c = s.createCriteria(Pilotos.class);
            List<Pilotos> clist = c.list();
            for (Pilotos a : clist){
                viewTabela.add(a);
            }
        } catch (HibernateException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(viewPilotos, "Erro ao extrair dados do Banco de Dados: " + e.getMessage());
        }
        
    }

    public void removeOne() {
       
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        int index = viewPilotos.getjTable1().getSelectedRow();
        if (index == -1)
            return;
        Pilotos a = viewTabela.select(index);
        try {
            s.beginTransaction();
            s.delete(a);
            s.getTransaction().commit();
            viewTabela.remove(index);
        } catch (HibernateException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(viewPilotos, "Erro ao remover dados do Banco de Dados: " + e.getMessage());
        }

    }
    
    public void edit() {
    
        Pilotos a = newFromView();
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        int index = viewPilotos.getjTable1().getSelectedRow();
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
            JOptionPane.showMessageDialog(viewPilotos, "Erro ao atualizar dados no Banco de Dados: " + e.getMessage());
        }



    }
    
    public void selectOne() {
        
        int index = viewPilotos.getjTable1().getSelectedRow();
        if (index == -1)
            return;
        Pilotos p = viewTabela.select(index);
        viewPilotos.getInputBreve().setText(String.valueOf(p.getBreve()));
        viewPilotos.getInputEndereco().setText(p.getEndereco());
        viewPilotos.getInputCidade().setText(p.getCidade());
        viewPilotos.getInputNome().setText(p.getNome());
        
    }

        
    //get all values form viewalunos
    private Pilotos newFromView() {
        
        String breve, nome, endereco, cidade;
        breve = viewPilotos.getInputBreve().getText();
        nome = viewPilotos.getInputNome().getText();
        endereco = viewPilotos.getInputEndereco().getText();
        cidade = viewPilotos.getInputCidade().getText();
        
        if(nome.isEmpty() || endereco.isEmpty() || cidade.isEmpty() || breve.isEmpty()) {
            System.out.println("entrou pra dar msg de erro");
            viewPilotos.showError("Todos os campos devem ser preenchidos");
            return null;
        } else {
            System.out.println("piloto tah null, mas tah como cheio");
            Pilotos p = new Pilotos(Integer.parseInt(breve), endereco, cidade, nome);
            clearFields();
            return p;
        }    
        
    }
    
    public void clearFields(){
        
        viewPilotos.getInputBreve().setText("");
        viewPilotos.getInputNome().setText("");
        viewPilotos.getInputCidade().setText("");
        viewPilotos.getInputEndereco().setText("");
        
    }

    
    //getters and setters
    public void setViewPilotos(JFrameCadPilotos viewP) {
        this.viewPilotos = viewP;
    }
    
    public TableModelPilotos getViewTabela() {
        return viewTabela;
    }




}

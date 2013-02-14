/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Reports.Conexao;
import Reports.ReportUtils;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;

/**
 *
 * @author Gabriel Lunardi
 */

public class ControllerReports {
    
        public void generateReportAllLearners(){
        
        InputStream inputStream = getClass().getResourceAsStream( "/TodosAlunos.jasper" );
        Map parametros = new HashMap();
        try {
            ReportUtils.openReport("Todos os alunos cadastrados", inputStream, parametros, Conexao.abrir());
        } catch (JRException er){
            er.printStackTrace();
        }
        
    }
        
        
    public void generateReportMaisAntigosbyMarca() {
        
        InputStream inputStream = getClass().getResourceAsStream( "/AviaoMaisAntigoCadaMarca.jasper" );
        Map parametros = new HashMap();
        try {
            ReportUtils.openReport("Todos os alunos cadastrados", inputStream, parametros, Conexao.abrir());
        } catch (JRException er){
            er.printStackTrace();
        }
        
    }
    
    
        public void generateReportViagensAirBusPlanes() {
       
        InputStream inputStream = getClass().getResourceAsStream( "/ClientesViajaram-AvioesAirBus.jasper" );
        Map parametros = new HashMap();
        try {
            ReportUtils.openReport("Todos os alunos cadastrados", inputStream, parametros, Conexao.abrir());
        } catch (JRException er){
            er.printStackTrace();
        }
        
    }

    public void generateReportViagensStaMariaOrPoA() {
        
        InputStream inputStream = getClass().getResourceAsStream( "/Destinos-StaMariaOrPoA.jasper" );
        Map parametros = new HashMap();
        try {
            ReportUtils.openReport("Todos os alunos cadastrados", inputStream, parametros, Conexao.abrir());
        } catch (JRException er){
            er.printStackTrace();
        }
        
    }

    public void generateReportAvioesManutJanViagemEntre() {
        
        InputStream inputStream = getClass().getResourceAsStream( "/AvioesManutJanOUViagemEntre.jasper" );
        Map parametros = new HashMap();
        try {
            ReportUtils.openReport("Todos os alunos cadastrados", inputStream, parametros, Conexao.abrir());
        } catch (JRException er){
            er.printStackTrace();
        }
        
    }
    
}

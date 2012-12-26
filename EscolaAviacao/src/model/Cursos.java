package model;
// Generated 24/12/2012 17:12:09 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Cursos generated by hbm2java
 */
public class Cursos  implements java.io.Serializable {


     private int codigo;
     private String nome;
     private Set instituicoeses = new HashSet(0);
     private Set instrutorescursoses = new HashSet(0);

    public Cursos() {
    }

	
    public Cursos(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }
    public Cursos(int codigo, String nome, Set instituicoeses, Set instrutorescursoses) {
       this.codigo = codigo;
       this.nome = nome;
       this.instituicoeses = instituicoeses;
       this.instrutorescursoses = instrutorescursoses;
    }
   
    public int getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Set getInstituicoeses() {
        return this.instituicoeses;
    }
    
    public void setInstituicoeses(Set instituicoeses) {
        this.instituicoeses = instituicoeses;
    }
    public Set getInstrutorescursoses() {
        return this.instrutorescursoses;
    }
    
    public void setInstrutorescursoses(Set instrutorescursoses) {
        this.instrutorescursoses = instrutorescursoses;
    }




}



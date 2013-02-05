package model;
// Generated 24/12/2012 17:12:09 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Alunos generated by hbm2java
 */
public class Alunos  implements java.io.Serializable {


     private int matricula;
     private String endereco;
     private String telefone;
     private String tipoSangue;
     private String nome;
     private Set aulases = new HashSet(0);

    public Alunos() {
    }

	
    public Alunos(int matricula, String endereco, String telefone, String tipoSangue, String nome) {
        this.matricula = matricula;
        this.endereco = endereco;
        this.telefone = telefone;
        this.tipoSangue = tipoSangue;
        this.nome = nome;
    }
    public Alunos(int matricula, String endereco, String telefone, String tipoSangue, String nome, Set aulases) {
       this.matricula = matricula;
       this.endereco = endereco;
       this.telefone = telefone;
       this.tipoSangue = tipoSangue;
       this.nome = nome;
       this.aulases = aulases;
    }
   
    public int getMatricula() {
        return this.matricula;
    }
    
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getEndereco() {
        return this.endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getTelefone() {
        return this.telefone;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getTipoSangue() {
        return this.tipoSangue;
    }
    
    public void setTipoSangue(String tipoSangue) {
        this.tipoSangue = tipoSangue;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Set getAulases() {
        return this.aulases;
    }
    
    public void setAulases(Set aulases) {
        this.aulases = aulases;
    }




}



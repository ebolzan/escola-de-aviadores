package model;
// Generated 24/12/2012 17:12:09 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Pilotos generated by hbm2java
 */
public class Pilotos  implements java.io.Serializable {


     private int breve;
     private String endereco;
     private String cidade;
     private String nome;
     private Set instrutoreses = new HashSet(0);
     private Set viagenses = new HashSet(0);
     private Set instrutorescursoses = new HashSet(0);

    public Pilotos() {
    }

	
    public Pilotos(int breve, String endereco, String cidade, String nome) {
        this.breve = breve;
        this.endereco = endereco;
        this.cidade = cidade;
        this.nome = nome;
    }
    public Pilotos(int breve, String endereco, String cidade, String nome, Set instrutoreses, Set viagenses, Set instrutorescursoses) {
       this.breve = breve;
       this.endereco = endereco;
       this.cidade = cidade;
       this.nome = nome;
       this.instrutoreses = instrutoreses;
       this.viagenses = viagenses;
       this.instrutorescursoses = instrutorescursoses;
    }
   
    public int getBreve() {
        return this.breve;
    }
    
    public void setBreve(int breve) {
        this.breve = breve;
    }
    public String getEndereco() {
        return this.endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getCidade() {
        return this.cidade;
    }
    
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Set getInstrutoreses() {
        return this.instrutoreses;
    }
    
    public void setInstrutoreses(Set instrutoreses) {
        this.instrutoreses = instrutoreses;
    }
    public Set getViagenses() {
        return this.viagenses;
    }
    
    public void setViagenses(Set viagenses) {
        this.viagenses = viagenses;
    }
    public Set getInstrutorescursoses() {
        return this.instrutorescursoses;
    }
    
    public void setInstrutorescursoses(Set instrutorescursoses) {
        this.instrutorescursoses = instrutorescursoses;
    }




}



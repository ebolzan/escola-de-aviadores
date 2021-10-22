package model;
// Generated 24/12/2012 17:12:09 by Hibernate Tools 3.2.1.GA


import java.util.Date;

/**
 * Aulas generated by hbm2java
 */
public class Aulas  implements java.io.Serializable {


     private int codigo;
     private Avioes avioes;
     private Alunos alunos;
     private Instrutores instrutores;
     private Date data;
     private Date horaSaida;
     private Date horaChegada;

    public Aulas() {
    }

    public Aulas(int codigo, Avioes avioes, Alunos alunos, Instrutores instrutores, Date data, Date horaSaida, Date horaChegada) {
       this.codigo = codigo;
       this.avioes = avioes;
       this.alunos = alunos;
       this.instrutores = instrutores;
       this.data = data;
       this.horaSaida = horaSaida;
       this.horaChegada = horaChegada;
    }
   
    public int getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public Avioes getAvioes() {
        return this.avioes;
    }
    
    public void setAvioes(Avioes avioes) {
        this.avioes = avioes;
    }
    public Alunos getAlunos() {
        return this.alunos;
    }
    
    public void setAlunos(Alunos alunos) {
        this.alunos = alunos;
    }
    public Instrutores getInstrutores() {
        return this.instrutores;
    }
    
    public void setInstrutores(Instrutores instrutores) {
        this.instrutores = instrutores;
    }
    public Date getData() {
        return this.data;
    }
    
    public void setData(Date data) {
        this.data = data;
    }
    public Date getHoraSaida() {
        return this.horaSaida;
    }
    
    public void setHoraSaida(Date horaSaida) {
        this.horaSaida = horaSaida;
    }
    public Date getHoraChegada() {
        return this.horaChegada;
    }
    
    public void setHoraChegada(Date horaChegada) {
        this.horaChegada = horaChegada;
    }




}


package model;
// Generated 24/12/2012 17:12:09 by Hibernate Tools 3.2.1.GA


import java.util.Date;

/**
 * InstrutorescursosId generated by hbm2java
 */
public class InstrutorescursosId  implements java.io.Serializable {


     private Date dataDiploma;
     private int codigoCurso;

    public InstrutorescursosId() {
    }

    public InstrutorescursosId(Date dataDiploma, int codigoCurso) {
       this.dataDiploma = dataDiploma;
       this.codigoCurso = codigoCurso;
    }
   
    public Date getDataDiploma() {
        return this.dataDiploma;
    }
    
    public void setDataDiploma(Date dataDiploma) {
        this.dataDiploma = dataDiploma;
    }
    public int getCodigoCurso() {
        return this.codigoCurso;
    }
    
    public void setCodigoCurso(int codigoCurso) {
        this.codigoCurso = codigoCurso;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof InstrutorescursosId) ) return false;
		 InstrutorescursosId castOther = ( InstrutorescursosId ) other; 
         
		 return ( (this.getDataDiploma()==castOther.getDataDiploma()) || ( this.getDataDiploma()!=null && castOther.getDataDiploma()!=null && this.getDataDiploma().equals(castOther.getDataDiploma()) ) )
 && (this.getCodigoCurso()==castOther.getCodigoCurso());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getDataDiploma() == null ? 0 : this.getDataDiploma().hashCode() );
         result = 37 * result + this.getCodigoCurso();
         return result;
   }   


}



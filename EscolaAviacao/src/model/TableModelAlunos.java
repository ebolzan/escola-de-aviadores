/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Gabriel Lunardi
 */

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TableModelAlunos extends AbstractTableModel {

    private static final String[] columnNames = {"Matricula", "Nome", "Endereço", "Telefone", "Sangue"};
    private List<Alunos> linesJTable; //como list eh uma interface, fica mais facil de usar polimorfismo 
    
    public TableModelAlunos(){
        linesJTable = new ArrayList<Alunos>(); //arrayList implementa essa interface
    }
    
    public void remove(int index) {
	linesJTable.remove(index);
	fireTableRowsDeleted(index, index);
    }

    public Alunos select(int index) {
        return linesJTable.get(index);
    }
    
    public void add(Alunos a) {
        // Adds the element in the last position in the list
        linesJTable.add(a);
        fireTableRowsInserted(linesJTable.size()-1, linesJTable.size()-1);
    }

    public void update(int index, Alunos a) {
        linesJTable.set(index, a);
        fireTableRowsUpdated(index, index);
    }
    
    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return columnNames[columnIndex];
    }

    @Override
    public int getRowCount() {
        return linesJTable.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex) {
            case 0: return linesJTable.get(rowIndex).getMatricula();
            case 1: return linesJTable.get(rowIndex).getNome();
            case 2: return linesJTable.get(rowIndex).getEndereco();
            case 3: return linesJTable.get(rowIndex).getTelefone();
            case 4: return linesJTable.get(rowIndex).getTipoSangue();   
        }
        return null;
    }
    
    //getters and setters
    public List<Alunos> getLinesJTable() {
        return linesJTable;
    }
    
}

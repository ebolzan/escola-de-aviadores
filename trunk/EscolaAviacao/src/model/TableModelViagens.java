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

public class TableModelViagens extends AbstractTableModel {

    private static final String[] columnNames = {"Codigo", "Saída", "Chegada", "Origem", "Destino", "Valor", "Avião", "Cliente"};
    private List<Viagens> linesJTable; //como list eh uma interface, fica mais facil de usar polimorfismo 
    
    public TableModelViagens(){
        linesJTable = new ArrayList<Viagens>(); //arrayList implementa essa interface
    }
    
    public void remove(int index) {
	linesJTable.remove(index);
	fireTableRowsDeleted(index, index);
    }

    public Viagens select(int index) {
        return linesJTable.get(index);
    }
    
    public void add(Viagens a) {
        // Adds the element in the last position in the list
        linesJTable.add(a);
        fireTableRowsInserted(linesJTable.size()-1, linesJTable.size()-1);
    }

    public void update(int index, Viagens a) {
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
            case 0: return linesJTable.get(rowIndex).getCodigo();
            case 1: return linesJTable.get(rowIndex).getDataSaida(); 
            case 2: return linesJTable.get(rowIndex).getDataChegada();
            case 3: return linesJTable.get(rowIndex).getCidadeDe();
            case 4: return linesJTable.get(rowIndex).getCidadeAte();
            case 5: return linesJTable.get(rowIndex).getValor();
            case 6: return linesJTable.get(rowIndex).getAvioes();
            case 7: return linesJTable.get(rowIndex).getClientes(); 
        }
        return null;
    }
    
    //getters and setters
    public List<Viagens> getLinesJTable() {
        return linesJTable;
    }
    
}

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

public class TableModelAvioes extends AbstractTableModel {

    private static final String[] columnNames = {"Codigo", "Marca", "Manutenção", "Fabricação", "Descrição"};
    private List<Avioes> linesJTable; //como list eh uma interface, fica mais facil de usar polimorfismo 
    
    public TableModelAvioes(){
        linesJTable = new ArrayList<Avioes>(); //arrayList implementa essa interface
    }
    
    public void remove(int index) {
	linesJTable.remove(index);
	fireTableRowsDeleted(index, index);
    }

    public Avioes select(int index) {
        return linesJTable.get(index);
    }
    
    public void add(Avioes a) {
        // Adds the element in the last position in the list
        linesJTable.add(a);
        fireTableRowsInserted(linesJTable.size()-1, linesJTable.size()-1);
    }

    public void update(int index, Avioes a) {
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
            case 1: return linesJTable.get(rowIndex).getMarca();
            case 2: return linesJTable.get(rowIndex).getDataManut();
            case 3: return linesJTable.get(rowIndex).getAnoFab();
            case 4: return linesJTable.get(rowIndex).getDescricao();   
        }
        return null;
    }
    
    //getters and setters
    public List<Avioes> getLinesJTable() {
        return linesJTable;
    }
    
}

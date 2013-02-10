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

public class TableModelClientes extends AbstractTableModel {

    private static final String[] columnNames = {"Código", "Nome", "Endereço", "Telefone"};
    private List<Clientes> linesJTable; //como list eh uma interface, fica mais facil de usar polimorfismo 
    
    public TableModelClientes(){
        linesJTable = new ArrayList<Clientes>(); //arrayList implementa essa interface
    }
    
    public void remove(int index) {
	linesJTable.remove(index);
	fireTableRowsDeleted(index, index);
    }

    public Clientes select(int index) {
        return linesJTable.get(index);
    }
    
    public void add(Clientes a) {
        // Adds the element in the last position in the list
        linesJTable.add(a);
        fireTableRowsInserted(linesJTable.size()-1, linesJTable.size()-1);
    }

    public void update(int index, Clientes a) {
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
            case 1: return linesJTable.get(rowIndex).getNome();
            case 2: return linesJTable.get(rowIndex).getEndereco();
            case 3: return linesJTable.get(rowIndex).getTelefone();
        }
        return null;
    }
    
    //getters and setters
    public List<Clientes> getLinesJTable() {
        return linesJTable;
    }
    
}

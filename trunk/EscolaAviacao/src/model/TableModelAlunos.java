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
import javax.swing.table.AbstractTableModel;

public class TableModelAlunos extends AbstractTableModel {

    private static final String[] columnNames = {"Matricula", "Nome", "Endereço", "Telefone", "Sangue"};
    private ArrayList<Alunos> lines;
    
    public TableModelAlunos(){
        lines = new ArrayList<Alunos>();
    }
    
public void remove(int index) {
	lines.remove(index);
	fireTableRowsDeleted(index, index);
    }

    public Alunos select(int index) {
        return lines.get(index);
    }
    
    public void add(Alunos a) {
        // Adds the element in the last position in the list
        lines.add(a);
        System.out.print("testando, entrou no add da tableModelAluno");
        fireTableRowsInserted(lines.size()-1, lines.size()-1);
    }

    public void update(int index, Alunos a) {
        lines.set(index, a);
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
        return lines.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex) {
            case 0: return lines.get(rowIndex).getMatricula();
            case 1: return lines.get(rowIndex).getNome();
            case 2: return lines.get(rowIndex).getEndereco();
            case 3: return lines.get(rowIndex).getTelefone();
            case 4: return lines.get(rowIndex).getTipoSangue();   
        }
        return null;
    }
    
}

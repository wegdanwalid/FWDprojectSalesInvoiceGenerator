/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.InvoiceHeader;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class HeaderTableModel extends DefaultTableModel {
    
    private String[] colsNames = {"No.", "Customer", "Date", "Total"};
    private ArrayList<InvoiceHeader> invoices;
    
    public HeaderTableModel(ArrayList<InvoiceHeader> invoices) {
        this.invoices = invoices;
        this.colsNames = colsNames;
    }
    
    @Override
    public int  getColumnCount() {
        return colsNames.length;
    }
    
    @Override
    public String getColumnName(int column) {
        return colsNames[column];
    }
    
    @Override
    public void removeRow(int row) {
    invoices.remove(row);
    }
  
    @Override
    public int getRowCount() {
        if(this.invoices == null){
            invoices = new ArrayList<>();
        }
        return invoices.size();
        }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        InvoiceHeader inv = invoices.get(rowIndex);
        switch (columnIndex) {
            case 0: return inv.getNum();
            case 1: return inv.getCustName();
            case 2: return inv.getDate();
            case 3: return inv.getInvTotal();
        }
        return "";
    }

    public ArrayList<InvoiceHeader> getInvoices() {
        return invoices;
    }

   

   
    
    
}

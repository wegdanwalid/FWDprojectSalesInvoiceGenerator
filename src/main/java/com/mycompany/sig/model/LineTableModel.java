/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sig.model;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class LineTableModel extends DefaultTableModel {
    
    String[] colsNames = {"Item Name", "Item Price", "Count", "Item Total"};
    ArrayList<InvoiceLine> invoices;
    
    public LineTableModel(ArrayList<InvoiceLine> invoices) {
        
        this.invoices = invoices;
    }
    
    @Override
    public Object getValueAt(int row, int column) {
 
        InvoiceLine inv = invoices.get(row);
        switch (column) {
            case 0:
                return inv.getProduct();
            case 1:
                return inv.getPrice();
            case 2:
                return inv.getCount();
            case 3:
                return inv.getLineTotal();
 
        }
        return null;
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
    public int getRowCount() {
        if(this.invoices == null){
            invoices = new ArrayList<>();
        }
        return invoices.size();
        }
    @Override
    public void removeRow(int row) {
        invoices.remove(row);
    }
    public ArrayList<InvoiceLine> getInvoices() {
        return invoices;
    }
}

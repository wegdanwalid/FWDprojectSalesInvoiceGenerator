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
public class HeaderTableModel extends DefaultTableModel {
    
    String[] colsNames = {"No.", "Customer", "Date", "Total"};
    ArrayList<InvoiceHeader> invoices;
    
    public HeaderTableModel(ArrayList<InvoiceHeader> invoices) {
        this.invoices = invoices;
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
    public Object getValueAt(int rowIndex, int columnIndex) {
        InvoiceHeader row = invoices.get(rowIndex);
        switch (columnIndex) {
            case 0: return row.getNum();
            case 1: return row.getCustName();
            case 2: return row.getDate();
            case 3: return row.getInvTotal();
        }
        return "";
    }

    public ArrayList<InvoiceHeader> getInvoices() {
        return invoices;
    }

   

   
    
    
}

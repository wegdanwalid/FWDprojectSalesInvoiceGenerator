/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.sig;

import com.mycompany.sig.model.HeaderTableModel;
import com.mycompany.sig.model.InvoiceHeader;
import com.mycompany.sig.model.InvoiceLine;
import com.mycompany.sig.model.LineTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


/**
 *
 * @author Lenovo
 */
public class NewJFrame extends javax.swing.JFrame implements ActionListener, ListSelectionListener {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        headerTable = new javax.swing.JTable();
        headerTable.getSelectionModel().addListSelectionListener(this);
        jScrollPane2 = new javax.swing.JScrollPane();
        lineTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        invNumLbl = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        invDateTF = new javax.swing.JTextField();
        invTotalLbl = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton1.addActionListener(this);
        jButton2 = new javax.swing.JButton();
        jButton2.addActionListener(this);
        insertItemBtn = new javax.swing.JButton();
        insertItemBtn.addActionListener(this);
        jButton4 = new javax.swing.JButton();
        jButton4.addActionListener(this);
        custNameTF = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        loadFileMenuItem = new javax.swing.JMenuItem();
        loadFileMenuItem.setActionCommand("load");
        loadFileMenuItem.addActionListener(this);
        saveFileMenuItem = new javax.swing.JMenuItem();
        saveFileMenuItem.setActionCommand("save");
        saveFileMenuItem.addActionListener(this);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        headerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No.", "Customer", "Date", "Total"
            }
        ));
        headerTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(headerTable);

        lineTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No.", "Item Name", "Item Price", "Count", "Item Total"
            }
        ));
        lineTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(lineTable);

        jLabel1.setText("Invoices Table");

        jLabel2.setText("Invoice Number");

        jLabel4.setText("Invoice Date");

        jLabel5.setText("Customer Name");

        jLabel6.setText("Invoice Total");

        jLabel7.setText("Invoice Items");

        jButton1.setText("Create New Invoice");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Delete Invoice");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        insertItemBtn.setText("Insert New Item");
        insertItemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertItemBtnActionPerformed(evt);
            }
        });

        jButton4.setText("Cancel");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        loadFileMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        loadFileMenuItem.setText("Load File");
        loadFileMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadFileMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(loadFileMenuItem);

        saveFileMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        saveFileMenuItem.setText("Save File");
        saveFileMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveFileMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(saveFileMenuItem);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 9, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(invDateTF)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(invTotalLbl)
                                    .addComponent(invNumLbl))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(custNameTF))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jButton1)
                .addGap(62, 62, 62)
                .addComponent(jButton2)
                .addGap(274, 274, 274)
                .addComponent(insertItemBtn)
                .addGap(81, 81, 81)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(invNumLbl))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(invDateTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(custNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(invTotalLbl))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(insertItemBtn)
                        .addComponent(jButton4)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadFileMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadFileMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loadFileMenuItemActionPerformed

    private void insertItemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertItemBtnActionPerformed
                createItem();
        // TODO add your handling code here:
    }//GEN-LAST:event_insertItemBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
createInv();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void saveFileMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveFileMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveFileMenuItemActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
deleteItem();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       deleteInv(); // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField custNameTF;
    private javax.swing.JTable headerTable;
    private javax.swing.JButton insertItemBtn;
    private javax.swing.JTextField invDateTF;
    private javax.swing.JLabel invNumLbl;
    private javax.swing.JLabel invTotalLbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable lineTable;
    private javax.swing.JMenuItem loadFileMenuItem;
    private javax.swing.JMenuItem saveFileMenuItem;
    // End of variables declaration//GEN-END:variables
     @Override
    public void valueChanged(ListSelectionEvent e) {
        headerTableRowSelected();
    }
    
    private ArrayList<InvoiceHeader> invoices = new ArrayList<>();
    private HeaderTableModel headerTableModel;
    private LineTableModel lineTableModel;
    private SimpleDateFormat df = new SimpleDateFormat("dd-mm-yyyy");
    private InvHeaderDialog headerDialog ;
    private InvLineDialog lineDialog;
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("load")) {
            System.out.println("Load Menu Item Clicked");
            try {
                loadFiles();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            } else if (e.getActionCommand().equals("save")) {
            try {
                saveData();
            } catch (Exception ex) {
                Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            }else if (e.getActionCommand().equals("createInv")) {
                createInv();
            }else if (e.getActionCommand().equals("DeleteInv")) {
                deleteInv();
            }else if (e.getActionCommand().equals("CreateItem")) {
                createItem();
            }else if (e.getActionCommand().equals("DeleteItem")) {
                deleteItem();
            }else if (e.getActionCommand().equals("creatInvOk")) {
                createInvOk();
            }else if (e.getActionCommand().equals("createInvCancel")) {
                createInvCancel();
            }else if (e.getActionCommand().equals("creatLineOk")) {
                createLineOk();
            }else if (e.getActionCommand().equals("createLineCancel")) {
                createLineCancel();
            }
    }  
    

    private void loadFiles() throws Exception {
        invoices.clear();
        JOptionPane.showMessageDialog(this, "Please select Invoice header file", "Invoice Header", JOptionPane.WARNING_MESSAGE);
        JFileChooser fc = new JFileChooser();
        int option = fc.showOpenDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fc.getSelectedFile();
            FileReader fr = new FileReader(selectedFile);
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            while ((line = br.readLine()) != null) {
                String[] headerSegments = line.split(",");
                String invNumStr = headerSegments[0];
                String invDateStr = headerSegments[1]; // "20-02-2022"
                String custName = headerSegments[2];
                int invNum = Integer.parseInt(invNumStr);
                Date invDate = df.parse(invDateStr);
                InvoiceHeader header = new InvoiceHeader(invNum, invDate, custName);
                invoices.add(header);
            }
            br.close();
            fr.close();
            System.out.println("check");
            JOptionPane.showMessageDialog(this, "Please select Invoice lines file", "Invoice Lines", JOptionPane.WARNING_MESSAGE);
            option = fc.showOpenDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            selectedFile = fc.getSelectedFile();
            fr = new FileReader(selectedFile);
            br = new BufferedReader(fr);
            line = null;
            while ((line = br.readLine()) != null) {
                String[] lineSegments = line.split(",");
                String invNumStr = lineSegments[0];
                String item = lineSegments[1];
                String priceStr = lineSegments[2];
                String countStr = lineSegments[3];
                int invNum = Integer.parseInt(invNumStr);
                double price = Double.parseDouble(priceStr);
                int count = Integer.parseInt(countStr);
                InvoiceHeader header = findByNum(invNum);
                InvoiceLine invLine = new InvoiceLine(item, price, count, header);
                header.addLine(invLine);
            }
            br.close();
            fr.close();
            HeaderTableModel headerModel = new HeaderTableModel(invoices);
            headerTable.setModel(headerModel);
            headerTable.validate();
        }
        }
    }
    
    private InvoiceHeader findByNum(int num) {
        for (InvoiceHeader header : invoices) {
            if (header.getNum() == num) {
                return header;
            }
        }
        return null;
    }

    private void headerTableRowSelected() {
      int indexrow = headerTable.getSelectedRow();
      if(indexrow >=0)
      {
          headerTableModel = new HeaderTableModel(invoices);
      InvoiceHeader row = headerTableModel.getInvoices().get(indexrow);
    custNameTF.setText(row.getCustName());
    invTotalLbl.setText(""+row.getInvTotal());
    invDateTF.setText(row.getDate().toString());
    invNumLbl.setText(""+row.getNum());
    ArrayList<InvoiceLine> lines = row.getLines();
            lineTableModel = new LineTableModel(lines);
            lineTable.setModel(lineTableModel);
            lineTableModel.fireTableDataChanged();

    }
    }
   private void saveData() throws Exception{
        JOptionPane.showMessageDialog(this, "Please Save Invoice Header File", "Invoice Header", JOptionPane.WARNING_MESSAGE);
        JFileChooser fc = new JFileChooser();
        int option = fc.showOpenDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fc.getSelectedFile();
            PrintWriter pr = new PrintWriter(selectedFile);
            
            for(InvoiceHeader header : invoices) {
                pr.printf("%d,%s,%s",header.getNum(),header.getDate().toString(),header.getCustName());
               pr.println();
            }
            pr.close();
            JOptionPane.showMessageDialog(this, "Successfully Saved", "Information", JOptionPane.INFORMATION_MESSAGE);
            }
        //Line Table
         JOptionPane.showMessageDialog(this, "Please Save Invoice Line File", "Invoice Line", JOptionPane.WARNING_MESSAGE);
         fc = new JFileChooser();
         option = fc.showOpenDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fc.getSelectedFile();
            PrintWriter pr = new PrintWriter(selectedFile);
            
             for (InvoiceHeader header : invoices) {
               for(InvoiceLine Lines :header.getLines()){
               pr.printf("%s ,%s,%d",Lines.getProduct(),""+Lines.getPrice(),Lines.getCount());
               pr.println();
            }}
             pr.close();
            JOptionPane.showMessageDialog(this, "Successfully Saved", "Information", JOptionPane.INFORMATION_MESSAGE);
    }
    }
    
    private void createInv() {
        headerDialog = new InvHeaderDialog(this);
        headerDialog.setVisible(true);
    }

    private void deleteInv() {
        int indexrow = headerTable.getSelectedRow();
        headerTableModel.removeRow(indexrow);
        headerTableModel.fireTableDataChanged();
        lineTableModel.fireTableDataChanged();
        
    }

    private void createItem() {
        lineDialog = new InvLineDialog(this);
        lineDialog.setVisible(true);
    }

    private void deleteItem() {
        int indexrow = lineTable.getSelectedRow();
        lineTableModel.removeRow(indexrow);
        lineTableModel.fireTableDataChanged();

        
    }

    private void createInvOk() {
        String custName = headerDialog.getCustNameField().getText();
        String invDateStr = headerDialog.getInvDateField().getText();
        Date invDate = new Date();
        try {
            invDate = df.parse(invDateStr);
        } catch (ParseException ex) {
            
        }
        headerDialog.setVisible(false);
        int num = getMaxInvNum() + 1;
        InvoiceHeader newInvHeader = new InvoiceHeader(num, invDate, custName);
        invoices.add(newInvHeader);
        headerTableModel.fireTableDataChanged();
        System.out.println("check");
    }

    private void createInvCancel() {
        headerDialog.setVisible(false);
    }
    
    private int getMaxInvNum() {
        int num = 0;
        for (InvoiceHeader header : invoices) {
            if (header.getNum() > num) {
                num = header.getNum();         
            }
        }
        return num;
    }

    private void createLineOk() {
        String itemName = lineDialog.getItemNameField().getText();
        String itemCountStr = lineDialog.getItemCountField().getText();
        String itemPriceStr = lineDialog.getItemPriceField().getText();
        
        int itemCount = Integer.parseInt(itemCountStr);
        double itemPrice = Double.parseDouble(itemPriceStr);
        
        InvoiceHeader invoiceHeader = invoices.get(headerTable.getSelectedRow());
        InvoiceLine line = new InvoiceLine(itemName, itemPrice, itemCount, invoiceHeader);
        invoiceHeader.addLine(line);
        
        lineTableModel.fireTableDataChanged();
    }

    private void createLineCancel() {
        lineDialog.setVisible(false);
    }

    private void CreatItem() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
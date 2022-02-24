
package com.mycompany.sig;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class InvHeaderDialog extends JDialog{
    private JTextField custNameField;
    private JTextField invDateField;
    private JLabel custNameLbl;
    private JLabel invDateLbl;
    private JButton okBtn;
    private JButton cancelBtn;
    
    public InvHeaderDialog(NewJFrame f) {
        custNameLbl = new JLabel("Customer Name:");
        custNameField = new JTextField(20);
        invDateLbl = new JLabel("Invoice Date:");
        invDateField = new JTextField(20);
        okBtn = new JButton("Ok");
        cancelBtn = new JButton("Cancel");
        
        okBtn.setActionCommand("creatInvOk");
        cancelBtn.setActionCommand("creatInvCancel");

        okBtn.addActionListener(f);
        cancelBtn.addActionListener(f);
        
        
        setLayout(new GridLayout(3, 2));
        
        add(invDateLbl);
        add(invDateField);
        add(custNameLbl);
        add(custNameField);
        add(okBtn);
        add(cancelBtn);
        
        pack();
    }

    public JTextField getCustNameField() {
        return custNameField;
    }

    public JTextField getInvDateField() {
        return invDateField;
    }
    
    
}

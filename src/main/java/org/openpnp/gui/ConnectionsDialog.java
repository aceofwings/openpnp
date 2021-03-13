package org.openpnp.gui;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;

public class ConnectionsDialog extends JDialog {
    private final JPanel contentPanel = new JPanel();
    private final JTextField uriField = new JTextField();
    private JTextField textField;

    public ConnectionsDialog() {
        setTitle("Client Setup");
        Container c = getContentPane();
        GridLayout layout = new GridLayout();
        layout.setColumns(1);
        layout.setRows(3);
        c.setLayout(layout);
        
        JPanel panel = new JPanel();
        getContentPane().add(panel);
        
        JLabel lblNewLabel = new JLabel("Host / IP");
        panel.add(lblNewLabel);
        
        textField = new JTextField();
        panel.add(textField);
        textField.setColumns(20);
        
        JButton btnNewButton = new JButton("Connect");
        panel.add(btnNewButton);
 
    }
}

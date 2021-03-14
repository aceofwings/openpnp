package org.openpnp.gui;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.openpnp.model.Client;
import org.pmw.tinylog.Logger;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.net.URISyntaxException;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JLabel;

public class ConnectionsDialog extends JDialog {
    private final JPanel contentPanel = new JPanel();
    private JTextField uriField;

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
        
        uriField = new JTextField();
        panel.add(uriField);
        uriField.setColumns(20);
        
        JButton connectButton = new JButton("Connect");
        connectButton.addActionListener(connectAction);
        panel.add(connectButton);
    }
    
    public Action connectAction  = new AbstractAction("Connect") {
    	  public void actionPerformed(ActionEvent arg0) {
    	     Logger.debug("Performing Connection");
    	     try {

				Client.connect(uriField.getText());
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
          }
    };
}

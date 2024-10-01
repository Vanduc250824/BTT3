/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btt3;

import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author leduc
 */
public class PrimeNumber extends Frame implements ActionListener {

    private Label lbNhap;
    private TextField tfn;
    private Button btnn;
    private Label lbCheck;

    public PrimeNumber() {
        lbNhap = new Label("Nhap n:");
        lbNhap.setBounds(50, 50, 70, 20);
        tfn = new TextField();
        tfn.setBounds(120, 50, 70, 20);        
        btnn = new Button("Check");
        btnn.setBounds(50, 100, 70, 20);
        lbCheck = new Label();
        lbCheck.setBounds(50, 80, 150, 20);
        add(lbNhap);
        add(tfn);
        add(btnn);
        add(lbCheck);

        btnn.addActionListener(this);

        setSize(400, 350);
        setLayout(null);
        setVisible(true);
        addWindowListener(new WindowAdapter()
        {
           @Override
           public void windowClosing(WindowEvent we)
           {
               System.exit(0);
           }
        });
                
    }

    public boolean check(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }

    public void actionPerformed(ActionEvent ae) {
        int a = Integer.parseInt(tfn.getText());
        if (ae.getSource() == btnn) {
            if(check(a))
            {
                lbCheck.setText("Số nguyên tố");
            }
            else
            {
                lbCheck.setText("Không phải là số nguyên tố");
            }
        }
    }
}

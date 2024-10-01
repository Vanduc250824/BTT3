/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btt3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author leduc
 */
public class AdditionOperator extends Frame implements ActionListener {

    private Label lbFrist;
    private Label lbSecond;
    private Label lbSum;
    private TextField tfFrist;
    private TextField tfSecond;
    private TextField tfSum;
    private Button btnSum;
    private Button btnExit;

    public AdditionOperator() {
        setTitle("My Addition Operator");
        lbFrist = new Label("Enter Frist Number: ");
        tfFrist = new TextField("");
        lbSecond = new Label("Enter Second Number: ");
        tfSecond = new TextField("");
        lbSum = new Label("This sum is: ");
        tfSum = new TextField("");
        tfSum.setEditable(false);
        btnSum = new Button("Sum");
        btnExit = new Button("Exit");

        setSize(443, 231);
        lbFrist.setBounds(50, 50, 113, 14);
        tfFrist.setBounds(190, 50, 89, 29);
        lbSecond.setBounds(50, 90, 140, 14);
        tfSecond.setBounds(190, 90, 89, 29);
        lbSum.setBounds(50, 130, 113, 14);
        tfSum.setBounds(190, 130, 89, 29);
        btnSum.setBounds(120, 170, 55, 35);
        btnExit.setBounds(210, 170, 55, 35);

        add(lbFrist);
        add(tfFrist);
        add(lbSecond);
        add(tfSecond);
        add(lbSum);
        add(tfSum);
        add(btnSum);
        add(btnExit);
        
        btnSum.addActionListener(this);
        btnExit.addActionListener(this);
        setLayout(null);
        setVisible(true);
        addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnSum) {
            try {
                int a = Integer.parseInt(tfFrist.getText());
                int b = Integer.parseInt(tfSecond.getText());
                int sum = a + b;
            
                tfSum.setText(String.valueOf(sum));
            } catch (NumberFormatException ev) {
                System.out.println("Không hợp lệ"); 
            }

        }

        if (e.getSource() == btnExit) {
            System.exit(0);
        }

    }

    void jRadioButton2ActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    void jRadioButton1ActionPerformed(ActionEvent evt, ComplexNumber complexNumber) {
        // TODO add your handling code here:
        double a = Double.parseDouble(complexNumber.jTextField5.getText());
        double b = Double.parseDouble(complexNumber.jTextField6.getText());
        double c = Double.parseDouble(complexNumber.jTextField2.getText());
        double d = Double.parseDouble(complexNumber.jTextField4.getText());
    }

}

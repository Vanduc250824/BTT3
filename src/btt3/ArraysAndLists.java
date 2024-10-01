/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btt3;

/**
 *

 * @author leduc
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import java.util.Collections;

public class ArraysAndLists extends JFrame {
    private JTextField txtSoPtMang, txtNhapPhanTu, txtMangDaNhap, txtTinhTong, txtSapXep;
    private JButton btnNhap, btnThucHien, btnXoa, btnThoat;
    private int[] mang;
    private int count = 0;

    public ArraysAndLists() {
        setSize(450, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());  // Use GridBagLayout
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);  // Spacing between components
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Create components
        txtSoPtMang = new JTextField(5);
        txtNhapPhanTu = new JTextField(5);
        txtMangDaNhap = new JTextField(15);
        txtTinhTong = new JTextField(5);
        txtSapXep = new JTextField(15);
        
        txtTinhTong.setEditable(false);
        txtSapXep.setEditable(false);

        btnNhap = new JButton("Nhap");
        btnThucHien = new JButton("Thuc hien");
        btnXoa = new JButton("Xoa");
        btnThoat = new JButton("Thoat");

        // Add components with GridBagLayout
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JLabel("Nhap so pt mang:"), gbc);
        gbc.gridx = 1;
        add(txtSoPtMang, gbc);
        gbc.gridx = 2;
        add(new JLabel("Nhap phan tu:"), gbc);
        gbc.gridx = 3;
        add(txtNhapPhanTu, gbc);
        gbc.gridx = 4;
        add(btnNhap, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(new JLabel("Mang da nhap:"), gbc);
        gbc.gridx = 1;
        gbc.gridwidth = 3;
        add(txtMangDaNhap, gbc);
        gbc.gridwidth = 1;
        gbc.gridx = 4;
        add(btnThucHien, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        add(new JLabel("Tinh tong:"), gbc);
        gbc.gridx = 1;
        add(txtTinhTong, gbc);
        gbc.gridx = 4;
        add(btnXoa, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        add(new JLabel("Sap xep:"), gbc);
        gbc.gridx = 1;
        gbc.gridwidth = 3;
        add(txtSapXep, gbc);
        gbc.gridwidth = 1;
        gbc.gridx = 4;
        add(btnThoat, gbc);

        // Action listener for buttons
        btnNhap.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nhapPhanTu();
            }
        });

        btnThucHien.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                thucHien();
            }
        });

        btnXoa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                xoaDuLieu();
            }
        });

        btnThoat.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    private void nhapPhanTu() {
        try {
            int soPtMang = Integer.parseInt(txtSoPtMang.getText());

            // Reinitialize array if necessary
            if (mang == null || mang.length != soPtMang) {
                mang = new int[soPtMang];
                count = 0; // Reset count
            }

            // Add element to the array
            if (count < soPtMang) {
                mang[count] = Integer.parseInt(txtNhapPhanTu.getText());
                count++;

                // Display array entered so far
                txtMangDaNhap.setText(Arrays.toString(Arrays.copyOf(mang, count)));
            } else {
                JOptionPane.showMessageDialog(this, "Mảng đã đầy!");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập số hợp lệ!");
        }
    }

    private void thucHien() {
        if (mang != null && count > 0) {
            // Tính tổng
            int tong = 0;
            for (int num : mang) {
                tong += num;
            }
            txtTinhTong.setText(String.valueOf(tong));

            // Sắp xếp mảng giảm dần
            Integer[] sapXepMang = Arrays.stream(mang).boxed().toArray(Integer[]::new);
            Arrays.sort(sapXepMang);
            txtSapXep.setText(Arrays.toString(sapXepMang));
        } else {
            JOptionPane.showMessageDialog(this, "Mảng trống, vui lòng nhập phần tử trước!");
        }
    }

    private void xoaDuLieu() {
        // Clear the data from the TextFields
        txtSoPtMang.setText("");
        txtNhapPhanTu.setText("");
        txtMangDaNhap.setText("");
        txtTinhTong.setText("");
        txtSapXep.setText("");
        mang = null;
        count = 0;
    }
}


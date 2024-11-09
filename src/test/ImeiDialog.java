/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import javax.swing.*;
import java.awt.*;
import java.util.List;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class ImeiDialog extends JDialog {
    private JList<String> imeiJList;
    private JButton btnSelect;

    public ImeiDialog(JFrame parent, String productId) {
        super(parent, "Danh sách IMEI", true);
        setLayout(new BorderLayout());

        // Lấy danh sách IMEI dựa trên mã sản phẩm
        List<String> imeiList = getImeisByProductId(productId);

        // Hiển thị danh sách IMEI
        imeiJList = new JList<>(imeiList.toArray(new String[0]));
        imeiJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        add(new JScrollPane(imeiJList), BorderLayout.CENTER);

        // Nút chọn IMEI
        btnSelect = new JButton("Chọn");
        btnSelect.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedImei = imeiJList.getSelectedValue();
                if (selectedImei != null) {
                    JOptionPane.showMessageDialog(ImeiDialog.this,
                            "Bạn đã chọn IMEI: " + selectedImei,
                            "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    dispose(); // Đóng dialog
                } else {
                    JOptionPane.showMessageDialog(ImeiDialog.this,
                            "Vui lòng chọn một IMEI!",
                            "Lỗi", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        add(btnSelect, BorderLayout.SOUTH);

        setSize(300, 400);
        setLocationRelativeTo(parent); // Hiển thị ở giữa form cha
    }

    private List<String> getImeisByProductId(String productId) {
        // Trả về danh sách IMEI dựa trên mã sản phẩm
        if ("SP001".equals(productId)) {
            return List.of("IMEI001", "IMEI002", "IMEI003");
        } else if ("SP002".equals(productId)) {
            return List.of("IMEI004", "IMEI005", "IMEI006");
        } else if ("SP003".equals(productId)) {
            return List.of("IMEI007", "IMEI008", "IMEI009");
        }
        return List.of(); // Trả về danh sách rỗng nếu không tìm thấy sản phẩm
    }
}

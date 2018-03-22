package ru.geekbrains;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm {
    private JList fileList;
    private JPanel mainPanel;
    private JButton saveBtn;
    private JButton delBtn;
    private JButton addBtn;

    public MainForm() {
        addBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}

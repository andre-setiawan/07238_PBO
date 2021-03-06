package Murid.GUI;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileInputStream;

public class Eric07238_GUI {
    JFrame LogReg       = new JFrame();
    JLabel title, subtitle;
    JButton create, view;

    public Eric07238_GUI() {
        LogReg.setSize(500,280);
        LogReg.setTitle("Sisko - Beranda");
        LogReg.setLayout(null);
        LogReg.getContentPane().setBackground(Color.GREEN);

        title = new JLabel("Sistem Informasi Sekolah");
        title.setBounds(80,10, 600,50);
        title.setFont(new Font("Times New Roman", Font.BOLD, 30));
        LogReg.add(title);

        subtitle = new JLabel("Manajemen Data Siswa");
        subtitle.setBounds(130, 40, 600, 50);
        subtitle.setFont(new Font("Times New Roman", Font.BOLD, 20));
        LogReg.add(subtitle);

        create();

        view();

        LogReg.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        LogReg.setVisible(true);
        LogReg.setLocationRelativeTo(null);

        LogReg.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                if(JOptionPane.showConfirmDialog(LogReg,"Apakah anda yakin ingin keluar ? ") == JOptionPane.OK_OPTION) {
                    LogReg.setVisible(false);
                    LogReg.dispose();
                }
            }
        });
    }

    public void create() {
        /*
         * Create Button
         *
         * @author: Ericsson Budhilaw
         */

        create = new JButton("Tambah Data");
        create.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        create.setBounds(90, 120,300, 40);
        create.setFocusPainted(false);
        create.setBackground(Color.LIGHT_GRAY);

        try {
            Image addIcon = ImageIO.read(new FileInputStream("res/add.png"));
            Image newAddIcon = addIcon.getScaledInstance(30, 30, 30);
            create.setIcon(new ImageIcon(newAddIcon));
        } catch (Exception e) {
            System.out.println(e);
        }
        LogReg.add(create);

        create.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Eric07238_Add add = new Eric07238_Add();
                LogReg.dispose();
            }
        });
    }

    public void view() {
        /*
         * Update Button
         *
         * @author: Ericsson Budhilaw
         */

        view = new JButton("Lihat Data");
        view.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        view.setBounds(90, 180,300, 40);
        view.setFocusPainted(false);
        view.setBackground(Color.LIGHT_GRAY);

        try {
            Image updateIcon = ImageIO.read(new FileInputStream("res/view.png"));
            Image newAddIcon = updateIcon.getScaledInstance(30, 30, 30);
            view.setIcon(new ImageIcon(newAddIcon));
        } catch (Exception e) {
            System.out.println(e);
        }
        LogReg.add(view);

        view.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Eric07238_View view = new Eric07238_View();
                LogReg.dispose();
            }
        });
    }
}

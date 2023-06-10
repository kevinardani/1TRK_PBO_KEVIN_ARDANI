package Pertemuan8;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class FristFrame implements ActionListener {
    JFrame f;
    JLabel l1;
    JLabel l2, l3;
    JTextField t1, t2;
    JButton b;

    public FristFrame() {
        f = new JFrame("Aplikasu Tambah "); //judul form
        l1 = new JLabel("Nomor ke-1");
        l2 = new JLabel("Nomor ke-2");
        l3 = new JLabel("Hasil");
        t1 = new JTextField("");
        t2 = new JTextField("");
        b = new JButton("Tombol Tambah");

        //Mengatur posisi
        t1.setBounds(150, 50, 100, 30);
        t2.setBounds(150, 90, 100, 30);
        l1.setBounds(50, 50, 100, 30);
        l2.setBounds(50, 90, 100, 30);
        l3.setBounds(200, 150, 100, 30);
        b.setBounds(50, 150, 130, 30);
        b.addActionListener((ActionListener) this);
        //menambahkan atau menggabungkan attribut ke Jframe
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(t1);
        f.add(t2);
        f.add(b);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500, 300);
        f.setLayout(null);
        f.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());

        int value = num1 + num2;
        l3.setText(value + "");
    }
}

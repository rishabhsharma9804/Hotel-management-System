package Hotel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard extends JFrame implements ActionListener {
    JButton add,rec;
    Dashboard(){
        super("HOTEL MANAGEMENT SYSTEM");

        rec = new JButton("RECEPTION");
        rec.setBounds(325,410,140,30);
        rec.setFont(new Font("Tahoma", Font.BOLD,15));
        rec.setBackground(new Color(255,98,0));
        rec.setForeground(Color.WHITE);
        rec.addActionListener(this);
        add(rec);

        add = new JButton("ADMIN");
        add.setBounds(780,410,140,30);
        add.setFont(new Font("Tahoma", Font.BOLD,15));
        add.setBackground(new Color(255,98,0));
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        add(add);

        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icons/boss.png"));
        Image i2 = i11.getImage().getScaledInstance(200,195, Image.SCALE_DEFAULT);
        ImageIcon imageIcon11 = new ImageIcon(i2);
        JLabel label1 = new JLabel(imageIcon11);
        label1.setBounds(750,200,200,195);
        add(label1);

        ImageIcon i111 = new ImageIcon(ClassLoader.getSystemResource("icons/Reception.png"));
        Image i22 = i111.getImage().getScaledInstance(200,195, Image.SCALE_DEFAULT);
        ImageIcon imageIcon111 = new ImageIcon(i22);
        JLabel label11 = new JLabel(imageIcon111);
        label11.setBounds(300,200,200,195);
        add(label11);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icons/Dashboard.gif"));
        Image i1 = imageIcon.getImage().getScaledInstance(1950,1090, Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(i1);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(0,0,1950,1090);
        add(label);

        setLayout(null);
        setSize(1250,670);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==rec){
            new Reception();
            setVisible(false);
        }else {
            new Login2();
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Dashboard();
    }
}
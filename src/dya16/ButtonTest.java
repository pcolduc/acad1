package dya16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonTest extends JFrame {

    public ButtonTest(){
        this.setLayout(new FlowLayout());
        JButton btn1 = new JButton("클릭");
        btn1.setBackground(Color.YELLOW);
        btn1.setPreferredSize(new Dimension(150,150));
        add(btn1);




        setVisible(true);
        setSize(640,480);
        setResizable(false);// 사이즈 재조정 불가능.
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ButtonTest();
    }
}

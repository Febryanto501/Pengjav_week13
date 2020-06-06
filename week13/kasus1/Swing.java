/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week13.kasus1;

/**
 *
 * @author Febryan PC
 */
import javax.swing.*;
import java.awt.*;
public class Swing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI Swing");
        JPanel pane1 = new JPanel(new GridLayout(5,3));
        
        
        pane1.add(new JLabel("String 1"));
        pane1.add(new JTextField(""));
        pane1.add(new JLabel(""));
        pane1.add(new JLabel("String 2"));
        pane1.add(new JTextField(""));
        pane1.add(new JLabel(""));
        pane1.add(new JLabel("Hasil"));
        pane1.add(new JTextField(""));
        pane1.add(new JLabel(""));
        
        pane1.add(new JButton("PROSES"));
        pane1.add(new JButton("HAPUS"));
        pane1.add(new JLabel(""));
        
        
        
        frame.getContentPane().add(pane1,BorderLayout.NORTH);

        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.show();
        

    }
}

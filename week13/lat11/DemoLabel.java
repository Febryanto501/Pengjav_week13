/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week13.lat11;

/**
 *
 * @author Febryan PC
 */
import javax.swing.*;
public class DemoLabel {
    public static void main(String[] args) {
        JFrame frame = new JFrame("demo html");
        
        String html = "<html>\n"+
                "contoh penggunaan HTML dama label:\n"+
                "<ul>\n"+
                "<li><font color=red>merah</font>\n"+
                "<li><font color=green>hijau</font>\n"+
                "<li><font color=yellow>kuning</font>\n"+
                "<li><font size=-2>dilangit yang</font>\n"+
                "<li><font color=blue>biru</font>\n"+
                
                "<li><font size=-2>bintang kecil ??</font>\n"+
                "<li><font size=+2>Besar ??</font>\n"+
                "<li><i>italic</li>\n" +
                "<li><b>bold</li>\n" +
                "</ul>\n";
        
        JLabel label=new JLabel (html);
        frame.getContentPane().add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.show();
    }
}

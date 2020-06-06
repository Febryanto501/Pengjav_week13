/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week13.lat7;

/**
 *
 * @author Febryan PC
 */
import javax.swing.*;

public class Dialog2 {

    public static void main(String args[]) {
        JFrame frame = new JFrame("contoh tamplilan frame di java.");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.show();
        JOptionPane.showConfirmDialog(frame, "Contoh dialog konfirmasi...", "Title Konfirmasi",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE);
    }
}

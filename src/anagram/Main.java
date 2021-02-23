/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Anagram;

import anagram.ui.GUI;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author Ravindu Denuwan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new GUI().setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.swing.JFrame;
import ui.forms.MainForm;

/**
 *
 * @author IRC_client
 */
public class Main {
    public static void main(String[] args) {
        JFrame main = new MainForm();
        main.setVisible(true);
        main.setLocationRelativeTo(null);        
    }
}

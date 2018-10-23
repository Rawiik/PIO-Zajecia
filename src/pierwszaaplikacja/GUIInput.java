/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pierwszaaplikacja;

import javax.swing.JOptionPane;

/**
 *
 * @author Student
 */
public class GUIInput implements TextInput{

    public String getText() {
        String text = JOptionPane.showInputDialog("Podaj imie: ");
        return text;
    }
}

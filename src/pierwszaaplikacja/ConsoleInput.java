/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pierwszaaplikacja;

import java.util.Scanner;

public class ConsoleInput implements TextInput{

    Scanner read = new Scanner(System.in);

    public String getText() {
        System.out.print("Press text: ");
        return read.next();
    }
}

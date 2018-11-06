/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pierwszaaplikacja;

import java.util.Random;
import java.util.Scanner;

public class DiceCubeGame {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        Player ja = new PlayerComp(new ConsoleInput());
        // int wybor;
        
       // ja.setTextInput(new ConsoleInput());

        // System.out.println("---- WITAMY W DICECUBEGAME ----");
        // System.out.println("    1)GRAJ PRZECIWKO KOMPUTEROWI\n    2)GRAJ PRZECIWKO GRACZOWI");
//        System.out.print("Wybierz numer: "); wybor = read.nextInt();
//        if (wybor == 1) {
//            ja = new PlayerComp();
//        } else if(wybor == 2) {
//            ja = new PlayerHuman("Ferdynand Kiepski");
//            
//        }
        try {
            //ja.setName("Ziutek");
            ja.askForName();
        } catch (Exception ex) {
           System.err.println("Błąd " + ex.getMessage());
        }

        Random dice = new Random();
        int number = 0, quess = 0;

        do {

            number = dice.nextInt(6) + 1;
            System.out.println("Wylosowany typ: " + number);
            quess = ja.quessNumber();
            System.out.println("Strzał " + ja.getName() + " " + quess);
            if (quess == number) {
                System.out.println("Dobrze!");
            } else {
                System.out.println("Źle");
            }

        } while (number != quess);
    }

}

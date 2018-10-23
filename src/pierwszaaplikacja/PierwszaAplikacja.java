package pierwszaaplikacja;

import java.util.Random;
import java.util.Scanner;

public class DiceCubeGame {

    public static void main(String[] args) {

        
        
        
        
        Random dice = new Random();
        Scanner read = new Scanner(System.in);
        Player ja = new PlayerComp();
        int wybor;
        
        System.out.println("---- WITAMY W DICECUBEGAME ----");
        System.out.println("    1)GRAJ PRZECIWKO KOMPUTEROWI\n    2)GRAJ PRZECIWKO GRACZOWI");
//        System.out.print("Wybierz numer: "); wybor = read.nextInt();
//        if (wybor == 1) {
//            ja = new PlayerComp();
//        } else if(wybor == 2) {
//            ja = new PlayerHuman("Ferdynand Kiepski");
//            
//        }
        
        
        
        

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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pierwszaaplikacja;

import java.util.Random;

public class PierwszaAplikacja {

    public static void main(String[] args) {

        Random dice = new Random();
        Gracz ja = new Gracz();
        ja.setName(null);

        int number = 0, quess = 0;

        do {

            number = dice.nextInt(6) + 1;
            System.out.println("Wylosowany (number)" + number);
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

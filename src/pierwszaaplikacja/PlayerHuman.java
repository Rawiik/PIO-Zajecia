/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pierwszaaplikacja;

import java.util.Scanner;

public class PlayerHuman extends Player {

    int quessCube = 0;
    Scanner read = new Scanner(System.in);

    public PlayerHuman(TextInput in) {
        super(in);
    }

    public PlayerHuman(TextInput in, String name) {
        super(in, name);
    }

    @Override
    public int quessNumber() {
        System.out.print("Type your number: ");
        quessCube = read.nextInt();
        System.out.print("Your number is " + quessCube);
        return quessCube;
    }

}

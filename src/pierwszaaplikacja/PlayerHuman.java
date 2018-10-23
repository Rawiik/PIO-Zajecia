package pierwszaaplikacja;

import java.util.Scanner;


public class PlayerHuman extends Player {
    
    int quessCube = 0;
    Scanner read = new Scanner(System.in);
    
    public PlayerHuman(){}
    
    public PlayerHuman(String name) {
       super.setName(name);
    }
    
    @Override
    public int quessNumber() {
        System.out.print("Type your number: ");
        quessCube = read.nextInt();
        System.out.print("Your number is " +quessCube);
        return quessCube;
    }
    
}

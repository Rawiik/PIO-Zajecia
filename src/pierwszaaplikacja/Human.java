/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pierwszaaplikacja;

import java.util.Scanner;


public class Human extends Gracz{
    
    int quessCube = 0;
    Scanner read = new Scanner(System.in);
    
    public Human(){}
    
    public Human(String name) {
       super.setName(name);
    }
    
    
    public int quess() {
     
        quessCube = read.nextInt();
        return quessCube;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pierwszaaplikacja;

import java.util.Scanner;
import java.util.Random;

public class Gracz {

    private String name = "Ferdynand Kiepski";
    private Scanner gracz = new Scanner(System.in);
    private Random quess = new Random();

    public Gracz() {}
    
    public Gracz(String name) {
        setName(name);
    }
    
    public int quessNumber() {
        //System.out.print("Podaj liczbe: ");
        //return gracz.nextInt();
        return quess.nextInt(6) + 1;
    }

    public void setName(String name) {
        if(name != null && !name.isEmpty()) {
           this.name = name; 
        }
        
    }

    public String getName() {
        return name;
    }

    public void changeName(String newName) {
        this.name = newName;
    }

}

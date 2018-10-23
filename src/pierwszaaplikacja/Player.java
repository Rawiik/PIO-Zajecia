package pierwszaaplikacja;

import java.util.Scanner;
import java.util.Random;

abstract public class Player {

    private String name = "Ferdynand Kiepski";
    private Scanner gracz = new Scanner(System.in);
    private Random quess = new Random();

    public Player() {}
    
    public Player(String name) {
        setName(name);
    }
    
    public void setName(String name) {
        if(name != null && !name.isEmpty()) {
           this.name = name; 
        }
        
    }
    
    abstract public int quessNumber();
    
    public String getName() {
        return name;
    }

    public void changeName(String newName) {
        this.name = newName;
    }

}

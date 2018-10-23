/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pierwszaaplikacja;

import java.util.Scanner;
import java.util.Random;

abstract public class Player {

    private String name = "Ferdynand Kiepski";
    private Scanner gracz = new Scanner(System.in);
    private Random quess = new Random();

    public Player() {
    }

    public Player(String name) {
        setName(name);
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Nieprawidłowe imię");
        }

    }

    abstract public int quessNumber();

    public String getName() {
        return name;
    }

    public void changeName(String newName) {
        this.name = newName;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": " + name;
    }

    public void askForName() {
        System.out.print("Set your name: ");
        TextInput in = new GUIInput();
        setName(in.getText());
    }

}

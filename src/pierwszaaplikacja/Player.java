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
    private TextInput in;

    public Player(TextInput in) {
        this.in = in;
    }

    public Player(TextInput in, String name) {
        this.in = in;
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
        setName(in.getText());
    }

    void setTextInput(TextInput in) {
        this.in = in;
    }
}

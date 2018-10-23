/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pierwszaaplikacja;

import java.util.Random;

public class PlayerComp extends Player {

    Random rand = new Random();

    public PlayerComp() {
    }

    public PlayerComp(String name) {
        super.setName(name);
    }

    @Override
    public int quessNumber() {
        return rand.nextInt(6) + 1;
    }

}

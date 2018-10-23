/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pierwszaaplikacja;

import java.util.Random;

public class MistrzGry extends Gracz{

    Random rolling = new Random();


    public int rollingCube() {
        return rolling.nextInt(6) + 1;
    }

}

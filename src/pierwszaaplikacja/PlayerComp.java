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

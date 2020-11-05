package Jenny;

import java.util.ArrayList;

abstract class Human {
    public abstract void getChromosome();
}

class Male extends Human {
    @Override
    public void getChromosome() {
        System.out.println("XY");
    }

}

class Female extends Human {
    @Override
    public void getChromosome() {
        System.out.println("XX");
    }

}

public class A1 {
    public static void main(String[] args) {
        Male male1 = new Male();
        //male1.getChromosome();

        Female female1 = new Female();
        //female1.getChromosome();

        ArrayList<Human> menschen = new ArrayList<>();
        menschen.add(male1);
        menschen.add(female1);

        for (Human mensch : menschen) {
            mensch.getChromosome();
        }
    }
}

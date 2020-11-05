package Gabriella;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList <Human> h1 = new ArrayList<Human>();

        h1.add(new Male("Peter"));
        h1.add(new Male("Andreas"));
        h1.add(new Male("Michael"));

        h1.add(new Female("Jenny",23));
        h1.add(new Female("Johanna",33));
        h1.add(new Female("Michaela",43));

        System.out.println(h1);



    }
}

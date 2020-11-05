package Peter.A1and2;

import java.util.ArrayList;

public class Main {

    public static int add(int a, int b){
        return a + b;
    }
/*
    public static int add(int a, int b, int c){
        return a + b + c;
    }

 */


    public static void main(String[] args) {

        Male m = new Male("Joe");
        Female f = new Female("Iris");

        ArrayList<Human> humans = new ArrayList<>();
        humans.add(m);
        humans.add(f);

        System.out.println(humans);

        //overloading testing
        int sum = add(5,1);
        System.out.println(sum);



    }
}
// not working
class subclass extends Main{


    public static int add(int a, int b){
        return a + b + b;
    }

}
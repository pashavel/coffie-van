package Main;

import Enums.TypeOfCoffee;

public class Main {
    public static void main(String[] args)
    {
        Van van = new Van();
        van.addCoffee(100,200,130, TypeOfCoffee.GRAIN);
        van.addCoffee(150,100,70,TypeOfCoffee.INJAR);
        van.addCoffee(80,170,140,TypeOfCoffee.INBAGS);
        van.addCoffee(200,200,150,TypeOfCoffee.GROUND);

    }
}

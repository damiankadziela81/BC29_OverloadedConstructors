package org.example;

public class Main {
    public static void main(String[] args) {

        Pizza pizza1 = new Pizza("thicc crust","tomato","mozarella","peperonni");
        Pizza pizza2 = new Pizza("thicc crust","tomato","mozarella");
        Pizza pizza3 = new Pizza("thicc crust","tomato");
        Pizza pizza4 = new Pizza("thicc crust");
        Pizza pizza5 = new Pizza();

        System.out.println("Here are ingredients of your pizza1: ");
        System.out.println(pizza1.bread);
        System.out.println(pizza1.cheese);
        System.out.println(pizza1.sauce);
        System.out.println(pizza1.topping);

        System.out.println("Here are ingredients of your pizza2: ");
        System.out.println(pizza2.bread);
        System.out.println(pizza2.cheese);
        System.out.println(pizza2.sauce);

        System.out.println("Here are ingredients of your pizza3: ");
        System.out.println(pizza3.bread);
        System.out.println(pizza3.sauce);

        System.out.println("Here are ingredients of your pizza4: ");
        System.out.println(pizza4.bread);

        System.out.println("Here are ingredients of your pizza5: ");
        System.out.println(pizza5.bread);
        System.out.println(pizza5.cheese);
        System.out.println(pizza5.sauce);
        System.out.println(pizza5.topping);

    }
}
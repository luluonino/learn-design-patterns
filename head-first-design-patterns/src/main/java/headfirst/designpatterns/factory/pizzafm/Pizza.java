package headfirst.designpatterns.factory.pizzafm;

import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<String>();

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough ...");
        System.out.println("Adding sauce ...");
        System.out.println("Adding toppings: ");
        for (String topping: toppings) {
            System.out.println("    " + topping);
        }
    }

    public void bake() {
        System.out.println("Bake for 25 mins at 350 F");
    }

    public void cut() {
        System.out.println("Cut the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public String toString() {
        StringBuilder display = new StringBuilder();
        display.append("--- " + name + " ----\n");
        display.append(dough + "\n");
        display.append(sauce + "\n");
        for (String topping: toppings) {
            display.append(topping + "\n");
        }
        return display.toString();
    }
}

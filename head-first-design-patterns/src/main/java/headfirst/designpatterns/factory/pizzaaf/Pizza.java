package headfirst.designpatterns.factory.pizzaaf;

import java.util.Arrays;
import java.util.stream.Collectors;

public abstract class Pizza {
    String name;

    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;

    abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 mins at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        StringBuffer display = new StringBuffer();
        display.append("---- " + name + " ----\n");
        if (dough != null) {
            display.append(dough + "\n");
        }
        if (sauce != null) {
            display.append(sauce + "\n");
        }
        if (cheese != null) {
            display.append(cheese + "\n");
        }
        if (veggies != null) {
            display.append(
                String.join(
                    ", ",
                    Arrays.stream(veggies)
                        .map(Veggies::toString)
                        .collect(Collectors.toList())
                )
            );
            display.append("\n");
        }
        if (clam != null) {
            display.append(clam + "\n");
        }
        if (pepperoni != null) {
            display.append(pepperoni + "\n");
        }
        return display.toString();
    }
}

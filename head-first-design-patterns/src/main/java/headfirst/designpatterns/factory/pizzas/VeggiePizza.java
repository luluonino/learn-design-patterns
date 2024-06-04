package headfirst.designpatterns.factory.pizzas;

public class VeggiePizza extends Pizza {
    public VeggiePizza() {
        name = "Veggie Pizza";
        dough = "Crust";
        sauce = "Marinara Sauce";
        toppings.add("Shredded Mozzarella");
        toppings.add("Grated Parmesan");
        toppings.add("Diced Parmesan");
        toppings.add("Sliced Mushrooms");
        toppings.add("Sliced Red Pepper");
        toppings.add("Sliced Black Olives");
    }
}

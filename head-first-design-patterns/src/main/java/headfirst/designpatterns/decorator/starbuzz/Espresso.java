package headfirst.designpatterns.decorator.starbuzz;

import javax.swing.text.DefaultStyledDocument;

public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    public double cost() {
        return 1.99;
    }
}

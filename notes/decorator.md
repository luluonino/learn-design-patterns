## Definition 
The Decorator Pattern attaches additional responsibilities 
to an object dynamically. Decorators provide a flexible 
alternative to subclassing for extending functionality.

## Example

### Coffee
Considering how a coffee 
beverage is made, it usually consists of a base (espresso, dark roast, etc) 
and several condiments as supplements (milk, cinnamon, mocha, etc). 
In [coffee](../head-first-design-patterns/src/main/java/headfirst/designpatterns/decorator/starbuzz)
both the coffee and the coffee
decorator are of the same supertype `Beverage`. The decorator 
takes an existing `Beverage` object as an attribute. 
So multiple layers of decorators can be added on top of one 
another sequentially. 

```java
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;
    public abstract String getDescription();
}

public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    public double cost() {
        return 1.99;
    }
}

public class Milk extends CondimentDecorator {
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    public double cost() {
        return beverage.cost() + 0.10;
    }
}
```

| Abstract Class | Implementations | Relationship |
| -------------- | --------------- | ------------ |
| Beverage  | Espresso, HouseBlend, etc. | Super class of both coffees and decorators |
| CondimentDecorator | Milk, Mocha, Whip, etc. | Super class of decorators | 

### `java.io`
In `java.io`, basic `InputStream` classes provide different ways 
of reading files. Decorators provide a way to customize the way 
data is read. In this [example](../head-first-design-patterns/src/main/java/headfirst/designpatterns/decorator/io),
a decorator class is defined to convert the input to lower case. 

| (Abstract) Class | Implementations | Relationship |
| ---------------- | --------------- | ------------ |
| InputStream      | FileInputStream, etc | Super class of all |
| FilterInputStrem | LowerCaseInputStream | Super class of other decorators |



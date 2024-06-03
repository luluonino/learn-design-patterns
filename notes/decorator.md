## Definition 
The Decorator Pattern attaches additional responsibilities 
to an object dynamically. Decorators provide a flexible 
alternative to subclassing for extending functionality.

## Example

### Coffee
In the [coffee](../head-first-design-patterns/src/main/java/headfirst/designpatterns/decorator/starbuzz)
example, both the coffee and the coffee
decorator are of the same supertype `Beverage`. The decorator 
takes an existing `Beverage` object as one of its attribute. 
So multiple layers of decorators can be added on top of one 
another sequentially. 
| Class | Implementations | Relationship |
| ----- | --------------- | ------------ |
| Beverage (abstract) | Espresso, HouseBlend, etc. | Super class of both coffees and decorators |
| CondimentDecorator (abstract) | Milk, Mocha, Whip, etc. | Super class of decorators | 

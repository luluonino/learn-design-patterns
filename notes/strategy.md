## Definition
The *Strategy Pattern* defines a family of algorithms, encapsulates each one, 
and makes them interchangeable. Strategy lets the algorithm vary independently 
from clients that use it. 

## Example
The example given is [ducks](../head-first-design-patterns/src/main/java/headfirst/designpatterns/strategy/),
where different variantions of ducks can have 
different fly and quack behaviors. Following the design principles of isolating 
changes and favoring compositions, we can separate out the fly and quack
behaviors as independent classes and make them attributes of Duck classes. 

The `Duck` abstract class goes like this: 
```java
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    // other methods

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    // other methods
}
```

Instead of implementing the fly and quack behaviors within the Duck class, 
it's delegated to the FlyBehavior and QuackBehavior attributes to perform 
the fly and quack operations, both attributes can be assigned at run time. 

| Interface | Implementations | Relationship |
| --------- | --------------- | ------------ |
| Duck      | MallardDuck, DecoyDuck, RubberDuck, etc. | "Has-A" FlyBehavior and QuackBehavior |
| FlyBehavior | FlyWithWings, FlyNoWay, FlyRocketPowered, etc. | |
| QuackBehavior | Quack, Squeak, MuteQuack, etc. | | 


The Strategy Pattern defines a family of algorithms, encapsulates each one, 
and makes them interchangeable. Strategy lets the algorithm vary independently 
from clients that use it. 

The example given is [ducks](../head-first-design-patterns/src/main/java/headfirst/designpatterns/strategy/),
where different variantions of ducks can have 
different fly and quack behaviors. Following the design principle of isolating 
changes and favoring compositions, we can separate out the fly and quack
behaviors as independent classes and make them attributes of Duck classes. 



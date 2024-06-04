## Definition 
The **Factory Method Pattern** defines an interface 
for creating an object, but lets subclasses decide 
which class to instantiate. Factory Method lets a 
class defer instantiation to subclasses. 



## Example: Pizza Store
The whole idea behind the factory method pattern 
is to encapsulate the instantiating part of the 
code in separate classes. 

In [simple pizza factory](../head-first-design-patterns/src/main/java/headfirst/designpatterns/factory/pizzas),
it demonstrates in the simplest form how to delegate 
to a factory class the responsibility to instantiate
a Pizza object based on the input variable `type`. 

In [pizza factory method](../head-first-design-patterns/src/main/java/headfirst/designpatterns/factory/pizzafm),
it goes one step further to define a factory method 
as part of the abstract PizzaStore class and let 
the subclasses handle the implementation of how 
exactly a Pizza should be created for different 
styles of PizzaStore. 

| Abstract class | Implementations | Relationship | 
| -------------- | --------------- | ------------ |
| PizzaStore     | NYStyleStore, ChicagoPizzaStore | Super class of all PizzaStore classes. Requires factory method `createPizza()` implemented in subclasses to handle the instantiating of a Pizza |
| Pizza          | NYStyle\*Pizza, ChicagoStyle\*Pizza | Super class of all Pizza classes. Gets instantiated only in PizzaStore subclasses. |



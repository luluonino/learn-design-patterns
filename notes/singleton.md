## Definition 
The **Singleton Pattern** ensures a class has only one 
instance, and provides a global point of access to it.

## Example
### Classic Singleton

Even though not thread safe, in [classic singleton](../head-first-design-patterns/src/main/java/headfirst/designpatterns/singleton),
it demonstrates the basic idea behind singleton to have a private constructor
with a static public `getInstance()` function to serve a singleton 
instance of the class. 

```java
public class Singleton {
    private static Singleton uniqueInstance;
    private Singleton() {}
    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    // other methods
    ... 
}
```

A slightly more interesting example of [chocolate boiler](../head-first-design-patterns/src/main/java/headfirst/designpatterns/singleton/chocolate)
follows the same logic.

### Multithreading

To fix the problem with multithreading, there are a few optioins: 
1. `synchronized` 
In [thread safe singleton](../head-first-design-patterns/src/main/java/headfirst/designpatterns/singleton/threadsafe)
a `synchronized` keyword is added to the declaration of the `getInstance()` method 
to prevent multiple threads from calling this method at the same time and intializing
multiple instances. 
2. The synchronization part is needed only the first time the `getInstance()` is called 
and is thus more expensive than necessary. Another option is to
[statically instantiate](../head-first-design-patterns/src/main/java/headfirst/designpatterns/singleton/stat)
the `uniqueInstance` variable at the time of declaratioin. 
3. Or in [double checked locking](../head-first-design-patterns/src/main/java/headfirst/designpatterns/singleton/dcl)
only synchronize when the instance variable is not initlized yet. 
4. Use [java.enum](../head-first-design-patterns/src/main/java/headfirst/designpatterns/singleton/enumS)

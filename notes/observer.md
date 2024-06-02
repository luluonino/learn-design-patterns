## Definition 
The Observer Pattern defines a one-to-many dependency 
between objects so that when one object changes state,
all of its dependents are notified and updated 
automatically.

## Example
In the case of [weather station](../head-first-design-patterns/src/main/java/headfirst/designpatterns/observer/weather),
the weather data gets updated from the sensors located
in a weather station and we'd like to distribute the 
weather info to a few weather display objects automatically. 
There is a one-to-many dependency relationship 
between the weather station and the displays. 

The interface `Subject` and `Observer` go like the following:
```java
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}

public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
```

Here the `Subject::registerObserver()` method allows any Observer to 
register themselves with the Subject, which is recorded 
in an `ArrayList` in the Subject object. 
The `Subject::notifyObservers()` 
method would call the `Observer::update()` method to push 
updated values to the observers. 

| Interface | Implementations | Relationship |
| --------- | --------------- | ------------ |
| Subject | WeatherData | Distributor of info to Observers |
| Observer | CurrentConditionsDisplay, ForecastDisplay, etc | Dependent on Subject for info |

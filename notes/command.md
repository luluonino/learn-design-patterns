## Definition 
The **Command Pattern** encapsulates a request as an object,
thereby letting you parameterize other objects with different
requests, queue or log requests, and support undoable operatioins.

## Example
### Simple Remote
In [simple remote control](../head-first-design-patterns/src/main/java/headfirst/designpatterns/command/simpleremote)
the remote is supposed to execute certain actions when a button 
is pressed - `SimpleRemoteControl::buttonWasPressed()`.
The way it's implemented is, a `Command` object is 
assigned to the remote, where the `Command` object encapsulates
an appliance object (`Light`, or `GarageDoor`) and invokes 
corresponding methods when `Command::execute()` is called 
in `SimpleRemoteControl::buttonWasPressed()`. This way, the remote 
can be given any `Command` object at run time and invoke 
different appliance actions. 

| Interface / Class | Implementations | Relationship |
| ----------------- | --------------- | ------------ |
| Command           | LightOnCommand, GarageDoorOpenCommand | All \*Command classes must follow the Command interface and implement the `execute()` method |
| SimpleRemoteControl | SimpleRemoteControl | Contains a Command object and calls `Command::execute()` in `buttonWasPressed()` |

For an example remote control with more buttons,
see [remote control](../head-first-design-patterns/src/main/java/headfirst/designpatterns/command/remote). 
Using the `FunctionalInterface` annotation, it can be simplified without actually implementing different Command classes.



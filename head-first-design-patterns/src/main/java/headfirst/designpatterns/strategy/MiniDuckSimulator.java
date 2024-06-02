package headfirst.designpatterns.strategy;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

        FlyBehavior cantFly = () -> System.out.println("Can't fly");
        QuackBehavior squeak = () -> System.out.println("Squeak");
        RubberDuck rubberDuckie = new RubberDuck(cantFly, squeak);
        rubberDuckie.performFly();
        rubberDuckie.performQuack();

        DecoyDuck decoy = new DecoyDuck();
        decoy.performFly();
        decoy.performQuack();
    }
}

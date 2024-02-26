public class StrategyPattern {
    public static void main(String[] args) {
        Duck duck = new RubberDuck();
        duck.fly();
    }
}

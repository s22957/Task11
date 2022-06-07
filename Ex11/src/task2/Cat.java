package task2;

public final class Cat extends Animal implements Moveable {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void start() {
        System.out.println("Cat starts!");
    }

    @Override
    public void stop() {
        System.out.println("Cat stopped!");
    }

    @Override
    protected String getType() {
        return "Cat";
    }
}

package factorymethod;

public abstract class Car {
    protected int hp;
    protected int price;
    protected  String color;

    public abstract int getPrice();
    public abstract int getHp();
    public abstract String getColor();


}

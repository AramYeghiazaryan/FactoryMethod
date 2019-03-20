package factorymethod;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();

        Scanner in = new Scanner(System.in);
        String carName = in.nextLine();

        Car car = carFactory.getCarFactory(carName);
        System.out.println(car.getColor());

    }
}

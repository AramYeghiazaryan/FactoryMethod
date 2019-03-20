package factorymethod;

public class CarFactory {

    public Car getCarFactory(String carName){
        if(carName==null){
            return null;
        }
        if(carName.toLowerCase().equals("bmw")){
            return new Bmw();
        }
        if (carName.toLowerCase().equals("mercedes")){
            return new Mercedes();
        }
        if(carName.toLowerCase().equals("toyota")){
            return new Toyota();
        }
        return null;
    }


}

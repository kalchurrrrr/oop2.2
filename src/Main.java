public class Main {
    public static void main(String[] args) {
        Car car = new Car("автомобиль 1", 4);
        Car car2 = new Car("автомобиль 2", 4);
        Truck truck = new Truck("грузовик 1", 6);
        Truck truck2 = new Truck("грузовик 2", 8);
        Bicycle bicycle = new Bicycle("велосипед 1", 2);
        Bicycle bicycle2 = new Bicycle("велосипед 2", 2);

        ServiceStation station = new ServiceStation();
        station.check(car);
        station.check(car2);
        station.check(bicycle);
        station.check(bicycle2);
        station.check(truck);
        station.check(truck2);
    }
}
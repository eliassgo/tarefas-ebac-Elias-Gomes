public class EconomyCarFactory implements Factory{
    public Car createSportsCar() {
        return new SportsCar();
    }

    public Car createCompactCar() {
        return new CompactCar();
    }
}

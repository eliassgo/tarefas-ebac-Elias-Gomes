
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

        public static void main(String[] args) {
            Factory factory = new LuxuryCarFactory();
            Car sportsCar = factory.createSportsCar();
            Car compactCar = factory.createCompactCar();

            sportsCar.assemble();
            compactCar.assemble();

            Factory economyFactory = new EconomyCarFactory();
            Car economySportsCar = economyFactory.createSportsCar();
            Car economyCompactCar = economyFactory.createCompactCar();

            economySportsCar.assemble();
            economyCompactCar.assemble();
        }
}
package Inheritance.needForSpeed;

class RaceMotorcycle extends Motorcycle{
    public RaceMotorcycle(double fuel, int horsePower) {
        super(fuel, horsePower);
        setFuelConsumption(8);
    }
}

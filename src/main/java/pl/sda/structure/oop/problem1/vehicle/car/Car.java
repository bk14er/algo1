package pl.sda.structure.oop.problem1.vehicle.car;

import pl.sda.structure.oop.problem1.vehicle.Vehicle;

public class Car extends Vehicle {

    //np. FORD
    private CarBrand brand;

    //np. Focus
    private BrandType brandType;

    public Car(CarBrand brand, BrandType brandType) {
        this.brand = brand;
        this.brandType = brandType;
    }
}

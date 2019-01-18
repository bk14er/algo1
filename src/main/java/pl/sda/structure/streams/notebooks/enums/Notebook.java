package pl.sda.structure.streams.notebooks.enums;

import java.time.Year;

public class Notebook {

    //Nazwa laptopa
    private final String name;
    //Producent
    private final Brand brand;
    private final Year yearOfProduction;
    private final double price;
    //Czy dostępny w sklepie
    private final boolean available;

    public Notebook(String name, Brand brand, Year yearOfProduction, double price, boolean available) {
        this.name = name;
        this.brand = brand;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
        this.available = available;
    }

    public String getName() {
        return name;
    }

    public Brand getBrand() {
        return brand;
    }

    public Year getYearOfProduction() {
        return yearOfProduction;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return available;
    }

}

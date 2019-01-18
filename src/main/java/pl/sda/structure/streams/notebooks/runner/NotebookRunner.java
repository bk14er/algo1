package pl.sda.structure.streams.notebooks.runner;

import pl.sda.structure.streams.notebooks.enums.Brand;
import pl.sda.structure.streams.notebooks.enums.Notebook;

import java.time.Year;
import java.util.HashSet;
import java.util.Set;

public class NotebookRunner {

    private final static Set<Notebook> notebooks = new HashSet<>();
    static {
        //to jest statyczny blok inicjalizacyjny, wykona sie tylko raz w calej aplikacji
        notebooks.add(new Notebook("Very old name", Brand.ACER, Year.of(1990), 5.0, false));
        notebooks.add(new Notebook("L702", Brand.DELL, Year.of(2007), 100.0, false));
        notebooks.add(new Notebook("XPS 15", Brand.DELL, Year.of(2018), 10000.0, true));
        notebooks.add(new Notebook("Galaxy Book 12", Brand.SAMSUNG, Year.of(2016), 3199.0, true));
        notebooks.add(new Notebook("MacBook Pro", Brand.APPLE, Year.of(2018), 12099.0, true));
        notebooks.add(new Notebook("MacBook", Brand.DELL, Year.of(2018), 5000, true));
        notebooks.add(new Notebook("MacBook Air", Brand.DELL, Year.of(2018), 6000, true));
    }
    public void run() {

        //Tutaj dodaj kod swojej aplikacji




    }

}

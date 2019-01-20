package pl.sda.structure.map.library;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BookRunner {

    public static void main(String args[]){


        Set<Book> books = new LinkedHashSet<>();

        books.add(new Book("1234-431",BookType.FANTASY,"Andrzej Sapkowski", "Wiedzmin"));
        books.add(new Book("1234-431",BookType.FANTASY,"Jacek Piekara", "Łowcy dusz"));
        books.add(new Book("643-12-324",BookType.TECHNICAL,"Herbert Schidt", "Java.Kompedium Wiedzy"));
        books.add(new Book("99-643-12",BookType.TECHNICAL,"Joshua Bloch", "Java.Efektywne programowanie"));
        books.add(new Book("78-981-89",BookType.TECHNICAL,"Cay S.Horstmann", "Java. Podstawy"));
        books.add(new Book("43-378-21",BookType.TECHNICAL,"Cay S.Horstmann", "Java. Techniki Zaawansowane cz.1"));
        books.add(new Book("41-378-21",BookType.TECHNICAL,"Cay S.Horstmann", "Java. Techniki Zaawansowane cz.2"));
        books.add(new Book("11-46-12",BookType.STORY,"Monika Karkosza", "Przed i za Dubajem"));
        books.add(new Book("11-46-12",BookType.STORY,"Sebastian Szeliga", "Mój Czysty Salonik"));

        Map<BookType, List<Book>> bookTypeListMap = groupByBookType();


    }

    public static Map<BookType, List<Book>> groupByBookType(){
        //TODO Zwróc mape z pogrupowanymi wartościami wedługo typu zwrotnego
        return null;
    }

}

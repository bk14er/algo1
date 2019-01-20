package pl.sda.structure.students;

import pl.sda.structure.students.model.Student;
import pl.sda.structure.students.model.StudyType;
import pl.sda.structure.students.model.YearOfStudy;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentFilterRunner {

    private static List<Student> students = new ArrayList<>();

    //Statyczny blok - wykonywany tylko raz
    static {
        // 1 ROK inzynierskie
        students.add(new Student(new BigDecimal(2.44), 55, "Witek",
                YearOfStudy.ONE, StudyType.INZ, LocalDate.of(1990, 12, 22)));
        students.add(new Student(new BigDecimal(4.64), 155, "Ania",
                YearOfStudy.ONE, StudyType.INZ, LocalDate.of(1991, 7, 1)));
        students.add(new Student(new BigDecimal(5.0), 144, "Maurycy",
                YearOfStudy.ONE, StudyType.INZ, LocalDate.of(1990, 4, 13)));
        students.add(new Student(new BigDecimal(2.74), 65, "Wincenty",
                YearOfStudy.ONE, StudyType.INZ, LocalDate.of(1991, 2, 16)));
        students.add(new Student(new BigDecimal(3.74), 87, "Jola",
                YearOfStudy.ONE, StudyType.INZ, LocalDate.of(1990, 01, 17)));

        // 2 ROK inzynierskie
        students.add(new Student(new BigDecimal(1.4), 5, "Brajan",
                YearOfStudy.TWO, StudyType.INZ, LocalDate.of(1990, 12, 14)));
        students.add(new Student(new BigDecimal(2.66), 45, "Jessica",
                YearOfStudy.TWO, StudyType.INZ, LocalDate.of(1989, 7, 11)));
        students.add(new Student(new BigDecimal(5.11), 185, "Robert",
                YearOfStudy.TWO, StudyType.INZ, LocalDate.of(1989, 6, 1)));
        students.add(new Student(new BigDecimal(3.71), 117, "Ragnar",
                YearOfStudy.TWO, StudyType.INZ, LocalDate.of(1990, 3, 6)));
        students.add(new Student(new BigDecimal(3.51), 121, "Witek",
                YearOfStudy.TWO, StudyType.INZ, LocalDate.of(1989, 01, 13)));

        // 3 ROK inzynierskie
        students.add(new Student(new BigDecimal(4.44), 157, "Tymek",
                YearOfStudy.THREE, StudyType.INZ, LocalDate.of(1988, 9, 10)));
        students.add(new Student(new BigDecimal(3.61), 136, "Karol",
                YearOfStudy.THREE, StudyType.INZ, LocalDate.of(1988, 11, 20)));
        students.add(new Student(new BigDecimal(4.66), 176, "Magda",
                YearOfStudy.THREE, StudyType.INZ, LocalDate.of(1988, 8, 14)));
        students.add(new Student(new BigDecimal(3.64), 145, "Zosia",
                YearOfStudy.THREE, StudyType.INZ, LocalDate.of(1988, 6, 19)));
        students.add(new Student(new BigDecimal(5.74), 160, "Angelika",
                YearOfStudy.THREE, StudyType.INZ, LocalDate.of(1988, 04, 7)));

        // 4 ROK studia licencjackie
        students.add(new Student(new BigDecimal(3.64), 125, "Jarek",
                YearOfStudy.FOUR, StudyType.LIC, LocalDate.of(1987, 2, 15)));
        students.add(new Student(new BigDecimal(5.14), 178, "Donald",
                YearOfStudy.FOUR, StudyType.LIC, LocalDate.of(1987, 1, 17)));
        students.add(new Student(new BigDecimal(5.00), 189, "Mateusz",
                YearOfStudy.FOUR, StudyType.LIC, LocalDate.of(1987, 11, 6)));
        students.add(new Student(new BigDecimal(1.68), 15, "Zbigniew",
                YearOfStudy.FOUR, StudyType.LIC, LocalDate.of(1987, 9, 9)));
        students.add(new Student(new BigDecimal(1.34), 30, "Adam",
                YearOfStudy.FOUR, StudyType.LIC, LocalDate.of(1977, 4, 7)));

        //5 rok studia magisterskie
        students.add(new Student(new BigDecimal(3.44), 75, "Andrzej",
                YearOfStudy.FIVE, StudyType.MGR, LocalDate.of(1986, 12, 22)));
        students.add(new Student(new BigDecimal(2.14), 10, "Robert",
                YearOfStudy.FIVE, StudyType.MGR, LocalDate.of(1986, 7, 1)));
        students.add(new Student(new BigDecimal(3.12), 77, "Paweł",
                YearOfStudy.FIVE, StudyType.MGR, LocalDate.of(1986, 4, 13)));
        students.add(new Student(new BigDecimal(4.68), 90, "Radek",
                YearOfStudy.FIVE, StudyType.MGR, LocalDate.of(1986, 2, 16)));
        students.add(new Student(new BigDecimal(2.7), 45, "Vladimir",
                YearOfStudy.FIVE, StudyType.MGR, LocalDate.of(1986, 01, 17)));

    }

    public static void main(String args[]) {
        List<Student> studenciNaPiatymRoku = filterOnlyWith5YearOfStudy(students);

        List<Student> studenciBezPromocjiNaRokNastepny = filerAllStudentsWhereAverageLessThan2(students);

        List<Student> studenciZNagrodaMinistra = filterAllStudentsWhereAverageGreaterThan5(students);

        List<Student> liczbaInzynierow = countEngineers(students);

        List<Student> sredniaPomiedzy4a5 = filterStudentWithAvgBetween4And5(students);

        List<Student> uczniowieUrodzeniZaKomuny = filterAllWhereBirdthDayBefore89(students);
    }


    /**
     * Pobierz studentów na piątym roku
     */
    private static List<Student> filterOnlyWith5YearOfStudy(List<Student> students) {
        return students.stream()
                .filter(s->s.getYearOfStudy().equals(YearOfStudy.FIVE))
                .collect(Collectors.toList());
    }

    /**
     * Zwraca studentów których średnia jest mniejsza od 2.0
     */
    private static List<Student> filerAllStudentsWhereAverageLessThan2(List<Student> students) {
        return null;
    }

    /**
     * zwraca tylko inżynierów na uczelni
     */
    private static List<Student> countEngineers(List<Student> students) {
        //TODO
        return null;
    }


    /**
     * Pobierz studentów którrzy maja średnią ocen >5
     */
    private static List<Student> filterAllStudentsWhereAverageGreaterThan5(List<Student> students) {
        //TODO
        return null;
    }


    /**
     * Zwraca studentów ze średnią pomiędzy 4.0 a 5.0
     */
    private static List<Student> filterStudentWithAvgBetween4And5(List<Student> students) {
        //TODO
        return null;
    }


    /**
     * Zwraca studentów urodzonych przed rokiem 89 tj. LocalDate.of(1989, 12, 31))
     */
    private static List<Student> filterAllWhereBirdthDayBefore89(List<Student> students) {
        //TODO
        return null;
    }

}

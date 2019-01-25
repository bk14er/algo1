package pl.sda.algorithm.common.advanced;

public class Compressor {


    public String compress(String str) {
        // Użyj klasy StringBuilder i metody append()
        StringBuilder compressed = new StringBuilder();

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            count++;

            //Pobrania znaku na i-tej pozycji:
            str.charAt(i);

            // jeśli  (str[i] != str[i+1]) lub (warunek na ostatni element)
            // w taki wypadku wywolaj metodę compressed.append(str[i]).append(count)

        }
        // Nie zapomnij o warunku:
        //"Jeśli skompresowany ciąg znaków nie jest mniejszy od oryginału - zwróc oryginał"
        return compressed.length() < str.length() ? compressed.toString() : str ;
    }
}

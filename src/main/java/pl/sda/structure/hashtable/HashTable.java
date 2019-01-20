package pl.sda.structure.hashtable;

public class HashTable {


    private int INITIAL_SIZE = 16;
    private HashEntry[] data; // LinkedList

    class HashEntry {
        String key;
        String value;
        HashEntry next;

        HashEntry(String key, String value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    HashTable() {
        data = new HashEntry[INITIAL_SIZE];
    }

    public void put(String key, String value) {

        // Pobierz indeks
        int index = getIndex(key);

        // Tworzymy anagloczinie jak dla LinkedList-> Node, obiekt Entry
        HashEntry entry = new HashEntry(key, value);

        // Jeśli nie istnieje - dodajemy
        if (data[index] == null) {
            data[index] = entry;
        }
        // Kolizja - dla podanego klucza wyliczono już indeks który się znajduję w liscie
        else {
            HashEntry entries = data[index];
            // Iterujemy do ostatniego elementu
            while (entries.next != null) {
                entries = entries.next;
            }
            // Dodajemy na koncu nowy wpis
            entries.next = entry;
        }
    }

    public String get(String key) {

        // Pobierz indeks
        int index = getIndex(key);

        // Pobierz z listy dla danego indeksu
        HashEntry entries = data[index];

        // Jeśli nie istnieje musimy przeszukać linkedListed
        if (entries != null) {
            // Iterujemy aż znajdziemy szukaną wartość
            while (!entries.key.equals(key) && entries.next != null) {
                entries = entries.next;
            }
            // Zwracamy wartość
            return entries.value;
        }

        // Jeśli nie odnalzeiono dla podanego klucza wartości - zwróć null
        return null;
    }

    private int getIndex(String key) {
        // Pobierz hashcode dla obiektu String
        int hashCode = key.hashCode();
        System.out.println("hashCode = " + hashCode);

        if (hashCode < 0) {
            hashCode = hashCode * -1;
        }


        // Konwersja hashCodu na indeks - nasza funkcja haszująca
        // int index = (hashCode & 0x7fffffff) % INITIAL_SIZE;
        int index = hashCode % INITIAL_SIZE;

        // Zakardkodowane - tylko dla testów
        if (key.equals("John Smith") || key.equals("Sandra Dee")) {
            index = 4;
        }

        System.out.println("index = " + index);

        return index;
    }

    @Override
    public String toString() {
        int bucket = 0;
        StringBuilder hashTableStr = new StringBuilder();
        for (HashEntry entry : data) {
            if (entry == null) {
                continue;
            }
            hashTableStr.append("\n bucket[")
                    .append(bucket)
                    .append("] = ")
                    .append(entry.toString());
            bucket++;
            HashEntry temp = entry.next;
            while (temp != null) {
                hashTableStr.append(" -> ");
                hashTableStr.append(temp.toString());
                temp = temp.next;
            }
        }
        return hashTableStr.toString();
    }

}

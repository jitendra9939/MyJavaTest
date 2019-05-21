package solidPrinciple;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

class Journal {
    private final List<String> entries = new ArrayList<String>();
    private int count = 0;

    public void addEntry(String value) {
        entries.add(" " + (++count) + ": " + value);
    }

    public void removeEntry(int index) {
        entries.remove(index);
    }

    @Override
    public String toString() {
        return String.join(System.lineSeparator(), entries);
    }

    public void save(String fileName) throws FileNotFoundException {
        try (PrintStream out = new PrintStream(fileName)) {
            out.println(toString());
        }
    }

    public void load(String fileName) {
    }

    public void load(URL url) {
    }
}

class Persistence {
    public void saveFile(Journal journal, String fileName, boolean overwrite) {
        if (overwrite || new File(fileName).exists()) {

        }
    }

}

class TestDemo {
    public static void main(String[] args) throws Exception {
        Journal journal = new Journal();
        journal.addEntry("today is Wednesday");
        journal.addEntry("i run the program");
        System.out.println(journal);
    }
}

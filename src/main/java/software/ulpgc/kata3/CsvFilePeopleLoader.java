package software.ulpgc.kata3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CsvFilePeopleLoader implements PeopleLoader {

    private final File file;

    public static PeopleLoader with(File file){
        return new CsvFilePeopleLoader(file);}

    private CsvFilePeopleLoader(File file) {
        this.file = file;
    }


    @Override
    public List<People> load() {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))){
            return load(reader);

        } catch (IOException e) {
            return Collections.emptyList();
        }
    }

    private List<People> load(BufferedReader reader) throws IOException {
        List<People> result = new ArrayList<>();
        reader.readLine();
        while(true){
            String line = reader.readLine();
            if (line == null) return result;
            result.add(toPeople(line));
        }

    }

    private People toPeople(String line) {
        return toPeople(line.split(","));
    }

    private People toPeople(String[] split) {
        return new People(
                Integer.parseInt(split[0]),
                split[1],
                split[2],
                split[3],
                split[4],
                split[5],
                split[6],
                split[7],
                split[8]
        );
    }
}

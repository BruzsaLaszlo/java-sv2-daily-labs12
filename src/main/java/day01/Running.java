package day01;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Running {

    private Path path = Path.of("src/main/resources/running.csv");

    public Running(Path path) {
        if (path != null) {
            this.path = path;
        }
    }

    public double getSumOf(int year, int month) {
        double sum = 0;
        for (Run run : getRuns()) {
            if (run.date().getYear() == year && run.date().getMonthValue() == month) {
                sum += run.km();
            }
        }
        return sum;
    }

    private List<Run> getRuns() {
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            reader.readLine();
            var result = new ArrayList<Run>();
            while (reader.ready()) {
                Run run = getRunFromLine(reader.readLine());
                result.add(run);
            }
            return result;
        } catch (IOException e) {
            throw new IllegalStateException("file not found");
        }
    }

    private Run getRunFromLine(String line) {
        var data = line.split(";");
        double km = Double.parseDouble(data[0].split(" ")[0]);
        LocalDate date = LocalDate.parse(data[1]);
        return new Run(km, date);
    }

}

package day01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Running {

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
        try {
            var result = new ArrayList<Run>();
            var lines = Files.readAllLines(Path.of("src/main/resources/running.csv"));
            boolean first = true;
            for (String line : lines) {
                if (first) {
                    first = false;
                } else {
                    var data = line.split(";");
                    double km = Double.parseDouble(data[0].split(" ")[0]);
                    LocalDate date = LocalDate.parse(data[1]);
                    result.add(new Run(km, date));
                }
            }
                return result;
            } catch(IOException e){
                throw new IllegalStateException("file can not read ");
            }
        }

    }

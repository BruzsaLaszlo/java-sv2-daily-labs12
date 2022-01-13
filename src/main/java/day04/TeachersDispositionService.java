package day04;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TeachersDispositionService {

    Path path = Path.of("src/main/resources/beosztas.txt");

    public int getLessonsInHour(String teacherName) {
        return getAllTeacherFromFile()
                .stream()
                .filter(teachersDisposition -> teachersDisposition.nameOfTeacher().equals(teacherName))
                .mapToInt(TeachersDisposition::lessonInHour)
                .sum();
    }

    private List<TeachersDisposition> getAllTeacherFromFile() {
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            var teachers = new ArrayList<TeachersDisposition>();
            while (reader.ready()) {
                teachers.add(getTeacher(reader));
            }
            return teachers;
        } catch (IOException e) {
            throw new IllegalStateException("can not read file " + path);
        }
    }

    private TeachersDisposition getTeacher(BufferedReader reader) throws IOException {
        return new TeachersDisposition(
                reader.readLine(),
                reader.readLine(),
                reader.readLine(),
                Integer.parseInt(reader.readLine())
        );
    }

}

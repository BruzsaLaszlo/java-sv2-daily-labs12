package day04;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TeachersDisposition {

    Path path = Path.of("src/main/resources/beosztas.txt");

    public int getLessonsInHour(String teacherName) {
        return getAllTeacherFromFile()
                .stream()
                .filter(teacher -> teacher.nameOfTeacher().equals(teacherName))
                .mapToInt(Teacher::lessonInHour)
                .sum();
    }

    private List<Teacher> getAllTeacherFromFile() {
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            var teachers = new ArrayList<Teacher>();
            while (reader.ready()) {
                teachers.add(getTeacher(reader));
            }
            return teachers;
        } catch (IOException e) {
            throw new IllegalStateException("can not read file " + path);
        }
    }

    private Teacher getTeacher(BufferedReader reader) throws IOException {
        return new Teacher(
                reader.readLine(),
                reader.readLine(),
                reader.readLine(),
                Integer.parseInt(reader.readLine())
        );
    }

}

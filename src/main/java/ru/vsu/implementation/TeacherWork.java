package ru.vsu.implementation;

import ru.vsu.entity.Student;
import ru.vsu.entity.Subject;
import ru.vsu.entity.Teacher;
import ru.vsu.logic.TeacherService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TeacherWork implements TeacherService {
    @Override
    public List<String> getSingleSubjectLecturerFio(Collection<Teacher> teachers) {
        return teachers.stream()
                .filter(teacher -> teacher.getSubjects().size() == 1)
                .map(teacher -> teacher.getFullName())
                .collect(Collectors.toList());
    }

    @Override
    public Map<String, List<Student>> getTeacherNameToSupervisedStudentsMap(Collection<Student> students) {
        return null;
    }

    @Override
    public BigDecimal getTeachersSalarySum(Collection<Teacher> teachers) {
        return null;
    }

    @Override
    public String findTeacherBySubject(Collection<Teacher> teachers, Subject subject) {
        return null;
    }
}

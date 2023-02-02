package ru.vsu.implementation;

import ru.vsu.entity.Student;
import ru.vsu.logic.StudentService;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public class StudentWork implements StudentService {
    @Override
    public List<String> getAdultStudentsLastNameSorted(Collection<Student> students) {

        return null;
    }

    @Override
    public Set<Student> getExcellentStudents(Collection<Student> students) {
        return null;
    }

    @Override
    public Double getAverageMark(Collection<Student> students) {
        return null;
    }

    @Override
    public Student findYoungestStudent(Collection<Student> students) {
        return null;
    }
}

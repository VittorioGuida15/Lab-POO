package it.unisa.student;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class StudentTest {
    @Test
    public void newStudentTest() {
        Student student = new Student("Dario", "Di Nucci");
        Assert.assertEquals("Dario", student.getFirstName());
        Assert.assertEquals("Di Nucci", student.getLastName());
        Assert.assertTrue(student.getExams().isEmpty());
    }

    @Test
    public void oneExamTest() {
        Student student = new Student("Dario", "Di Nucci");

        Exam exam = new Exam("Object Oriented Programming", new GregorianCalendar(2023, Calendar.JANUARY, 10), 30);
        student.registerExam(exam);

        Assert.assertEquals(1, student.getExams().size(), 0);
        Assert.assertEquals(30, student.computeAverageGrade(), 0);
    }

    @Test
    public void twoExamTest() {
        Student student = new Student("Dario", "Di Nucci");

        Exam exam1 = new Exam("Object Oriented Programming", new GregorianCalendar(2023, Calendar.JANUARY, 10), 30);
        student.registerExam(exam1);

        Exam exam2 = new Exam("Software Engineering", new GregorianCalendar(2024, Calendar.JANUARY, 20), 28);
        student.registerExam(exam2);

        Assert.assertEquals(2, student.getExams().size(), 0);
        Assert.assertEquals(29, student.computeAverageGrade(), 0);
    }

    @Test
    public void studentsOrderTest() {
    List<Student> list = new ArrayList<>();

    Student s1 = new Student("Giacomo", "Verdi");
    Student s2 = new Student("Fabio", "Rossi");
    Student s3 = new Student("Alfonso", "Neri");
    Student s4 = new Student("Vito", "Blu");
    Student s5 = new Student("Vincenzo", "Viola");

    list.add(s1);
    list.add(s2);
    list.add(s3);
    list.add(s4);
    list.add(s4);

    Collections.sort(list);
    Assert.assertEquals(s4, list.get(0));
    Assert.assertEquals(s1, list.get(4));
    }
}
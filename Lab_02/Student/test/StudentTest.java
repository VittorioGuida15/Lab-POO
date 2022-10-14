import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class StudentTest {
    @Test
    public void testRegisterExam(){
        List<Exam> test = new ArrayList<>();
        Student student = new Student("Pippo", "Pluto");
        GregorianCalendar d = new GregorianCalendar();
        Exam exam = new Exam("Italiano", d, 8);
        test.add(exam);
        student.registerExam(exam);
        Assert.assertEquals(test, student.getExams());
    }

    @Test
    public void testComputeAverageGrade() {
        Student student = new Student("Pippo", "Pluto");
        GregorianCalendar d = new GregorianCalendar();
        Exam exam = new Exam("Italiano", d, 8);
        Exam exam1 = new Exam("Matematica", d, 9);
        Exam exam2 = new Exam("Storia", d, 6);
        student.registerExam(exam);
        student.registerExam(exam1);
        student.registerExam(exam2);
        double aspettativa = (8 + 9 + 6) / 3.0;
        Assert.assertEquals(aspettativa, student.computeAverageGrade(), 0);

    }
}
import com.montrealcollege.exercise3.entities.Program;
import com.montrealcollege.exercise3.entities.Students;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/beans.xml");

        Program spring = context.getBean("spring", Program.class);
        Students stu1 = context.getBean("david", Students.class);
        Students stu2 = context.getBean("laryne", Students.class);
        Students stu3 = context.getBean("john", Students.class);

        System.out.println("Program name: " + spring.getName());
        System.out.println("Program duration: " + spring.getDuration() + " weeks");
        System.out.println("\nStudent name: " + stu1.getFirstName() + " " + stu1.getLastName());
        System.out.println("Enrolled in: " + stu1.getProgram().getName());
        System.out.println("\nStudent name :" + stu2.getFirstName() + " " + stu2.getLastName());
        System.out.println("Enrolled in: " + stu2.getProgram().getName());
        System.out.println("\nStudent name: " + stu3.getFirstName() + " " + stu3.getLastName());
        System.out.println("Enrolled in: " + stu3.getProgram().getName());
    }
}

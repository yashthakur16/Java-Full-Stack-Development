import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student
{
    int age;
    String name;

    public Student(int age, String name)
    {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "Student{" + "age=" + age + ", name='" + name + "}";
    }
}


public class comparetor2 
{
    public static void main(String[] args)
    {


        Comparator<Student> com =(Student i, Student j)->  i.age>j.age?1:-1;

        // {
        //     if(i.age>j.age) return 1;
        //     else
        //     return -1;
        // };
        List<Student> studs=new ArrayList<Student>();

        studs.add(new Student(16,"Yash"));
        studs.add(new Student(26,"Vishrut"));
        studs.add(new Student(22,"Rohan"));
        studs.add(new Student(21,"Shrikunj"));

        System.out.println(studs);

        for(Student s :studs)
        {
            System.out.println(s);
        }

        Collections.sort(studs,com);

        System.out.println(studs);

        for(Student s :studs)
        {
            System.out.println(s);
        }
    }
}

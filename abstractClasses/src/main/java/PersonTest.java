/**
 * Created by ScorpionOrange on 2016/06/30.
 * This program demonstrates abstract classes.
 */
public class PersonTest {

    public static void main(String[] args){
        Person[] people = new Person[3];
        //fill the people array with Student and Employee objects
        people[0] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        people[1] = new Student("Maria Morris", "Computer Science");
        Employee boss = new Employee("Hugo Boss", 50000, 2000, 11, 11);
        people[2] = boss;
        boss.raiseSalary(100);

        //print out names and descriptions of all Person objects
        for(Person p : people){
            System.out.println(p.getName() + ", " + p.getDescription());
        }
    }
}

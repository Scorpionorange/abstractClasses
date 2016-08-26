import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by ScorpionOrange on 2016/06/29.
 */
public class Employee extends Person {

    private double salary;
    private Date hireDay;

    public Employee(String aName, double aSalary, int year, int month, int day){
        super(aName);
        salary = aSalary;
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        hireDay = calendar.getTime();
    }

    public double getSalary(){
        return salary;
    }

    public Date getHireDay(){
        return hireDay;
    }

    public String getDescription(){
        return String.format("an employee with a salary of $%.2f", salary);
    }

    public void raiseSalary(double byPercent){
        salary = salary * (1 + byPercent / 100);
    }
}

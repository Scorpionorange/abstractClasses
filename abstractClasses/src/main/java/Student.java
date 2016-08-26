/**
 * Created by ScorpionOrange on 2016/06/30.
 */
public class Student extends Person {

    private String major;

    /**
     * @param aName the student's name.
     * @param aMajor the student's major.
     */
    public Student(String aName, String aMajor){
        //pass aName to superclass constructor
        super(aName);
        major = aMajor;
    }

    public String getDescription(){
        return "a student majoring in " + major;
    }
}

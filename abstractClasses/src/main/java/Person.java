/**
 * Created by ScorpionOrange on 2016/06/29.
 */
public abstract class Person {

    public abstract String getDescription();
    private String name;

    public Person(String aName){
        name = aName;
    }

    public String getName(){
        return name;
    }
}

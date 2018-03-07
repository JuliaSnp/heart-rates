

/**
 *
 * @author Julia
 */
public class HeartRates {

    private String firstName;
    private String lastName;
    private int year;
    private int age;
    private int maxRate;
    private double targetLower;
    private double targetHigher;



    public HeartRates() {
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


//calculations
public int calcAge(){
    age=2017-year;
    return age;
}


public int calcMax(){
    maxRate=220-age;
    return maxRate;
}



public double calcLower(){
    targetLower=maxRate*0.5;
    return targetLower;
}

public double calcHigher(){
   targetHigher=maxRate*0.85;
   return targetHigher;
}

}

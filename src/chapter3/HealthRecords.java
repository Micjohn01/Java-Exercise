package chapter3;
import java.time.LocalDate;
public class HealthRecords {
    private String firstName;
    private String lastName;
    private String gender;
    private int day;
    private int month;
    private int yearOfBirth;
    private int heightInInches;
    private int weightInPounds;
    private int heightInches;

    public HealthRecords(String firstName, String lastName, String gender, int day, int month, int yearOfBirth, int heightInInches, int weightInPounds){
        this.firstName = firstName;

        this.lastName = lastName;

        this.day = day;

        this.month = month;

        this.yearOfBirth = yearOfBirth;

        this.heightInInches = heightInInches;

        this.weightInPounds = weightInPounds;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setDay(int day){
        this.day = day;
    }

    public int getDay(){
        return day;
    }

    public void setMonth(int month){this.month = month; }

    public int getMonth(){return month;}

    public void setYearOfBirth(int yearOfBirth){this.yearOfBirth = yearOfBirth;}

    public int getYearOfBirth(){return yearOfBirth;}

    public void setGender(String gender){
        this.gender = gender;
    }
    public String getGender(){
        return gender;
    }

    public void setHeightInInches(int heightInInches){
        this.heightInInches = heightInInches;
    }

    public int getHeightInInches(){
        return heightInInches;
    }

    public void setWeightInPounds(int weightInPounds){this.weightInPounds = weightInPounds;}

    public int getWeightInPounds() {return weightInPounds ;}

    public int getAge(){
        return LocalDate.now().getYear() - yearOfBirth;
    }

    public String getDateOfBirth () {
        return (yearOfBirth + ":" + month + ":" + day);
    }
    public int getMaximumHeartRate() {
        return 220 - (LocalDate.now().getYear() - yearOfBirth);
    }
    public int getTargetHeartRateFor50(){
        return (int) (0.5 * getMaximumHeartRate());
    }
    public int getTargetHeartRateFor85(){
        return (int) (0.85 * getMaximumHeartRate());
    }
    public int getTotalTargetHeartRate1(){
        return getTargetHeartRateFor50();
    }
    public int getTotalTargetHeartRate2(){
        return getTargetHeartRateFor85();
    }
    public int getBodyMassIndex(){
        return (weightInPounds * 703)/ (heightInInches * heightInInches);

    }
}

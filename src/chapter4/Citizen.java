package chapter4;

import java.math.BigDecimal;

public class Citizen {
    private String firstName;
    private String surname;

    private BigDecimal earning;

    public Citizen() {
    }

    public Citizen(String firstName, String surname){
        this.firstName = firstName;
        this.surname = surname;
    }

    public Citizen(String firstName, String surname, BigDecimal amount){
        this(firstName, surname);
        earning = amount;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public BigDecimal getEarning() {
        return earning;
    }

    public void setEarning(BigDecimal earning) {
        this.earning = earning;
    }
}

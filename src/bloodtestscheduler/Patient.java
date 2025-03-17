/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

/**
 *
 * @author seanb
 */

//patient class for creating patient obj
public class Patient {
    
    //declaring variables for getting the patients details
    protected String fName, surname;
    protected int age;
    protected String priority;
    protected boolean hospitalWard;
    
    //declaring variables for getting the patients gp details
    protected String gpFName, gpSurname;
    protected String gpClinicName;
    protected int gpPhoneNumber;

    //patient constructor
    public Patient(String fName, String surname, int age, String priority, boolean hospitalWard, String gpFName, String gpSurname, String gpClinicName, int gpPhoneNumber) {
        this.fName = fName;
        this.surname = surname;
        this.age = age;
        this.priority = priority;
        this.hospitalWard = hospitalWard;
        this.gpFName = gpFName;
        this.gpSurname = gpSurname;
        this.gpClinicName = gpClinicName;
        this.gpPhoneNumber = gpPhoneNumber;
    }

    //getters and setters
    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public boolean isHospitalWard() {
        return hospitalWard;
    }

    public void setHospitalWard(boolean hospitalWard) {
        this.hospitalWard = hospitalWard;
    }

    public String getGpFName() {
        return gpFName;
    }

    public void setGpFName(String gpFName) {
        this.gpFName = gpFName;
    }

    public String getGpSurname() {
        return gpSurname;
    }

    public void setGpSurname(String gpSurname) {
        this.gpSurname = gpSurname;
    }

    public String getGpClinicName() {
        return gpClinicName;
    }

    public void setGpClinicName(String gpClinicName) {
        this.gpClinicName = gpClinicName;
    }

    public int getGpPhoneNumber() {
        return gpPhoneNumber;
    }

    public void setGpPhoneNumber(int gpPhoneNumber) {
        this.gpPhoneNumber = gpPhoneNumber;
    }

    @Override
    public String toString() {
        return "First Name: " + fName + ", Surname: " + surname + ", Age: " + age + 
                "\nPriority: " + priority + ", From Hospital Ward?: " + hospitalWard + 
                "\nGP First Name: " + gpFName + ", GP Surname: " + gpSurname + 
                "\nClinic Name: " + gpClinicName + 
                "\nGP Phone Number: " + gpPhoneNumber +
                "\n";
    }
    
  
}

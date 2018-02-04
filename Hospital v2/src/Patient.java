public class Patient {
    private String firstName;
    private String lastName;
    private String pesel;
 
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
 
    public String getPesel() {
        return pesel;
    }
 
    public void setPesel(String pesel) {
        this.pesel = pesel;
    }
     
    public Patient() {
         
    }
     
    public Patient(String firstName, String lastName, String pesel) {
        setFirstName(firstName);
        setLastName(lastName);
        setPesel(pesel);
    }
}

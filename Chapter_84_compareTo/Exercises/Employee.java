class Employee implements Comparable<Employee>{
    private String firstName;
    private String lastName;

    private int birthYear;

    String getFirstName()  { return firstName; }
    String getLastName()   { return lastName; }
    int    getBirthYear()  { return birthYear; }

    public Employee( String f, String l, int year )
    {
        firstName = f; 
        lastName = l; 
        birthYear = year;
    }

    public String toString(){ 
        return "Name: " + lastName + " " + firstName + " " + "birthyear: " + birthYear;
    }

    public int compareTo( Employee other ) { 
        if(getLastName().equals(other.getLastName()) == false){
            //return getLastName().compareTo(other.getLastName());
            return other.getLastName().compareTo(getLastName());
        }
        else if(getFirstName().equals(other.getFirstName()) == false){
            //return getFirstName().compareTo(other.getFirstName());
            return other.getFirstName().compareTo(getFirstName());
        }
        else{
            return other.getBirthYear() - getBirthYear();
        }
    }
}
public class HighStudent extends Student {
    private double gradeWeight;
    public HighStudent(String n, String i, double grade){
        name = n;
        id = i;
        this.gradeWeight = grade;
    }

    public void study(){
        System.out.println("High School student, " + name + " is studying really hard");
    }

    public String getName(){return name;}

    public String getStudentDetail(){
        return name + " : " + id + " : " + gradeWeight;
    }
}

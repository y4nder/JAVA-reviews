public class ElemStudent extends Student{
    private int gradeAverage;
    public ElemStudent(String n, String i, int grd){
        name = n;
        id = i;
        this.gradeAverage = grd;
    }
    public void study(){
        System.out.println("Elementary student, " + name + " is studying really hard");
    }
    
    public String getStudentDetail(){
        return name + " : " + id + " : " + gradeAverage;
    }
}

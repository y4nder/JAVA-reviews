public class Teacher extends Faculty {
    private String subject;
    private HighStudent[] studentsH;
    private ElemStudent[] studentsE;
    private int countH;
    private int countE;

    public Teacher(String n, String sub){
        name = n;
        this.subject = sub;
        this.studentsE = new ElemStudent[10];
        this.studentsH = new HighStudent[10];
        this.countE = 0;
        this.countH = 0;
    }

    public int getCountH() { return countH;}
    public int getCountC() { return countH;}
    public String getName() { return name; }

    public void work(){
        System.out.println("Teacher " + name + " is teaching " + subject);
    }

    public boolean enroll(HighStudent s){
        countH++;
        studentsH[countH-1] = s;
        return true;
    }

    public boolean enroll(ElemStudent s){
        countE++;
        studentsE[countE-1] = s;
        return true;
    }

    public void viewClassHigh(){
        System.out.println("Teacher " + name + "'s High School students");
        for(int i = 0; i < countH; i++ ){
            System.out.println( (i + 1) + ".) " + studentsH[i].getStudentDetail());
        }
    }

    public void viewClassElem(){
        System.out.println("Teacher " + name + "'s Elementary students");
        for(int i = 0; i < countE; i++ ){
            System.out.println( (i + 1) + ".) " + studentsE[i].getStudentDetail());
        }
    }
}

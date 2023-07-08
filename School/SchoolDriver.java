public class SchoolDriver {
    public static void main(String[] args){
        Principal p1 = new Principal("Jason");
        Teacher t1 = new Teacher("May", "English");
        HighStudent s1 = new HighStudent("Leander", "980", 1.5);
        ElemStudent s2 = new ElemStudent("Lorenzo", "89473", 90);
        t1.enroll(s1);
        t1.viewClassHigh();
    }    
}

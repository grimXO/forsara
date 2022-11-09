package Package1;

public class StudentSupportOffice {
    public static void main(String[] args) {
        Student s1 = new Student("U0000001");
        Student s2 = new Student("U0000002");
        Student s3 = new Student("U0000003");
        Student s4 = new Student("U0000004");
        Student s5 = new Student("U0000005");
        Module m1 = new Module("CIS2206");
        Module m2 = new Module("CIS2360");
        Module m3 = new Module("CIS2205");
        m1.enrol(s1);
        m1.enrol(s5);
        m2.enrol(s1);
        m2.enrol(s3);
        m2.enrol(s4);
        m3.enrol(s2);
        m3.enrol(s4);
        m3.enrol(s5);


        System.out.print(s1);
    }
}

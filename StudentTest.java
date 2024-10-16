public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "John";
        s.age = 19;
        s.studentid = 228228;
        s.semester = 3;
        s.avgrade = 4.3
        Student s2 = new Student();
        s2.name = "Michael";
        s2.age = 18;
        s2.studentid = 1488;
        s2.semester = 3;
        s2.avgrade = 4.2;

        s.sayHello();
        s.displayName();
        s.displayAge();
        s.getClass();

        s2.sayHello();
        s2.displayName();
        s2.displayAge();
        s2.getClass();
    }
}

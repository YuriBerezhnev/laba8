public class Main{
    public static void main(String[] args){
        Teacher teacher = new Teacher("Sargilaana", "Sivceva", 57);

        System.out.println(teacher);
        teacher.teach();
        teacher.walk();
        teacher.voice();
        teacher.run();


        Student student = new Student("Dugar", "Tudupov", 24);

        System.out.println(student);
        student.learn();
        student.walk();
        student.voice();
        student.run();
    }
}
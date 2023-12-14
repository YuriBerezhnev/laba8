public class Student extends People{
    public Student(String name, String last_name, int age){
        super(name, last_name, age);
    }

    void learn(){
        System.out.println("Person learning");}
}
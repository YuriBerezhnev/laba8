public class Teacher extends People{
    public Teacher(String name, String last_name, int age){
        super(name, last_name, age);
    }

    void teach(){
        System.out.println("Person teaching");
    }
}
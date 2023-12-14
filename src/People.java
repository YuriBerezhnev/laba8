public class People{
    protected String name;
    protected String last_name;
    protected int age;

    public People(String name, String last_name, int age){
        this.name = name;
        this.last_name = last_name;
        this.age = age;
    }

    public String toString(){
        return "last_name = " + last_name + ", " +
                "name = " + name + ", " +
                "age = " + age;
    }

    public void walk(){
        System.out.println("Person walking");
    }
    public void voice(){
        System.out.println("Person speaking");
    }
    public void run(){
        System.out.println("Person running");
    }
}
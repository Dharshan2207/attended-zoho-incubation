public class Student {
    private String  name;
    private int age;
    private String id;

    Student(int age, String name, String id){
        this.age = age;
        this.name = name;
        this.id = id;
    }

    String  getName(){
        return name;
    }
    int getAge(){
        return age;
    }
    String getId(){
        return id;
    }

    void putName(String name){
        this.name = name;
    }

}

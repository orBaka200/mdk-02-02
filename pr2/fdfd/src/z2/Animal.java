package z2;

public class Animal {
    private String name;
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    Animal(String n, int a){
        setAge(a);
        setName(n);
    }
    String print(){
        return null;
    }
}

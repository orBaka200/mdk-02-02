package zs;

public class Mother {
    Mother(String n){
        setName(n);
    }
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }

     void print() {
        System.out.println("Мать:"+getName());
    }
}

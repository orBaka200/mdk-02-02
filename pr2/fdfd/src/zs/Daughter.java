package zs;

public class Daughter extends Mother{
    Daughter(String n) {
        super(n);
    }
        @Override
        void print(){

        System.out.println("Дочь:"+getName());
    }
}

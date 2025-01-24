package z2;

public class Delphin extends Animal{
    private String text;

    Delphin(String n, int a) {
        super(n,a);
    }

    public String getText() {
        return text;
    }
    public void setText(String text){
        this.text=text;
    }
    @Override
    String print() {
        String res = ("Животное:" + getName() + "Возраст:" + getAge() + "Описание:" + getText());
        return  res;
    }
}



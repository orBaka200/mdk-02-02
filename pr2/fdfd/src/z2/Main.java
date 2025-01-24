package z2;
import java.util.Scanner;
public class Main{
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        Zebra z1 = new Zebra("Ник", 3);
        Delphin d1 = new Delphin("Марта", 5);
        z1.setText(sc.nextLine());
        d1.setText(sc.nextLine());
        System.out.println(z1.print());
        System.out.println(d1.print());


    }
}

import java.awt.*;
import java.util.Random;

public class CoolWorld {
    public static void main(String[] args){
        Random random = new Random(100);
        System.out.println(random.nextInt(100));

        int a = 10;

        switch (a){
            case 8:
                System.out.println("100");
                break;
            case 10:
                System.out.println("HelloWorld!");
        }
    }
}

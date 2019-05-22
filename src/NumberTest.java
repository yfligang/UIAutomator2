import java.awt.desktop.SystemSleepEvent;

public class NumberTest {
    public static void main(String[] args){
        Integer x = 5;
        //x = x + 10;
        System.out.println(x);
        Integer y = 5;
        if (x.equals(y)){
            System.out.println("今天是个好日子");
        }
        System.out.println(y.byteValue()); //打印出y的btye类型
        System.out.println(y.doubleValue()); // 5.0
        System.out.println(y.toString());
        System.out.println("90度的正弦值: " + Math.sin(Math.PI/2));
    }
}

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RandomTestDemo {

    public static void main(String[] args){
        Random random = new Random();
        int[] arg = new int[100];
        for (int i = 0; i < arg.length ; i++) {
            arg[i] = random.nextInt(200);
            System.out.println("数组中第" + (i + 1) + "的值为: " + arg[i]);
        }

        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i <arg.length ; i++) {
            if (map.get(arg[i]) == null){
                map.put(arg[i],1);
            }else {
                int temp = map.get(arg[i]);
                map.put(arg[i],temp + 1);
            }
        }

        int maxCount = Collections.max(map.values());
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxCount) {
                System.out.println(entry.getKey());
                System.out.println(maxCount);
            }
        }

    }
}

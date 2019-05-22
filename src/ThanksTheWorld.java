//一个数组，找出出现次数最多的数和次数

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ThanksTheWorld {

    public static void main(String[] args){
        int[] array5 = {11,11,11,11,0,2,5,7,12,33,32,66,88,91,32,33,12,45,6,333,234,56,7,8,654,45,33,34,23,61,32,32,41,52,61,71,63,64,34,45,578,91};
        Map<Integer,Integer> map1 = new HashMap();
        for (int i = 0; i < array5.length ; i++) {
            if (map1.get(array5[i]) == null){
                map1.put(array5[i],1);
            }else if (map1.get(array5[i]) != null){
                int temp = map1.get(array5[i]);
                map1.put(array5[i],temp + 1);

            }
        }
        int maxCount = Collections.max(map1.values());
        System.out.println("数组中出现最多数的次数为: " + maxCount);
        for (int key:map1.keySet()) {
            if (map1.get(key) == maxCount){
                System.out.println("数组中出现最多次的数字为: " + key);
            }
        }
    }
}

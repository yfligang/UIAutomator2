/***
 * 定义一个数组，元素有：{88,55,77,33,66,44}
 * 定义一个方法，求出数组中的最大值
 * 定义一个方法，求出数组中的最小值
 * 定义一个方法，将数组中的内容反转
 * 定义一个方法，求出数组中所有偶数的和
 * 定义一个方法，从小到大排序
 * 定义一个方法，从大到小排序
 */

public class HelloWorld {

    public int[] array1 = {88,55,77,33,66,44};

    public static void main(String[] args){
        HelloWorld hw = new HelloWorld();
        hw.min();
        hw.max();
        hw.fromSmallToLarge();
        hw.fromLargeToSmall();
        hw.reverse();
        hw.sum();
    }

    /***
     * 定义一个方法，求出数组中的最小值
     */
    public void min(){
        int min = array1[0]; //假设第一个数最小
        for (int i = 1; i < array1.length ; i++) {
            if (array1[i] < min){
                min = array1[i];
            }

        }
        System.out.println("数组中最小的数为: " + min);

    }
    /***
     * 定义一个方法，求出数组中的最大值
     */
    public void max(){
        int max = array1[0];  //假设数组中的第一个数最大
        for (int i = 1; i < array1.length ; i++) {
            if (array1[i] > max){
                max = array1[i];
            }
        }
        System.out.println("数组中最大的数为: " + max);
    }

    /***
     * 定义一个方法，将数组中的内容反转
     */
    public void reverse(){
        int[] array2 = new int[array1.length];
        for (int i = 0, j = array1.length - 1; i < array1.length&&j>=0; i++,j--) {
            array2[i] = array1[j];
        }
        for (int key:array2
        ) {
            System.out.print(key + " ");
        }
        System.out.println();

    }

    /***
     * 定义一个方法，从小到大排序
     */
    public void fromSmallToLarge(){
        for (int i = 0; i < array1.length; i++) {
            for (int j = i + 1; j < array1.length; j++) {
                int temp = 0;
                if (array1[i] > array1[j]){
                    temp = array1[i];
                    array1[i] = array1[j];
                    array1[j] = temp;
                }
            }
        }
        for (int key:array1) {
            System.out.print(key + " ");

        }
        System.out.println();
    }


    /***
     * 定义一个方法，从大到小排序
     */
    public void fromLargeToSmall(){
        for (int i = 0; i < array1.length; i++) {
            for (int j = i + 1; j < array1.length; j++) {
                if (array1[i] < array1[j]){
                    int temp = 0;
                    temp = array1[i];
                    array1[i] = array1[j];
                    array1[j] = temp;
                }
            }
        }
        for (int key:array1
             ) {
            System.out.print(key + " ");
        }
        System.out.println();
    }

    /***
     * 定义一个方法，求数组中偶数的和
     * 先找出数组中所有的偶数，然后相加
     */
    public void sum(){
        int sum = 0;
        for (int i = 0; i < array1.length ; i++) {
            if (array1[i] % 2 == 0){
                sum = sum + array1[i];
            }

        }
        System.out.println("数组中偶数的和为: " + sum);

    }
}

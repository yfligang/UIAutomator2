/***
 * 数组合并
 */
public class FuckTheWorld extends HelloWorld {

    //两个数组合并
    public static int[] array2 = {33,76,24,17,9,102,12};
    public static int[] array3 = {2,41,31,21,6,88};

    public static void main(String[] args){
        FuckTheWorld ftw = new FuckTheWorld();
        int[] array4 = new int[array2.length + array3.length];
//        int i = 0;
//        int j = array2.length;
//        if (i < array2.length){
//            for (int k = 0; k < array2.length ; k++) {
//                array4[k] = array2[i];
//                i++;
//            }
//        }
//        if (j >= array2.length && j < array2.length + array3.length){
//            for (int k = 0; k < array3.length; k++) {
//                array4[j] = array3[k];
//                j++;
//            }
//        }

        for (int i = 0; i < array2.length ; i++) {
            array4[i] = array2[i];
        }

        for (int k = 0; k < array3.length ; k++) {
            array4[array2.length + k] = array3[k];
        }

        for (int key:array4) {
            System.out.print(key + " ");
        }
    }


}

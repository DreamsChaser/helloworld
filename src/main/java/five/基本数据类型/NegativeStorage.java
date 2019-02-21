package five.基本数据类型;


/**
 * 负数在计算机中的存储
 * @author sirius
 * @since 2019/1/7
 */
public class NegativeStorage {

    /**
     * 将n的每一位与1做&运算 得到具体的二进制表示
     * @param n
     * @return
     */
    public static void converseToBinary(int n) {
        int value = 1;
        int[] arr = new int[32];
        int i = 31;
        while (value != 0) {
            if ((value & n) != 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            i--;
            value = value << 1; //左移右边补0，当移完32为value为0.
        }
        for (int index = 0;index < 32;index++){
            System.out.print(arr[index]);
            if ((index+1)%4 == 0){
                System.out.print(" ");
            }
        }
    }

    public static void main(String[] args) {
        int n = -4;
//        while (n != 0){
            NegativeStorage.converseToBinary(n);
            System.out.println("");
//            n = n<<1;
//        }
    }
}

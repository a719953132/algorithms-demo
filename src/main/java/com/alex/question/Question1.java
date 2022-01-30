package com.alex.question;

/**
 * @Classname Question1
 * @Description 一堆数中 有a,b两个数字出现了奇数次 其余数字出现了偶数次 求这两个数
 * 思路:
 * 1.所有数字进行异或操作 最后得到的数字为eor=a^b 且a！=b 所以 eor!=0
 * 2.因为eor !=0 所以eor的二进制肯定在某一位上不等于0 不等于0的这一位及a,b不一样的位数
 * 3.我们提取出eor最右侧的为1的数值eor2(假设第x位为1)
 * 4.使用eor2去异或所有x位为1的数字 即可得到a or b
 * 5.eor^eor2 即为另外一个数字
 * @Date 2022/1/30 0:47
 * @Author Alex
 */
public class Question1 {

    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,4,4};
        findTowOddTimesNum(arr);
    }

    /**
     *找出两个奇数次的数字
     */
    public static void findTowOddTimesNum(int[] arr){
        int eor = 0;
        //遍历数组 分别与eor异或
        for (int i : arr) {
             eor ^= i;
        }

        //此时eor=a^b
        //获取eor最右的1
        int rightOne = eor & (~eor + 1);

        int onlyOne = 0;


        for (int i : arr) {
            //如果该位等于0 则(i & rightOne) = 0
            if ((i & rightOne) == 0){
                //将onlyOne与该数字进行异或操作 得出的onlyOne为a or b
                onlyOne ^= i;
            }
        }
        //打印两数
        System.out.println(onlyOne + " " + (eor ^ onlyOne));

    }
}

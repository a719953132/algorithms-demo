package com.alex.sort;

/**
 * @Classname BubbleSort
 * @Description 冒泡排序
 * 1.比较相邻的元素。如果第一个比第二个大，就交换他们两个。
 * 2.对每一对相邻元素做同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。
 * 3.针对所有的元素重复以上的步骤，除了最后一个。
 * 4.持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
 * @Date 2022/3/29 22:42
 * @Author Alex
 */
public class BubbleSort {

    public static void main(String[] args) {
        Integer[] a = {3,2,5,4,1};

        SortUtil.show(BubbleSort(a));
    }

    public static Comparable[] BubbleSort(Comparable[] a){

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0;j < a.length- 1 -i;j++){
                if (SortUtil.less(a[j + 1],a[j])){
                    SortUtil.exch(a,j,j+1);
                }
            }
        }
        return a;
    }
}

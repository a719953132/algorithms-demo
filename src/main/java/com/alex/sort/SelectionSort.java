package com.alex.sort;

/**
 * @Classname SelectionSort
 * @Description 选择排序
 * 1.第一次从待排序的数据元素中选出最小（或最大）的一个元素，存放在序列的起始位置
 * 2.然后再从剩余的未排序元素中寻找到最小（大）元素，然后放到已排序的序列的末尾。
 * 3.以此类推，直到全部待排序的数据元素的个数为零。
 * 4.选择排序是不稳定的排序方法
 * @Date 2022/1/11 20:07
 * @Author Alex
 */
public class SelectionSort {
    public static void main(String[] args) {
        Integer[] a = {3,2,5,4,1};

        SortUtil.show(selectionSort(a));

    }

    public static Comparable[] selectionSort(Comparable[] a){
        for (int i = 0; i < a.length; i++) {
            //将a[i]和a[i+1...N]中最小的元素进行交换
            int min = i;
            for (int j = i+1; j < a.length; j++) {
                if (SortUtil.less(a[j],a[min])){
                    min = j;
                    SortUtil.exch(a,i,min);
                }
            }
        }
        return a;
    }


}

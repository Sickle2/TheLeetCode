/**
 * @author zhaoshuai@ucfgroup.com
 * @Title: TheLeetCode
 * @Copyright: Copyright (c) 2018/2/7
 * @Description:
 * @Company: ucfgroup.com
 * @Created on 2018/2/7 10:36
 */
public class BubbleSort {
    public void sort(int[] a) {
        int temp = 0;
        for (int i = a.length - 1; i > 0; --i) {
            for (int j = 0; j < i; ++j) {
                if (a[j + 1] < a[j]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
            for (int k = 0;k<a.length;k++){
                System.out.print(a[k]+",");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] a = {5,123,6,9,2,0,2,43};
        BubbleSort sort = new BubbleSort();
        sort.sort(a);
        for (int i = 0;i<a.length;i++){
            System.out.print(a[i]);
        }

    }
}

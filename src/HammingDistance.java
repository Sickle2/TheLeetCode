/**
 * @author jrgc-Sickle
 * @comment
 * @date 2017/11/28 18:01
 */
import java.util.Scanner;

/**
 * @author jrgc-zh
 * @comment
 * @date 2017/11/27 19:57
 * @qq 122331175
 */
public class HammingDistance {
    public static void main(String[] args) {
        HammingDistance h1 = new HammingDistance();
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        System.out.println(h1.hammingDistance(x,y));
    }
    public int hammingDistance(int x, int y) {
        String x1 = Integer.toBinaryString(x);
        String y1 = Integer.toBinaryString(y);
        int len1 = x1.length();
        int len2 = y1.length();
        String v1,v2;
        String tem = "";
        if(len1 > len2){
            for(int i = 0;i < len1 - len2;i++){
                tem += "0";
            }
            v1 = x1;
            v2 = tem + y1;
        }else{
            for(int i = 0;i < len2 - len1;i++){
                tem += "0";
            }
            v1 = y1;
            v2 = tem + x1;
        }
        int sum = 0;
        int k = 0;
        char v11[] = v1.toCharArray();
        char v22[] = v2.toCharArray();
        while (k < v1.length()) {
            char c1 = v11[k];
            char c2 = v22[k];
            if (c1 != c2) {
                sum++;
            }
            k++;
        }
        return sum;
    }
}


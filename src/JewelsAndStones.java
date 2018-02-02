import java.util.Scanner;

/**
 * @author zhaoshuai@ucfgroup.com
 * @Title: TheLeetCode
 * @Copyright: Copyright (c) 2018/2/2
 * @Description:
 * @Company: ucfgroup.com
 * @Created on 2018/2/2 14:23
 */
public class JewelsAndStones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String J = scanner.nextLine();
        String S = scanner.nextLine();
        JewelsAndStones jewelsAndStones = new JewelsAndStones();
        System.out.println(jewelsAndStones.numJewelsInStones(J,S));
    }
    public int numJewelsInStones(String J, String S) {
        int num = 0;
        char[] a = J.toCharArray();
        for (char tem:S.toCharArray()){
            for (int i=0;i<a.length;i++){
                if (a[i] == tem){
                    num++;
                }
            }
        }
        return num;
    }
}

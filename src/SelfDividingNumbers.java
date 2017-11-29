import java.util.*;

/**
 * @author jrgc-Sickle
 * @comment
 * @date 2017/11/28 19:15
 */
public class SelfDividingNumbers {
    public static void main(String[] args) {
        SelfDividingNumbers selfDividingNumbers = new SelfDividingNumbers();
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
       System.out.println(selfDividingNumbers.selfDividingNumbers(x,y));
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        int flag = 0;
        for (int i=left;i<=right;i++){
            for (char tem:String.valueOf(i).toCharArray()){
                if (tem != '0'){
                    if (i%Integer.valueOf(String.valueOf(tem)) == 0){
                        flag = 1;
                    }
                    else {
                        flag = 0;
                        break;
                    }
                }else {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1){
                list.add(i);
            }
        }
        return list;
    }
}

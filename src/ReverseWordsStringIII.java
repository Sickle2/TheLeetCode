import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;

/**
 * @author jrgc-Sickle
 * @comment
 * @date 2017/12/1 11:50
 */
public class ReverseWordsStringIII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        ReverseWordsStringIII rWS = new ReverseWordsStringIII();
        System.out.println(rWS.reverseWords(str));
    }
    public String reverseWords(String s) {
        String[] tem = s.split(" ");
        StringBuilder reverseStr = new StringBuilder();
        for (int i=0;i<tem.length;i++){
            StringBuilder stringBuilder = new StringBuilder(tem[i]);
            reverseStr.append(stringBuilder.reverse()+" ");
        }

        return reverseStr.toString().trim();
    }
}

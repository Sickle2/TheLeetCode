import java.util.Scanner;

/**
 * @author jrgc-Sickle
 * @comment
 * @date 2017/12/1 14:05
 */
public class ReverseString {
    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(reverseString.reverseString(str));
    }
    public String reverseString(String string){
        StringBuilder stringBuilder = new StringBuilder(string);
        return stringBuilder.reverse().toString();
    }
}

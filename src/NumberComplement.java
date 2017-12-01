import java.util.Scanner;

/**
 * @author jrgc-Sickle
 * @comment
 * @date 2017/12/1 10:29
 */
public class NumberComplement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        NumberComplement numberComplement = new NumberComplement();
        System.out.println(numberComplement.findComplement(num));
        System.out.println(numberComplement.findComplement2(num));
        System.out.println(Integer.highestOneBit(num));
        System.out.println(~num);
    }
    public int findComplement(int num){
        char bits[] = Integer.toBinaryString(num).toCharArray();
        StringBuilder comNum = new StringBuilder();
        for (int i = 0;i < bits.length;i++){
            if (bits[i] == '1'){
                bits[i] = '0';
                comNum.append(bits[i]);
            }else {
                bits[i] = '1';
                comNum.append(bits[i]);
            }
        }
        return Integer.parseInt(comNum.toString(),2);
    }

    public int findComplement2(int num){
        return ~num & (Integer.highestOneBit(num) - 1);
    }
}

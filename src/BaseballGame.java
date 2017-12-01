import javax.swing.plaf.basic.BasicEditorPaneUI;
import java.util.Stack;

/**
 * @author jrgc-Sickle
 * @comment
 * @date 2017/12/1 14:51
 */
public class BaseballGame {
    public static void main(String[] args) {
        String[] ops = {"5","-2","4","C","D","9","+","+"};
        BaseballGame baseballGame = new BaseballGame();
        System.out.println(baseballGame.calPoints(ops));
    }
    public int calPoints(String[] ops){
        Stack<Integer> stack = new Stack();

        for(String op : ops) {
            if (op.equals("+")) {
                int top = stack.pop();
                int newtop = top + stack.peek();
                stack.push(top);
                stack.push(newtop);
            } else if (op.equals("C")) {
                stack.pop();
            } else if (op.equals("D")) {
                stack.push(2 * stack.peek());
            } else {
                stack.push(Integer.valueOf(op));
            }
        }

        int ans = 0;
        for(int score : stack) ans += score;
        return ans;
    }
}
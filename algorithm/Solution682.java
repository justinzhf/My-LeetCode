import java.util.Stack;

public class Solution682 {
    public int calPoints(String[] ops) {
        int score=0;
        Stack mStack=new Stack();
        for(int i=0;i<ops.length;i++) {
            String op = ops[i];
            if (op.equals("C")) {
                mStack.pop();
            } else if (op.equals("D")) {
                mStack.push(Integer.toString(2 * Integer.parseInt((String) mStack.peek())));
            } else if (op.equals("+")) {
                Object tmpTop = mStack.pop();
                int newScore = Integer.parseInt((String) tmpTop) + Integer.parseInt((String) mStack.peek());
                String newTop = Integer.toString(newScore);
                mStack.push(tmpTop);
                mStack.push(newTop);
            } else {
                mStack.push(op);
            }
        }

        while(mStack.empty()==false){
            Object se=mStack.pop();
            score+=Integer.parseInt((String)se);
        }


        return score;

    }

    public static void main(String[] args) {
        String[] s={"5","-2","4","C","D","9","+","+"};
        System.out.println(new Solution682().calPoints(s));
    }
}

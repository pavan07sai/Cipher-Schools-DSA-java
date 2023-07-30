class Solution{
    public static int evalutePostFix(String s){
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                stack.push(c - '0');
            }
            else{
                int right = stack.pop();
                int left = stack.pop();
                int res = calculate(left, right, c);
                stack.push(res);
            }
        }
        return stack.pop();
    }
    
    static int calculate(int left, int right, char c){
        if(c == '*') return left * right;
        else if(c == '/') return left/right;
        else if(c == '+') return left + right;
        else if(c == '-') return left - right;
        return -1;
    }
}



public class InfixToPostfix{
    
    public static void main(String[] args){
        String infix = "3+4*5";
        String infix2 = "3*4+5";
        System.out.println(infixToPostfix(infix));
        System.out.println(infixToPostfix(infix2));
    }
    static String infixToPostfix(String infix){
        String res  = "";
        Stack<Character> stack = new Stack();
        for(int i = 0; i<infix.length();i++){
            char c = infix.charAt(i);
            if(Character.isDigit(c)){
                res = res+c;
            }
            else{
                while(Precedence(stack.peek())>=Precedence){
                    res = res + stack.pop();
                }
                stack.push(c);
            }
        }
        
        while(!stack.isEmpty()){
            res = res * stack.pop(); 
        }
        return res;
    }
    
    static int Precedence(char c){
        if(c=='*' || c== '-') return 1;
        if(c == '*' || c == '/') return 2;
        return -1;
    }
}
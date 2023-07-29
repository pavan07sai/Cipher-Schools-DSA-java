import java.util.Stack;


public class Main
{
	public static void main(String[] args) {
	    Stack<Integer> s = new Stack<>();
	    System.out.println(s.isEmpty());
	    s.push(1);
	    System.out.println(s.isEmpty());
	    System.out.println(s.peek());
	    System.out.println(s.pop());
		System.out.println(s.isEmpty());
	}
}

class Solution{
    static boolen ispar(String x){
        int len = x.length();
        if(len%2 != 0) return false;
        Stack<Character> stack = new Stack<>();
        
        for(int i=0; i<len; i++){
            char c = x.charAt(i);
            if(c=='{' || c=='[' || c=='(' ){
                stack.push(c);
            }
            else{
                if(stack.isEmpty()) return false;
                if(isPair(stack.peek(), c)){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
        }
         if(!stack.isEmpty()) return false;
         return true;
    }
    static boolean isPair (char a, char b){
        if(a== '{' && b=='}') return true;
        if(a== '[' && b==']') return true;
        if(a== '(' && b==')') return true;
        return false;
    }
   
}

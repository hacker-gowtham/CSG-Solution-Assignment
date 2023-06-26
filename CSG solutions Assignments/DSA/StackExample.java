import java.util.Stack;

// Check if a string is palindrome or not using stack

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        String s = "massam";
        for(int i=0;i<s.length();i++){
            stack.push(String.valueOf(s.charAt(i)));
        }
        String reverse = "";
        while(!stack.isEmpty()){
            reverse += stack.pop();
        }
        if(s.equals(reverse)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }

    }
    
}

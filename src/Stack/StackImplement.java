package Stack;

import java.util.Stack;

public class StackImplement {
    public boolean isValidParanthesis(String str){
        Stack<Character> stack=new Stack<>();
        for(char c:str.toCharArray()){
            if(c=='(' || c=='{' || c=='['){
                stack.push(c);
            }
            else {
                if(stack.isEmpty()){
                    return false;
                }else{
                    char top=stack.peek();
                    if((c==')' && top =='(') || (c==']' && top=='[') || (c=='}' && top=='{')){
                        stack.pop();
                    }else {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }

    public String reverseStringUsingStack(String s){
        Stack<Character> stack=new Stack<>();
        String result="";
        for(int i=0;i<s.length();i++){
            stack.push(s.charAt(i));
        }
        for(int i=0;i<s.length();i++){
            result=result+stack.pop();
        }

        return result;
    }
    public int findMaxDepth(String s){
        int cur_max=0;
        int max=0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='(') {
                cur_max++;
                if (cur_max > max) {
                    max = cur_max;
                }
            }else if(s.charAt(i)==')'){
                if(cur_max>0){
                    cur_max--;
                }else{
                    return -1;
                }
            }
        }
        if(cur_max!=0){
            return -1;
        }
        return max;
    }
    public static void main(String[] args) {
    StackImplement si=new StackImplement();
        System.out.println(si.isValidParanthesis("{[()]}"));
        System.out.println(si.isValidParanthesis("{[()]})"));
        System.out.println("Max depth="+si.findMaxDepth("(())((()))"));
        System.out.println("reverse String:"+si.reverseStringUsingStack("urvashi"));

    }
}

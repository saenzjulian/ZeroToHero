package BracketMatch;

import java.util.Stack;
/** *
 * @author JAGS
 */
public class BracketMatch { 
    static int bracketMatch(String text) {
        Stack<Character> stack = new Stack<>(); // LIFO: Last In Fist Out
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '(') {
                stack.push('('); // Put in Stack
            } else if (text.charAt(i) == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') { //Peek obtain the last one element but doesn't delete it
                    stack.pop(); // Delete the last one element added in Stack
                } else {
                    stack.push(')');
                }
            }
        }
        return stack.size();
    }

    public static void main(String[] args) {
        System.out.println(bracketMatch("()))(()"));
    }

}
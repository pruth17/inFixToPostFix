

import java.util.Stack;

public class Postfix 
{ 
    
	
	public Postfix() {}
    static int Prec(char ch) 
    { 
        switch (ch) 
        { 
        case '+': 
        case '-': 
            return 1; 
       
        case '*': 
        case '/': 
            return 2; 
       
        case '^': 
            return 3; 
        } 
        return -1; 
    } 
       
    // The main method that converts given infix expression 
    // to postfix expression.  
    public String infixToPostfix(String exp) 
    { 
        // initializing empty String for result 
        String result = new String(""); 
          
        // initializing empty stack 
        Stack<Character> stack = new Stack<>(); 
        
        int j = 0;
        int Size = exp.length();
        
        while(j < Size) {
        	char ch = exp.charAt(j);
        	if(Character.isLetterOrDigit(ch))
        		result += ch;
        	
        	switch (ch) {
        	case '^':
        		stack.push(ch);
        		break;
        	case '+':

        	case '-':

        	case '*':

        	case '/':
        		while (!stack.isEmpty() && Prec(ch) <= Prec(stack.peek())){ 
                    if(stack.peek() == '(') 
                        return "Invalid Expression"; 
                    result += stack.pop(); 
             } 
                stack.push(ch); 
                break;

        	case '(':

        	stack.push(ch);
        	break;

        	case ')':
        		while (!stack.isEmpty() && stack.peek() != '(') 
                    result += stack.pop(); 
        		if (!stack.isEmpty() && stack.peek() != '(') 
                    return "Invalid Expression"; // invalid expression                 
                else
                    stack.pop(); 
        		break;
        	
        }
        	
        	j++;
        }
        while (!stack.isEmpty()) {

        	if(stack.peek() == '(') 
                return "Invalid Expression"; 
            result += stack.pop(); 

        	}
        return result;
    }
}
          

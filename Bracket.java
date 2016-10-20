import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.EmptyStackException;
import java.util.Stack;

class Bracket {
    Bracket(char type) {
        this.type = type;
    }

    boolean Match(char c) {
        if (this.type == '[' && c == ']')
            return true;
        if (this.type == '{' && c == '}')
            return true;
        if (this.type == '(' && c == ')')
            return true;
        return false;
    }

    char type;
}

class check_brackets {
    public static void main(String[] args) throws IOException {
        InputStreamReader input_stream = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input_stream);
        String text = reader.readLine();

        Stack<Bracket> opening_brackets_stack = new Stack<Bracket>();

        System.out.println(fillStack(text, opening_brackets_stack));
    }

    private static boolean fillStack(String text, Stack<Bracket>obStack) {
            for (int position = 0; position < text.length(); ++position) {
                char next = text.charAt(position);

                //Catch empty stack (when params facing wrong way)
                try {
                    //Check params divisible by 2, e.g. (() would be wrong, odd
                    if (text.length() % 2 == 0) {
                        //Opening params, put in stack
                        if (next == '(' || next == '[' || next == '{') {
                            Bracket b = new Bracket(next);
                            obStack.push(b);
                            // Process opening bracket, write your code here
                        }

                        //Closing params
                        if (next == ')' || next == ']' || next == '}') {
                            boolean result = obStack.pop().Match(next);
                            System.out.println(next);
                            System.out.println("Position: " + position);

                            if (!result) {
                                return false;
                            }
                        }
                        //Check if stack is empty (exits for using increment variable)
                        if(position == text.length() -1){
                            System.out.println("Success case");
                            return true;
                        }
                    } else {
                        return false;
                    }//Modulo Fail (Number of parentheses odd)
                }catch(EmptyStackException e){
                    return false;
                }//Empty stack
            }
        System.out.println("Hitting default, problem");
        return false;
    }
}

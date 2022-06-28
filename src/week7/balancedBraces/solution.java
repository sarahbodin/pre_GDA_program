import java.util.Scanner;
import java.util.ArrayList;

public class Solution {

    /**
     * Instructions:
     *
     * Read lines from System.in until there are no more lines.
     *
     * For each line read, output "valid" or "invalid"
     *
     * Each line consists of arbitrary characters. You can ignore all characters that are not braces.
     *
     *  Braces include:
     *  "(", which is closed by ")"
     *  "[", which is closed by "]"
     *  "{", which is closed by "}"
     *  "<", which is closed by ">"
     *
     * Output valid if the braces on that line are correctly nested,
     * so that each open brace is closed by its corresponding closing brace,
     * and braces are nested "( ( () ) )", not interleaved: "( [ ) ]"
     *
     * For each line, output "valid" if every open symbol in the set "( [ { <"
     * it has a matching corresponding closing symbol ") ] } >", and they are not interleaved;
     * else output "invalid".
     *
     * i.e,
     * "()[]"" is valid,
     * "([])"" is valid,
     * "(cite[24]) is valid,
     *
     * but "([)]" and
     * "(" are invalid.
     *
     * You can implement this using a stack.
     * One possible implementation uses a StringStack; another uses a Stack<Integer>.
     *
     * Copy your StringStack implementation (or Stack<T> implementation)
     * from assignment 1 to here, and use it.
     *
     * One way to solve this is to write a function:
     *     public static boolean isValid(String line, String opens, String closes)
     * which takes a line of the input, and returns whether that line is balanced.
     *
     * Note that this method also takes two additional Strings, a list of open braces and a list of closed braces.
     *
     * It's helpful to be able to turn a String variable "line" into an array of char, which you can do with
     *
     *      line.toCharArray()
     */

    interface Stack<T> {
        /**
         * After calling push, t is the top element of this Stack.
         */
        void push(T t);

        /**
         * peek returns the top element of this Stack, leaving the Stack unchanged,
         * or if the Stack is empty throws a StackUnderflowException.
         */
        T peek();

        /**
         * pop remove the top element of this Stack, and returns that element,
         * or if the Stack is empty throws a StackUnderflowException.
         */
        T pop();

        /**
         *
         * @return true iff (if and only if) this Stack is empty, else false.
         */
        boolean isEmpty();

        /**
         * return the size of this Stack.
         */
        int size();
    }

    interface StringStack extends Stack<String> {
        // no body is necessary, as this interface inherits all members of the Stack super-interface
        // but to make it easier to read, we've copied the method names, and added the
        // @Override annotation to show they override the super-interface methods.
        // See the Stack super-interface, above, for the documentation of what each method does.

        @Override
        void push(String s);

        @Override
        String peek();

        @Override
        String pop();

        @Override
        int size();
    }

    /**
     * Exercise your Stack
     * Read lines from System.in
     * For each line, output "valid" for every open symbol in the set "( [ { <"
     * it has a matching closing symbol ") ] } >", and they are not interleaved,
     * else output "invalid".
     *
     * i.e, "()[]"" is valid, "([])"" is valid, "(cite[24]) is valid,
     * but "([)]" and "(" are invalid
     *
     */


    // string stack implementation
    public static class StringStackImpl implements StringStack {
        /**
         * Constructor: initilalizes a new StringStackImpl instance.
         */

        ArrayList<String> stack;

        public StringStackImpl() {
            // constructs new copy of string stack
            this.stack = new ArrayList<String>();

        }
        
        @Override
        public void push(String s) {
            // pushed string onto stack
            stack.add(0, s);
        }

        @Override
        public String peek() {
            // returns first string on top of stack, else empty string 
            if (!stack.isEmpty()) {
                return stack.get(0);
            } else {
                return "";
            }
        }

        @Override
        public String pop() {
            // removes first string on top of stack
            return stack.remove(0);
        }

        @Override
        public int size() {
            // returns num of strings on stack
            return stack.size();
        }

        @Override
        public boolean isEmpty() {
            // returns true is stack is empty, else false
            return stack.isEmpty();
        }
    }


    // helper function returns true if input has matching braces, false if they are not matching
    public static boolean isValid(String line) {
        StringStackImpl stack = new StringStackImpl();

        for (int i = 0; i < line.length(); i++) {
            if (line.length() > 0) {
                char character = line.charAt(i);
                String ch = Character.toString(character);

                if (ch.equals("[") || ch.equals("(") || ch.equals("{")) {
                    stack.push(ch);

                } else if (ch.equals("]") || ch.equals("}") || ch.equals(")") && (!stack.isEmpty())) {
                    if (stack.peek().equals("(") && ch.equals(")") || stack.peek().equals("{") && ch.equals("}")
                            || stack.peek().equals("[") && ch.equals("]")) {
                        stack.pop();
                    } else {
                        return false;
                    }
                } else {
                    if (ch.equals("]") || ch.equals("}") || ch.equals(")"))
                        return false;
                }
            }
        }

        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            // create new stack
            while (scan.hasNextLine()) {

                // store input
                String line = scan.nextLine();
                // call helper function to determine if inputs braces are matching
                if (isValid(line)) {
                    System.out.println("valid");
                } else {
                    System.out.println("invalid");
                }
            }
        }
    }
}

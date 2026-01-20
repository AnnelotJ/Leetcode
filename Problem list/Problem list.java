class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();  // Use Character, not String
        
        for (int i = 0; i < s.length(); i++) {   
            char c = s.charAt(i);                 // use charAt(), not s[i]
            
            if (c == '[' || c == '{' || c == '(') {  // use == and single quotes
                stack.push(c);                        // push the char, not index
            }
            else {
                if (!stack.isEmpty()) {              // correct empty check
                    switch (stack.peek()) {
                        case '{':                    // single quotes for char
                            if (c == '}') {
                                stack.pop();
                            } else {
                                return false;
                            }
                            break;                   // add break
                        case '[':
                            if (c == ']') {
                                stack.pop();
                            } else {
                                return false;
                            }
                            break;
                        case '(':
                            if (c == ')') {
                                stack.pop();
                            } else {
                                return false;
                            }
                            break;
                    }
                } else {
                    return false;  // closing bracket but stack is empty
                }
            }
        }
        
        return stack.isEmpty();  // true only if all brackets matched
    }
}
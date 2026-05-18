package Stack;

import java.util.Stack;

public class Valid_Parentheses {
  public boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();

    // store opening brackets
    for (char ch : s.toCharArray()) {
      if (ch == '(' || ch == '{' || ch == '[') {
        stack.push(ch);
      } else {
        if (stack.isEmpty())
          return false;
        char top = stack.pop(); // stores the pop elements
        if (ch == ')' && top != '(')
          return false;
        if (ch == '}' && top != '{')
          return false;
        if (ch == ']' && top != '[')
          return false;
      }
    }

    return stack.isEmpty();
  }
}

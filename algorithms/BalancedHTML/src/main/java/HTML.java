import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class HTML {
  public static List<List<String>> HTML_TOKENS = new ArrayList<>();

  public HTML() {
    HTML_TOKENS.add(List.of("<html>", "</html>"));
    HTML_TOKENS.add(List.of("<body>", "</body>"));
  }

  boolean isOpenTerm(String tag){
    for (List<String> array : HTML_TOKENS){
      if (array.get(0).equals(tag)){
        return true;
      }
    }
    return false;
  }

  boolean matches(String openTerm, String closeTerm){
    for (List<String> array : HTML_TOKENS) {
      if (array.get(0).equals(openTerm)) {
        return array.get(1).equals(closeTerm);
      }
    }
    return false;
  }

  public boolean isBalanced(String input) {
    Stack<String> stack = new Stack<>();

    List<String> list = new ArrayList<>();
    while(input.length() > 0){
      final int beginIndex = input.indexOf("<");
      final int endIndex = input.indexOf(">") + 1;
      list.add(input.substring(beginIndex, endIndex));
      input = input.substring(endIndex);
    }


    for (String html : list){
      if (isOpenTerm(html)){
        stack.push(html);
      }else {
        if (stack.isEmpty() || !matches(stack.pop(), html)){
          return false;
        }
      }
    }
    return stack.isEmpty();
  }

}

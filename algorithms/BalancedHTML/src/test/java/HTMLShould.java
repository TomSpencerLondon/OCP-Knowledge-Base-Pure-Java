import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HTMLShould {

  @Test
  public void return_true_for_html_tags() {
    final HTML html = new HTML();
    final boolean valid = html.isBalanced("<html></html>");

    assertTrue(valid);
  }

  @Test
  void return_false_for_different_tags() {
    final HTML html = new HTML();
    final boolean valid = html.isBalanced("<html></body>");

    assertFalse(valid);
  }

  @Test
  void return_true_for_two_tags() {
    final HTML html = new HTML();
    final boolean valid = html.isBalanced("<html><body></body></html>");

    assertTrue(valid);
  }

  @Test
  void return_false_for_two_unbalanced_tags() {
    final HTML html = new HTML();
    final boolean valid = html.isBalanced("<html></body></html>");

    assertFalse(valid);
  }
}

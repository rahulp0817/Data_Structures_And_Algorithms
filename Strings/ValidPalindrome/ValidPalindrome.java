package Strings.ValidPalindrome;

public class ValidPalindrome {
  public boolean isPalindrome(String s) {

    String a = s.toLowerCase();
    int last = a.length() - 1;
    int start = 0;

    while (start < last) {

      while (start < last && !Character.isLetterOrDigit(a.charAt(start))) {
        start++;
      }

      while (start < last && !Character.isLetterOrDigit(a.charAt(last))) {
        last--;
      }

      if (a.charAt(start) != a.charAt(last)) {
        return false;
      }

      start++;
      last--;
    }

    return true;

  }
}

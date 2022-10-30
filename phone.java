import java.util.*;
class phone {
  static ArrayList<String> getCombination(int[] number, int n, String[] keys) {
    ArrayList<String> getList = new ArrayList<>();
    Queue<String> que = new LinkedList<>();
    que.add("");
    while (!que.isEmpty()) {
      String temp = que.remove();
      if (temp.length() == n)
        getList.add(temp);
      else {
        String copy = keys[number[temp.length()]];
        for (int i = 0; i<copy.length(); i++) {
          que.add(temp + copy.charAt(i));
        }
      }
    }
    return getList;
  }
  static void combination(int[] inputValue, int n) {
    String[] keyWords = {
      "", "", "abc", "def", "ghi", "jkl",
      "mno", "pqrs", "tuv", "wxyz"
    };
    ArrayList<String> output = getCombination(inputValue, n, keyWords);
    for (int i = 0; i<output.size(); i++) {
      System.out.print(output.get(i) + " ");
    }
  }
  public static void main(String args[]) {
    String s = "12";
    int numb = Integer.valueOf(s);
    int i = 0;
    int[] inputValue = new int[s.length()];
    while (numb > 0) {
      inputValue[s.length() - i - 1] = numb % 10;
      numb /= 10;
      i++;
    }
    int lengths = inputValue.length;
    combination(inputValue, lengths);
  }
}


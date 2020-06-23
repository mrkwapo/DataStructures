import java.util.HashMap;

class Main {
  public static void main(String[] args) {
    int[] arr = new int[] { 10, 20, 20, 10, 10, 30, 50, 10, 20 };
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int number : arr) {
      Integer count = map.get(number);
      if (map.containsKey(number)) {
        if (count == null) {
          map.put(number, 1);
        } else {
          map.put(number, count + 1);
        }
      } else
        map.put(number, 1);
    }
    System.out.println(map);
  }
}

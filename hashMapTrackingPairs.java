import java.util.HashMap;
class Main {
  public static void main(String[] args) {
    int[]ar = new int[] {10, 20, 20, 10, 10, 30, 50, 10, 20};
    HashMap<Integer, Integer> map = new HashMap<>(); 
        int pairsOfSocks = 0;
        for (int number : ar) {
            if (map.containsKey(number)) {
                map.remove(number);
                pairsOfSocks++;
            } else             
                map.put(number,1);
        }
        System.out.println(pairsOfSocks);
  }
}

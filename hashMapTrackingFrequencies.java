import java.util.HashMap;
class Main {
  public static void main(String[] args) {
    int[]arr = new int[] {10, 20, 20, 10, 10, 30, 50, 10, 20};
    HashMap<Integer, Integer> map = new HashMap<>();        
        for (int number : arr) {
            if (map.containsKey(number)) {
              Integer count = map.get(number);
                if (count == null) {
			              map.put(number, 1);
                }
                else {
                  map.put(number, count + 1);
                }
            } else             
                map.put(number,1);
        }
        System.out.println(map); //{50=1, 20=3, 10=4, 30=1}
  }
}

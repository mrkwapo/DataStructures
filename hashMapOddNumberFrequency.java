/* How would you solve this problem? [2, 5, 1, 2, 3, 6, 5, 1] Given an array of ints,
return each odd number in the array, and then the total amount of times that odd number occurs.
Example: 1 two times, 3 one time, 5 two times.
 */

package com.Dracodess;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        int arr[]= new int[]{2, 5, 1, 2, 3, 6, 5, 1};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int key : arr){
            Integer value = map.get(key);

            if(key % 2 == 1 ){
                if(map.containsKey(key)){
                    if(value == null){
                        map.put(key, 1);
                    } else {
                        map.put(key, value + 1);
                    }
                } else {
                    map.put(key, 1);
                }
            }
        }

        System.out.println(map); //{1=2, 3=1, 5=2}
    }
}

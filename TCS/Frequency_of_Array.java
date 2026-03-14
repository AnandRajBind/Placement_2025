// array me kitna bar kaun sa element present hai.

import java.util.HashMap;

public class Frequency_of_Array {

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 5, 10, 10, 5, 15};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int current : arr) {
            if (map.containsKey(current)) {//Returns true if key already present.
                map.put(current, map.get(current) + 1);// put method is used for inserts or updates entry.
            } else {
                map.put(current, 1);//Insert element with frequency 1.
            }
        }
        for (Integer key : map.keySet()) {
            System.out.println(key + "->" + map.get(key));//get method Returns current frequency.
        }
    }
}

import java.util.ArrayList;
import java.util.HashMap;

public class zero_sum_subarray {
    public static ArrayList<int[]> findSubArrays(int[] arr) {
        ArrayList<int[]> res = new ArrayList<>();
        HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();
        int cur_sum = 0;

        hm.put(0, new ArrayList<>());
        hm.get(0).add(-1);

        for (int i = 0; i < arr.length; i++) {
            cur_sum += arr[i];
            if (hm.containsKey(cur_sum)) {
                for (int start : hm.get(cur_sum)) {
                    res.add(new int[]{start + 1, i}); 
                }
            }
            hm.putIfAbsent(cur_sum, new ArrayList<>());
            hm.get(cur_sum).add(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, -3, 3, -1, 2};
        ArrayList<int[]> res = findSubArrays(arr);

        for (int[] indices : res) {
            System.out.println("(" + indices[0] + ", " + indices[1] + ")");
        }
    }
}

import java.util.ArrayList;
import java.util.List;

public class Bitmasking {
    //It is used to find all the subset.
    // x & 1 is to find x is odd or not.
    // x^y xors out common bits means 2^2 = 0; it cancelled the common bits
    // mask & 1<< i is item i present in mask
    //if problem talks about subsets, combination, presence/absence -> use bitmasking.
    // if uniqueness, parity (odd/even), or symmetry -> often XOR

    public List<List<Integer>> calculateAllSubset(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = arr.length;
        int total = 1 << n; // 2^n subset;
        for(int mask=0; mask<total; mask++) {
            List<Integer> temp = new ArrayList<>();
            for(int i = 0; i < n; i++) {
                if((mask & 1 << i) != 0) {
                    temp.add(arr[i]);
                }
            }
            ans.add(temp);
        }

        return ans;
    }
}

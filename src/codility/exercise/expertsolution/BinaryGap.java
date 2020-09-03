package codility.exercise.expertsolution;

public class BinaryGap {
    public static void main(String[] args) {
        BinaryGap binaryGap = new BinaryGap();
        binaryGap.solution(99999999);
    }

    public int solution(int N) {
        int max_gap = 0;
        int current_gap = 0;
        boolean counting = false;
        // Using the "concept of bit manipulation" and "& operation"

        while (N != 0) {

            if (counting == false) {    // for the first "1"
                if ((N & 1) == 1) {      // note: cannot use n&1 withoug "()"
                    counting = true;  // start to count
                }
            } else {                    // counting = true
                if ((N & 1) == 0) {      // note: cannot use n&1 withoug "()"
                    current_gap++;
                } else { // N & 1 == 1
                    max_gap = Math.max(max_gap, current_gap);
                    current_gap = 0; // reset
                }
            }

            N = N >> 1; // shift by one (right side)
            // note: cannot just write "N >> 1"
        }
        return max_gap;
    }


}

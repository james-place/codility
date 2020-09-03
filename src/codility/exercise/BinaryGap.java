package codility.exercise;

public class BinaryGap {
    public int solution(int N) {
        long startTime = System.currentTimeMillis();
        int maxLength = 0;
        String s = Integer.toBinaryString(N);
//        System.out.println(s);
        long occurencesOf1 = s.chars().filter(c -> c == '1').count();
        int[] onePositions = new int[(int)occurencesOf1];
        int occurencesOf1Index = 0;
        final char[] binaryRepresentation = s.toCharArray();
        for (int i = 0; i<s.length(); i++) {
            if (s.charAt(i) == '1') {
                onePositions[occurencesOf1Index++] = i;
            }
        }
        for (int i = 1; i<onePositions.length; i++) {
            int gap = (onePositions[i] - onePositions[i - 1])-1;
            if (maxLength < gap) {
                maxLength = gap;
            }
        }
        System.out.println(maxLength);
        System.out.println(System.currentTimeMillis() - startTime);
        return maxLength;
    }

    public int solutionBitManipulation(int N) {
        long startTime = System.currentTimeMillis();
        int max_gap = 0;
        int current_gap =0;
        boolean counting = false;
        // Using the "concept of bit manipulation" and "& operation"

        while( N !=0 ){

            if(counting == false){    // for the first "1"
                if( (N&1) == 1){      // note: cannot use n&1 withoug "()"
                    counting = true;  // start to count
                }
            }
            else{                    // counting = true
                if( (N&1) ==0){      // note: cannot use n&1 withoug "()"
                    current_gap ++;
                }
                else{ // N & 1 == 1
                    max_gap = Math.max(max_gap, current_gap);
                    current_gap = 0; // reset
                }
            }

            N = N >> 1; // shift by one (right side)
            // note: cannot just write "N >> 1"
        }
        System.out.println(max_gap);
        System.out.println(System.currentTimeMillis() - startTime);
        return max_gap;
    }

    public static void main (String[] args) {
        BinaryGap binaryGap = new BinaryGap();
        binaryGap.solution(99999999);
        binaryGap.solutionBitManipulation(99999999);
    }


 }

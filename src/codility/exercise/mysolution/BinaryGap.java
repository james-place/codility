package codility.exercise.mysolution;

public class BinaryGap {
    public static void main(String[] args) {
        BinaryGap binaryGap = new BinaryGap();
        binaryGap.solution(99999999);
    }

    public int solution(int N) {
        int maxLength = 0;
        String s = Integer.toBinaryString(N);
//        System.out.println(s);
        long occurencesOf1 = s.chars().filter(c -> c == '1').count();
        int[] onePositions = new int[(int) occurencesOf1];
        int occurencesOf1Index = 0;
        final char[] binaryRepresentation = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                onePositions[occurencesOf1Index++] = i;
            }
        }
        for (int i = 1; i < onePositions.length; i++) {
            int gap = (onePositions[i] - onePositions[i - 1]) - 1;
            if (maxLength < gap) {
                maxLength = gap;
            }
        }
        System.out.println(maxLength);
        return maxLength;
    }


}

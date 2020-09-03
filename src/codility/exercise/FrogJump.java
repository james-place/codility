package codility.exercise;

public class FrogJump {

        public int solution(int X, int Y, int D) {
            return (int)Math.ceil((Y-X) * 1.0/D);
       }

       public static void main(String args[]) {
            FrogJump frogJump = new FrogJump();
            System.out.println(frogJump.solution(10,85,30));
       }
}

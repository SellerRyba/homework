package Homework.module6;
import java.util.Arrays;

class TargetFinderTest {
    public static void main(String[] args) {
        int[] aiCoords = {-4, 13};
        int[][] targets = {
                {-4, 56},
                {-4, 13},
                {-4, 27},
                {-4, 36},
                {-4, 45}
        };

        TargetFinder targetFinder = new TargetFinder();
        int[] nearestTarget = targetFinder.findTarget(aiCoords, targets);

        //Expect [15, 14]
        System.out.println(Arrays.toString(nearestTarget));
    }
}
class TargetFinder{


    public int[] findTarget(int[] aiCoords, int[][] targets){
        TargetFinder targetFinder = new TargetFinder();
        int a = aiCoords[0];
        int b = aiCoords[1];
        int[] result = new int[2];
        result[0] = targets[0][0];
        result[1] = targets[0][1];
        for (int i = 1; i < targets.length; i++) {
                int e = targets[i][0];
                int f = targets[i][1];
                int c = Math.abs(result[0] - a);
                int d = Math.abs(result[1] - b);
                int g = Math.abs(e - a);
                int h = Math.abs(f - b);
                if(c >= g && d >= h){
                    result[0] = targets[i][0];
                    result[1] = targets[i][1];
                }
            }
            return result;
        }

    }
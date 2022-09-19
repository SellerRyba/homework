package Homework.module6;

class DistanceTest {
    public static void main(String[] args) {
        //Expect 14
        System.out.println(new Distance(10, 10, 20, 20).getDistance());

        //Expect 23
        System.out.println(new Distance(10, 10, 27, 25).getDistance());
    }


}
class Distance{
    private int startX;
    private int startY;
    private int endX;
    private int endY;
    Distance(int startX, int startY, int endX, int endY){
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
    }
    public int getDistance(){
        int first = Math.abs(endX - startX);
        int second = Math.abs(endY - startY);
        double result = Math.hypot(first, second);
        return (int) Math.round(result);
    }
}



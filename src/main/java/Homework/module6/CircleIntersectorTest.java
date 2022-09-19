package Homework.module6;

class CircleIntersectorTest {
    public static void main(String[] args) {
        //intersects
        System.out.println(new CircleIntersector(0, 0, 2, 4, 0, 2));

        //not intersects
        System.out.println(new CircleIntersector(0, 0, 1, 4, 0, 2));

        //not intersects
        System.out.println(new CircleIntersector(5, 5, 2, 8, 8, 2));
    }
}

class CircleIntersector {
    private int r1;
    private int r2;
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int first;
    private int second;
    private int third;
    private int result;
    private boolean a;

    public CircleIntersector(int x1, int y1, int r1, int x2, int y2, int r2) {
        this.x1 = x1;
        this.r1 = r1;
        this.r2 = r2;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        first = (this.y2 - this.y1) * (this.y2 - this.y1) + (this.x2 - this.x1) * (this.x2 - this.x1);
        second = (int) Math.sqrt(first);
        third = r2 + r1;
    }

    @Override
    public String toString() {
        String result = "";
        if (second <= third) {
            result += "intersects";
        } else {
            result += "not intersects";
        }

        return result;
    }
}

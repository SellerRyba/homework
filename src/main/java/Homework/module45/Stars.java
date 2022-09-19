package Homework.module45;

public class Stars {
    //    1000 звезд записывается символом X;
//    100 звезд записывается символом Y;
//    10 звезд записывается символом Z;
//    1 звезда записывается символом *;
    public static void main(String[] args) {
        Stars stars = new Stars();
        stars.setCount(153);
        System.out.println(stars);
        System.out.println(stars.getCount());

    }

    private int count;

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }
    @Override
    public String toString(){
        final StringBuilder sb = new StringBuilder();
        while (count > 0){
            if (count >= 1000) {
                NumberToSymbol(sb, 1000, "X");
            } else if (count >= 100) {
                NumberToSymbol(sb, 100, "Y");
            } else if (count >= 10) {
                NumberToSymbol(sb, 10, "Z");
            } else if (count >= 1) {
                NumberToSymbol(sb, 1, "*");
            }
        }
        return sb.toString();
    }
    private void NumberToSymbol(StringBuilder sb, int StarNumber, String SymbolStarNumber) {
        sb.append(SymbolStarNumber);
        count -= StarNumber;
    }



}

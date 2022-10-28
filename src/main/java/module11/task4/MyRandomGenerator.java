package module11.task4;

public class MyRandomGenerator {
    private final long a, c, m;

    private long seed;
    public MyRandomGenerator(long a, long c, long m){
        this.a = a;
        this.c = c;
        this.m = m;
    }
    public MyRandomGenerator seed(long seed){
        this.seed = seed;
        return this;
    }
    public long next(){
        return (a * seed + c) % m;
    }

}

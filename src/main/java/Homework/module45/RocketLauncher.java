package Homework.module45;

class RocketLauncher {
    private String size;
    private int rocketCount;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getRocketCount() {
        return rocketCount;
    }

    public void setRocketCount(int rocketCount) {
        this.rocketCount = rocketCount;
    }

    public static void main(String[] args) {
        RocketLauncher launcher = new RocketLauncher();
        launcher.setSize("big");
        launcher.setRocketCount(50);

        //Should be - Size is big, rocket count is 50
        System.out.println(launcher);
    }
    @Override
    public String toString(){
        String a = this.size;
        String b = Integer.toString(this.rocketCount);
        return "Size is " + a + ", rocket count is " + b;
    }
}

package Homework.module45;

public class ControlPanelTest {
    public static void main(String[] args) {
        new ControlPanel().control();
    }
}

class Altimeter {
    @Override
    public String toString() {
        return "Measure height";
    }
}

class AirGauge {
    @Override
    public String toString() {
        return "Measure air pressure";
    }
}

class ControlPanel {
    private Altimeter altimeter = new Altimeter();
    private AirGauge airGauge = new AirGauge();
    public void control(){
        altimeter.toString();
        airGauge.toString();
        System.out.println(altimeter.toString());
        System.out.println(airGauge.toString());
    }
}
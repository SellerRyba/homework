package Homework.module45;

abstract class SpaceObject {
    public static void main(String[] args) {
        PlanetTester tester = new PlanetTester();
        System.out.println(tester.test(new Mars())); //Should be true
        System.out.println(tester.test(new Moon())); //Should be false
}

}

abstract class Planet extends SpaceObject {
}

class Mars extends Planet {
}

class Moon extends SpaceObject {
}

class PlanetTester {
        public String test (SpaceObject object){
            Mars mars = new Mars();
            Moon moon = new Moon();
            if (object instanceof Moon) {
                return "not planet";
            }
            return "planet";
        }
    }


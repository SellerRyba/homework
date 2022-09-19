package Homework.module6;

class Hero {
    private String name;
    private int hp;

    public Hero(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public Hero() {
        this("Paratrooper", 100);
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        if(hp < 0){
            return 0;
        }
        if(hp > 200){
            return 200;
        }
        return hp;
    }
}

class HeroTest {
    public static void main(String[] args) {
        Hero hero = new Hero("Stranger", 50);

        //Expect Stranger
        System.out.println(hero.getName());

        //Expect 50
        System.out.println(hero.getHp());
    }
}
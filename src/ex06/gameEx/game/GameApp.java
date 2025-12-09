package ex06.gameEx.game;

public class GameApp {

    // u1 -> u2를 공격
    static void start(Protoss u1, Protoss u2) {
        // u2.hp = u2.hp - u1.attack;
        int remainHp = u2.getHp() - u1.getAttack();
        u2.setHp(remainHp);
    }

    public static void main(String[] args) {
        Protoss z1 = new Zealot();
        Protoss r1 = new River();
        Protoss d1 = new Dragoon();

        start(z1, d1);

        System.out.println(d1.getHp());

        start(d1, r1);

        System.out.println(r1.getHp());

        start(r1, z1);

        System.out.println(z1.getHp());

    }
}

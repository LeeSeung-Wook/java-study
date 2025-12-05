package ex06.game;

import java.util.Scanner;

public class GameApp {

    // u1 -> u2를 공격
    static void start(Protoss u1, Protoss u2) {
        u2.setHp(u2.getHp() - u1.getAttack());
    }

    public static void main(String[] args) {
        Protoss zealot = new Zealot();
        Protoss dragoon = new Dragoon();
        Protoss river = new River();

        Scanner sc = new Scanner(System.in);
        System.out.println("공격수와 수비수를 각각 입력하시오 : ");
        String attack = sc.nextLine();
        String hpdown = sc.nextLine();

        if (attack.equals("zealot")){
            if(hpdown.equals("zealot")){
                start(zealot,zealot);
            } else if (hpdown.equals("dragoon")) {
                start(zealot,dragoon);
            } else if (hpdown.equals("river")) {
                start(zealot,river);
            } else
                System.out.println("그런 유닛은 없습니다.");
        } else if (attack.equals("dragoon")) {
            if(hpdown.equals("zealot")){
                start(dragoon,zealot);
            } else if (hpdown.equals("dragoon")) {
                start(dragoon,dragoon);
            } else if (hpdown.equals("river")) {
                start(dragoon,river);
            } else
                System.out.println("그런 유닛은 없습니다.");
        } else if (attack.equals("river")) {
            if(hpdown.equals("zealot")){
                start(river,zealot);
            } else if (hpdown.equals("dragoon")) {
                start(river,dragoon);
            } else if (hpdown.equals("river")) {
                start(river,river);
            } else
                System.out.println("그런 유닛은 없습니다.");
        }else
            System.out.println("오류");

        System.out.println("===상태 확인===");
        //1. 드라군의 상태확인
        System.out.println("드라군 hp: "+dragoon.getHp());
        //2. 질럿의 상태확인
        System.out.println("리버 hp: "+river.getHp());
        //3. 질럿의 상태확인
        System.out.println("질럿 hp: "+zealot.getHp());
    }
}

package ex04;

public class Burger {

    String 재료1;
    String 재료2;
    String 재료3;
    int price;

    // 기본생성자
    Burger(){
        재료1 = "불고기";
        재료2 = "양상추";
        재료3 = "빵";
        price = 3800;
    }

    Burger(String 재료1, int price){
        this.재료1 = 재료1;
        재료2 = "양상추";
        재료3 = "빵";
        this.price = price;
    }

    Burger(String m1, String m2, String m3, int price){
        this.재료1 = m1;
        this.재료2 = m2;
        this.재료3 = m3;
        this.price = price;
    }


    public static void main(String[] args) {
        Burger b1 = new Burger();
        Burger b2 = new Burger();
        Burger b3 = new Burger();
        Burger b4 = new Burger();
        Burger b5 = new Burger();
        Burger b6 = new Burger();

        Burger b7 = new Burger("새우", 4000);
        Burger b8 = new Burger("한우불고기", 8000);

        Burger b9 = new Burger("참깨빵","방울토마토","훈제베이컨",11000);

        System.out.println(b9.재료1);
        System.out.println(b9.재료2);
        System.out.println(b9.재료3);
        System.out.println(b9.price);
    }
}
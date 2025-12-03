package algo;

public class Snale01 {
    public static void main(String[] args) {
        int[][] line = new int[5][5];
        int a = 1;

//            for (int i = 0; i < 5; i++) {
//                for (int j = 0; j < 5; j++) {
//                    line[j][i] = a;
//                    a++;
//                    System.out.print(line[j][i]+" ");
//                }
//                System.out.println();
//            }
        line[0][0] = 1; // line[0][0] = 1;
        line[0][1] = 2; // line[0][1] = 2;
        line[0][2] = 3; // line[0][2] = 3;
        line[0][3] = 4; // line[0][3] = 4;
        line[0][4] = 5; // line[0][4] = 5;
                        // line[0][5] = 6;

        line[1][0] = 16; // line[1][0] = 16;
        line[1][1] = 17; // line[1][1] = 17;
        line[1][2] = 18; // line[1][2] = 18;
        line[1][3] = 19; // line[1][3] = 19;
        line[1][4] = 6; // line[1][4] = 6;
                        // line[1][5] = 6;

        line[2][0] = 15;
        line[2][1] = 24;
        line[2][2] = 25;
        line[2][3] = 20;
        line[2][4] = 7;

        line[3][0] = 14;
        line[3][1] = 23;
        line[3][2] = 22;
        line[3][3] = 21;
        line[3][4] = 8;

        line[4][0] = 13;
        line[4][1] = 12;
        line[4][2] = 11;
        line[4][3] = 10;
        line[4][4] = 9;
    }
}

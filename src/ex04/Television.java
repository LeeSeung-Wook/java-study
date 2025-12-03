package ex04;

public class Television {
    int channal;
    int volume;
    boolean onOff;

    public static void main(String[] args) {
        Television myTv = new Television();
        myTv.channal = 7;
        myTv.volume = 10;
        myTv.onOff = true;

        Television yourTv = new Television();
        yourTv.channal = 9;
        yourTv.volume = 12;
        yourTv.onOff = true;

        System.out.println("나의 텔레비전의 채널은 " + myTv.channal +
                "이고 볼륨은" + myTv.volume + "입니다.");
        System.out.println("너의 텔레비전의 채널은 " + yourTv.channal +
                "이고 볼륨은" + yourTv.volume + "입니다.");
    }
}

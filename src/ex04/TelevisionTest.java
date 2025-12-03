package ex04;

class Televisions {
    private int channel;
    private int volume;
    private boolean onOff;

    Televisions(int c, int v, boolean o){
        channel = c;
        volume = v;
        onOff = o;
    }

    void print() {
        System.out.println("채널은" + channel + "이고 볼륨은 " + volume + "입니다.");
    }
}
public class TelevisionTest {
    public static void main(String[] args) {
        Televisions myTv = new Televisions(7,10,true);
        myTv.print();

        Televisions yourTv = new Televisions(11,20,true);
        yourTv.print();
    }
}
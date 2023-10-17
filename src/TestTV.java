import java.util.Date;
import java.util.Random;

public class TestTV {
    public static void main(String[] args) {
        AClass aClass = new AClass();
        System.out.println(aClass.s);
        System.out.println(aClass.x);
        java.util.Date date = new Date();
        System.out.println(date.getTime());
       //System.out.println(date.toString());
        Random random = new Random();
        for (int i = 0; i < 10; i++)
            System.out.print(random.nextInt(1000) + "  ");
        System.out.println();




        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);

        TV tv2 = new TV();
        tv2.turnOn();
        tv2.channelUp();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();
        tv2.volumeUp();
        System.out.println("tv1's channel is " + tv1.getChannel() +
                " and volume level is " + tv1.getVolumeLevel());
        System.out.println("tv2's channel is " + tv2.getChannel() +
                " and volume level is " + tv2.getVolumeLevel());
    }




}

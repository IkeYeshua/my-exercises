public class TV {
    private int channel = 1;
    int volumeLevel = 1;
    boolean on = false;

    public TV() {
    }

    public void turnOn (){
        on = true;
    }

    public void turnOff() {
        on = false;

    }

    public int getChannel() {
        return channel;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setChannel(int newChannel) {
        if ( on && newChannel >= 1 && newChannel <= 120)
            channel = newChannel;

    }

    public void setVolume(int newVolumelevel){
        if (on && newVolumelevel >= 1 && newVolumelevel <= 7)
            volumeLevel = newVolumelevel;
    }

    public void channelUp() {
        if (on && channel < 120)
            channel++;
    }

    public void channel() {
        if (on && channel > 1 )
            channel--;
    }

    public void volumeUp() {
        if (on && volumeLevel < 7)
            volumeLevel++;
    }
    public void volumeDown() {
        if (on && volumeLevel > 1)
            volumeLevel--;
    }

}
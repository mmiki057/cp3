public class TV implements CanOnOff, CanChangeChannel, CanChangeVolume {
    private boolean isOn;
    private int currentChannel = 1;
    int volume = 0;

    @Override
    public void on() {
        if (!isOn) {
            isOn = true;
            System.out.println("The TV is now ON.");
        } else {
            System.out.println("The TV is already ON.");
        }
    }

    @Override
    public void off() {
        if (isOn) {
            isOn = false;
            System.out.println("The TV is now OFF.");
        } else {
            System.out.println("The TV is already OFF.");
        }
    }

    public void status() {
        if (isOn) {
            System.out.println("TV is currently ON.");
        } else {
            System.out.println("TV is currently OFF.");
        }
    }

    public void channelUp(){
        currentChannel++;
        System.out.println(currentChannel);
    }

    public void channelDown(){
        currentChannel--;
        System.out.println(currentChannel);
    }

    @Override
    public void setChannel(int channelNo) {
        if (isOn) {
            if (channelNo >= 1 && channelNo <= 99) {
                currentChannel = channelNo;
                System.out.println("Channel set to: " + currentChannel);
            } else {
                System.out.println("Invalid channel number. Allowed range is 1 through 99.");
            }
        } else {
            System.out.println("TV is OFF. Turn it on to change the channel.");
        }
    }

    public void volumeUp(){
        if(isOn){
            if (volume < 10){
                volume++;
                System.out.println("Volume level:" + volume);
            }
            else{
                System.out.println("Too loud!");
            }
        }
        else{
            System.out.println("Turn the TV on!");
        }
    }

    public void volumeDown(){
        if (isOn){
            if (volume > 1){
            volume--;
            System.out.println("Volume level:" + volume);
        }
        else{
            System.out.println("Too quiet...");
            }
        }
        else{
            System.out.println("Turn the TV on!");
        }
    }

    public static void main(String[] args) {
        TV tv = new TV();

        tv.on();
        tv.status();
        tv.setChannel(15);
        tv.volumeUp();
        tv.volumeUp();
        tv.volumeUp();
        tv.volumeUp();
        tv.volumeUp();
        tv.volumeUp();
        tv.volumeUp();
        tv.off();
        tv.status();
    }
}

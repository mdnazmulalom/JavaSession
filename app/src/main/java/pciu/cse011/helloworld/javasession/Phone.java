package pciu.cse011.helloworld.javasession;

public class Phone {
    private   int screenSize;
    private   String name;
    private   int mymoryRam;
    private   int camera;

    public Phone(int screenSize, String name, int mymoryRam, int camera) {
        this.screenSize = screenSize;
        this.name = name;
        this.mymoryRam = mymoryRam;
        this.camera = camera;
    }

    public Phone(int mymoryRam) {
        this.mymoryRam = mymoryRam;
    }

    public void playMusic(String trackName){
        System.out.println("playing : "+ trackName);
    }
    public void  setName (String name){
        this.name = name;
    }
    public String getName (){
        return this.name;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public int getMymoryRam() {
        return mymoryRam;
    }

    public void setMymoryRam(int mymoryRam) {
        this.mymoryRam = mymoryRam;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }
}

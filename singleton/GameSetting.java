public class GameSetting {
    private static GameSetting instance;

    private int sound;
    private float speed;

    private GameSetting() {
        this.sound = 1;
        this.speed = 1.0f;
    }

    public static GameSetting getInstance() {
        if (instance == null) {
            synchronized (GameSetting.class) {
                if (instance == null) {
                    instance = new GameSetting();
                }
            }
        }
        return instance;
    }

    public void setSpeed(float speed){
        this.speed = speed;
    }

    public float getSpeed(){
        return this.speed;
    }

    public void setSound(int sound){
        this.sound = sound;
    }

    public int getSound(){
        return this.sound;
    }

     public String toString() {
        return "GameSetting{" +
                "sound=" + sound +
                ", speed=" + speed +
                '}';
    }
}

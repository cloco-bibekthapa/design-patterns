
public class SingletonDemo {
    public static void main(String[] args) {
        GameSetting gameSetting = GameSetting.getInstance();

        gameSetting.setSpeed(1.5f);
        gameSetting.setSound(2);
        System.out.println(gameSetting);

        GameSetting gameSetting2 = GameSetting.getInstance();

        System.out.println(gameSetting2);
        
    }
}

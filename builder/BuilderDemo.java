public class BuilderDemo {
    public static void main(String[] args) {
        Player goalkeeper = new Player.Builder()
            .setName("Jan Oblak")
            .setNationality("Slovenia")
            .setPosition("Goalkeeper")
            .setGkPositioning(92)
            .setGkReflexes(93)
            .setGkHandling(91)
            .setGkKicking(88)
            .setStrength(80)  
            .setPace(65)
            .build();

        System.out.println(goalkeeper);

        Player striker = new Player.Builder()
            .setName("Lionel Messi")
            .setNationality("Argentina")
            .setPosition("Striker")
            .setFinishing(95)
            .setHeading(85)
            .setPace(91)
            .setStrength(70)
            .setAcceleration(91)
            .build();

        System.out.println(striker);
    }
}

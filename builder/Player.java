public class Player {
    private String name;
    private String nationality;
    private String position;
    private int longPassing;
    private int shortPassing;
    private int heading;
    private int finishing;
    private int strength;
    private int defending;
    private int tackling;
    private int pace;
    private int acceleration;

    private int gkPositioning;
    private int gkReflexes;
    private int gkHandling;
    private int gkKicking;

    public String toString() {
        return "FootballPlayer{" +
                "name='" + name + '\'' +
                ", nationality='" + nationality + '\'' +
                ", position='" + position + '\'' +
                ", longPassing=" + longPassing +
                ", shortPassing=" + shortPassing +
                ", heading=" + heading +
                ", finishing=" + finishing +
                ", strength=" + strength +
                ", defending=" + defending +
                ", tackling=" + tackling +
                ", pace=" + pace +
                ", acceleration=" + acceleration +
                ", gkPositioning=" + gkPositioning +
                ", gkReflexes=" + gkReflexes +
                ", gkHandling=" + gkHandling +
                ", gkKicking=" + gkKicking +
                '}';
    }

    public static class Builder {
        private String name;
        private String nationality;
        private String position;
        private int longPassing;
        private int shortPassing;
        private int heading;
        private int finishing;
        private int strength;
        private int defending;
        private int tackling;
        private int pace;
        private int acceleration;

        private int gkPositioning;
        private int gkReflexes;
        private int gkHandling;
        private int gkKicking;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setNationality(String nationality) {
            this.nationality = nationality;
            return this;
        }

        public Builder setPosition(String position) {
            this.position = position;
            return this;
        }

        public Builder setLongPassing(int longPassing) {
            this.longPassing = longPassing;
            return this;
        }

        public Builder setShortPassing(int shortPassing) {
            this.shortPassing = shortPassing;
            return this;
        }

        public Builder setHeading(int heading) {
            this.heading = heading;
            return this;
        }

        public Builder setFinishing(int finishing) {
            this.finishing = finishing;
            return this;
        }

        public Builder setStrength(int strength) {
            this.strength = strength;
            return this;
        }

        public Builder setDefending(int defending) {
            this.defending = defending;
            return this;
        }

        public Builder setTackling(int tackling) {
            this.tackling = tackling;
            return this;
        }

        public Builder setPace(int pace) {
            this.pace = pace;
            return this;
        }

        public Builder setAcceleration(int acceleration) {
            this.acceleration = acceleration;
            return this;
        }

        public Builder setGkPositioning(int gkPositioning) {
            this.gkPositioning = gkPositioning;
            return this;
        }

        public Builder setGkReflexes(int gkReflexes) {
            this.gkReflexes = gkReflexes;
            return this;
        }

        public Builder setGkHandling(int gkHandling) {
            this.gkHandling = gkHandling;
            return this;
        }

        public Builder setGkKicking(int gkKicking) {
            this.gkKicking = gkKicking;
            return this;
        }

        public Player build() {
            Player player = new Player();
            player.name = this.name;
            player.nationality = this.nationality;
            player.position = this.position;
            player.longPassing = this.longPassing;
            player.shortPassing = this.shortPassing;
            player.heading = this.heading;
            player.finishing = this.finishing;
            player.strength = this.strength;
            player.defending = this.defending;
            player.tackling = this.tackling;
            player.pace = this.pace;
            player.acceleration = this.acceleration;

            player.gkPositioning = this.gkPositioning;
            player.gkReflexes = this.gkReflexes;
            player.gkHandling = this.gkHandling;
            player.gkKicking = this.gkKicking;

            return player;
        }
    }
}

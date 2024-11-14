public class AbstractFactoryDemo {
    public static void createBuilding(BuildingFactory factory) {
        Wall wall = factory.createWall();
        Door door = factory.createDoor();
        Window window = factory.createWindow();

        System.out.println(wall.getMaterial());
        System.out.println(door.getMaterial());
        System.out.println(window.getMaterial());
    }

    public static void main(String[] args) {
        BuildingFactory woodFactory = new WoodBuildingFactory();
        BuildingFactory sandFactory = new SandBuildingFactory();
        BuildingFactory ironFactory = new IronBuildingFactory();

        Wall wall = woodFactory.createWall();
        System.out.println(wall.getMaterial());

        Wall wall2 = sandFactory.createWall();
        System.out.println(wall2.getMaterial());

        Door door = ironFactory.createDoor();
        System.out.println(door.getMaterial());

        Window window= ironFactory.createWindow();
        System.out.println(window.getMaterial());
    }
}

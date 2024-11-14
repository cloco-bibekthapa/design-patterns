// Wood Factory
class WoodBuildingFactory implements BuildingFactory {
    public Wall createWall() {
        return new WoodWall();
    }
    public Door createDoor() {
        return new WoodDoor();
    }
    public Window createWindow() {
        return new WoodWindow();
    }
}

// Sand Factory
class SandBuildingFactory implements BuildingFactory {
    public Wall createWall() {
        return new SandWall();
    }
    public Door createDoor() {
        return new SandDoor();
    }
    public Window createWindow() {
        return new SandWindow();
    }
}

// Iron Factory
class IronBuildingFactory implements BuildingFactory {
    public Wall createWall() {
        return new IronWall();
    }
    public Door createDoor() {
        return new IronDoor();
    }
    public Window createWindow() {
        return new IronWindow();
    }
}

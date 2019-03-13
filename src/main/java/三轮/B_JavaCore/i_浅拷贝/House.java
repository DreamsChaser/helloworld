package 三轮.B_JavaCore.i_浅拷贝;

/**
 * @author sirius
 * @since 2019/3/12
 */
public class House implements Cloneable{

    private int size;

    private String name;

    private Door door;

    private Room room;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public House(int size, String name, Door door, Room room) {
        this.size = size;
        this.name = name;
        this.door = door;
        this.room = room;
    }
}

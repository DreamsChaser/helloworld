package 三轮.B_JavaCore.i_浅拷贝与深拷贝;

/**
 * @author sirius
 * @since 2019/3/12
 */
public class CloneTest {

    public static void main(String[] args) {
        Door door = new Door(10,5);
        Room room = new Room(20);
        House house1 = new House(120,"商品房",door,room);
        try {
            House house2 = (House) house1.clone();
            System.out.println(house1.getSize() == house2.getSize());
            System.out.println(house1.getName() == house2.getName());
            System.out.println(house1.getDoor() == house2.getDoor());
            System.out.println(house1.getRoom() == house2.getRoom());
            house1.setSize(250);
            house1.setName("别墅");
            house1.getDoor().setHeight(40);
            house1.getRoom().setSize(50);
            System.out.println(house1.getName() == house2.getName());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

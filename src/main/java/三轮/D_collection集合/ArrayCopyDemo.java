package 三轮.D_collection集合;

import 三轮.B_JavaCore.i_浅拷贝与深拷贝.Door;
import 三轮.B_JavaCore.i_浅拷贝与深拷贝.House;
import 三轮.B_JavaCore.i_浅拷贝与深拷贝.Room;

/**
 * @author sirius
 * @since 2019/3/18
 */
public class ArrayCopyDemo {
    public static void main(String[] args) {
        Door door = new Door(10,5);
        Room room = new Room(50);
        House house = new House(120,"房子",door,room);
        House[] houses = new House[]{house};
        House[] houses2 = new House[1];
        System.arraycopy(houses,0,houses2,0,1);
        System.out.println(houses2);
        house.setName("房子改");
        house.setSize(150);
        house.getRoom().setSize(100);
        House[] houses3 = houses.clone();
        System.out.println(houses3);
    }
}

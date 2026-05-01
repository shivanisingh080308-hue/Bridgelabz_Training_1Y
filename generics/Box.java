package generics;
import java.util.ArrayList;
public class Box {
    static void main() {

        ArrayList list=new ArrayList();
        list.add("Shivani");
        list.add(43);
        list.add(23.3);
        list.add("n");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));

    }
}

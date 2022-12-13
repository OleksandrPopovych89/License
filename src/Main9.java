import java.util.*;

public class Main9 {

    public static void main(String[] args) {


        List<Integer> delList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            delList.add(i);
        }
        delList.removeIf(integer -> integer < 10);
        System.out.println(delList);
    }
}
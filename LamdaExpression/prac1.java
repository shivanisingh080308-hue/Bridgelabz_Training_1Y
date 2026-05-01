package LamdaExpression;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class prac1 {
    static void main(String[] args) {
        List<Integer> l= Arrays.asList(34,65,33,78,23,76);
        System.out.println("this is our list"+l);

        Collections.sort(l);
        System.out.println("sorted list"+l);

        Collections.shuffle(l);
        System.out.println("shuffeled list"+l);

        System.out.println(" max ele of list "+Collections.max(l));
        System.out.println("min ele of list "+Collections.min(l));

        Collections.sort(l,Collections.reverseOrder());
        System.out.println("reverse"+l);
    }
}

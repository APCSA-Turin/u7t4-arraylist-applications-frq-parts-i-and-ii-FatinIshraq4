import java.util.ArrayList;
import java.util.Arrays;
public class questions {
    public static void main(String[] args) {
        ArrayList<Integer> numList2 = new ArrayList<Integer>(Arrays.asList( 2, 2, 2, 4, 5, 6, 8, 8, 9, 10, 12));
for (int i =numList2.size()-1; i>= 0; i--) {
    if (numList2.get(i) % 2 == 0) {
        numList2.remove(i);
    }
}
System.out.println(numList2);


    }
}

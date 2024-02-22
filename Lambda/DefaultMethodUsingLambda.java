package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DefaultMethodUsingLambda {
    public static void main(String[] args) {
        Integer[] ary=new Integer[]{1,2,3,4,5,6,7,8,9,10};
        List<Integer> list = Arrays.asList(ary);

        //THis is External Iterator
//        for(int i=0; i<list.size(); i++){
//            System.out.println(list.get(i) * list.get(i));
//        }

        //This is Internal Iterator.
        list.forEach(e -> System.out.println(e*e));
    }
}

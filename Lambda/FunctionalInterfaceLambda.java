//package Lambda;
//
//import java.util.function.BiFunction;
//import java.util.function.Consumer;
//import java.util.function.Function;
//
//public class FunctionalInterfaceLambda {
//    interface interface1{
//        String setString(String str);
//    }
//    interface interface2{
//        void displayString(String str);
//    }
//    interface interface3 {
//        String concatString(String str, Integer i);
//    }
//    public static void main(String[] args) {
//        interface1 obj1= (str)-> str;
//
//        interface2 obj2= (str)-> System.out.println(str);
//
//        interface3 obj3= (str, i)-> str +i ;
//
//
//        System.out.println(obj1.setString("Apple"));
//        obj2.displayString("banana");
//        System.out.println(obj3.concatString("carrot", 3));
//    }
//}

package Lambda;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionalInterfaceLambda {
    public static void main(String[] args) {
        Function<String,String> obj1 =(str)-> str;

        Consumer<String> obj2 =(str)-> System.out.println(str);

        BiFunction<String, Integer, String> obj3= (str, i)-> str +i ;

        System.out.println(obj1.apply("Apple"));
        obj2.accept("banana");
        System.out.println(obj3.apply("carrot", 3));
    }
}

package Lambda;

public class ConstructorRefLambdaExample {
    interface AryInterface{
        String setString(String str);
    }
    public static void main(String[] args) {
        //AryInterface obj =(str) -> new String(str);
        AryInterface obj = String::new;

        System.out.println(obj.setString("Apple"));
    }
}

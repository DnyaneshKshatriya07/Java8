package Lambda;

public class MethodRefLambdaExample {
    interface interface1{
        void meth();
    }

    interface interface2{
        void meth(String str);
    }

    static void staticMethod(){
        System.out.println("Display Message from Static method");
    }

    void nonstaticMethod(){
        System.out.println("Display Message from non Static method");
    }
    public static void main(String[] args) {
        MethodRefLambdaExample obj =new MethodRefLambdaExample();

        //interface1 obj1= ()-> staticMethod();
        interface1 obj1 = MethodRefLambdaExample::staticMethod;// <== this is known as Method Reference.

        //interface2 obj2=(str)-> System.out.println(str);
        interface2 obj2 = System.out::println;

        //interface1 obj3= ()-> obj.nonstaticMethod();
        interface1 obj3 = obj::nonstaticMethod;

        obj1.meth();
        obj2.meth("string str");
        obj3.meth();
    }

}

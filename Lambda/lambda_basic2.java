package Lambda;

public class lambda_basic2 {
    interface Math{
        void findSum(int a, int b);
    }

    static void execute(Math obj){
        obj.findSum(10, 50);
    }

    public static void main(String[] args) {
        //Before Lambda Function
        Math obj= new Math()
        {
            @Override
            public void findSum(int a, int b) {
                System.out.println(a+b);
            }
        };

        //After Lambda Function
        Math obj1= (a,b) -> System.out.println(a+b);

        execute(obj);
        execute(obj1);
    }
}

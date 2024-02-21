package Lambda;

public class lambda_basic {
    interface Math{
        void findSum();
    }

    static void execute(Math obj){
        obj.findSum();
    }

    public static void main(String[] args) {
        //Before Lambda Function
        Math obj= new Math()
        {
            @Override
            public void findSum() {
                System.out.println(10+10);
            }
        };

        //After Lambda Function
        Math obj1= () -> System.out.println(10 + 20);

        execute(obj);
        execute(obj1);
    }
}

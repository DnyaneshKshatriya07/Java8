package Lambda;

public class LambdaWithReturn {
    static void execute(Math obj){
        System.out.println(obj.findSum(70, 50));
    }

    interface Math{
        int findSum(int a, int b);
    }

    static int meth(int a, int b){
        int x=a+b;
        return x;
    }
    public static void main(String[] args) {
        Math obj= (int a, int b) -> meth(a,b);

        execute(obj);
    }
}

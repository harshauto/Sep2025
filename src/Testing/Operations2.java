package Testing;

public class Operations2 {


//    Assignment2------------
//    (((((10*3)+2)*4)-4)/2)

    public int mul(int a, int b)
    {
        return a*b;
    }

    public int add(int a, int b)
    {
        return a+b;
    }

    public int sub(int a, int b)
    {
        return a-b;
    }

    public void div(int a, int b)
    {
        int result = a/b;
        System.out.println("Result after division for (((((10*3)+2)*4)-4)/2) : "+result);
    }

    public static void main(String[] args) {
        Operations2 ops = new Operations2();
        int resultmul = ops.mul(10, 3);
        System.out.println("Result after multiplication: "+resultmul);
        int totaladd = ops.add(resultmul, 2);
        System.out.println("Total after addition: "+totaladd);
        int totalmul = ops.mul(totaladd, 4);
        System.out.println("Total after second multiplication: "+totalmul);
        int totalsub = ops.sub(totalmul, 4);
        System.out.println("Total after subtraction: "+totalsub);
        ops.div(totalsub, 2);

    }


}

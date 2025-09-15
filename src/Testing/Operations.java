package Testing;

public class Operations {

    //Assignment1--------------
    //(((((10+2)+2)-2)*2)/2)

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public void divide(int a, int b) {
        int result = a / b;
        System.out.println("Result after division for (((((10+2)+2)-2)*2)/2) : " + result);
    }

    public static void main(String[] args) {
        Operations ops = new Operations();
        int resultadd = ops.add(10, 2);
        System.out.println("Result after addition: " + resultadd);
        int totaladd = ops.add(resultadd, 2);
        System.out.println("Total after second addition: " + totaladd);
        int totalsub = ops.subtract(totaladd, 2);
        System.out.println("Total after subtraction: " + totalsub);
        int mulresult = ops.multiply(totalsub, 2);
        System.out.println("Result after multiplication: " + mulresult);
        ops.divide(mulresult,  2);
    }

}

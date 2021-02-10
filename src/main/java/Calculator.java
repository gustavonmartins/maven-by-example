public class Calculator{
    public static int calculate(int a, int b, String op) throws UnsupportedOperationException{
        if (op=="add"){
            return a+b;
        }
        else if (op=="mult"){
            return a*b;
        }
        else if (op=="power"){
            return (int) Math.pow(a,b);
        }

        else {
            throw new UnsupportedOperationException("Operation not implemented in calculator");
        }
    }
}
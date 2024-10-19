

public class Calc {
    
    public static <N extends Number> Double sumDouble(N n1, N n2){
        return n1.doubleValue() + n2.doubleValue(); 
    }
    public static <N extends  Number> Double multipleDouble(N n1, N n2){
        return  n1.doubleValue() * n2.doubleValue();
    }
    public  static <N extends  Number> Double divideDouble(N n1, N n2){
        if(n2.doubleValue() == 0) {
            throw new ArithmeticException("Деление на ноль!!!!!");
        }
        return  n1.doubleValue() / n2.doubleValue();
    }
    
    public  static <N extends  Number> Double subtractDouble(N n1, N n2){
        return  n1.doubleValue() - n2.doubleValue();
    }

    public static void main(String[] args) {
        Calc c = new Calc();
        int a =10;
        float b = 9.456f;
        double d = 18.45d;
        System.out.println(c.sumDouble(a, b));
        System.out.println(c.subtractDouble(d, b));
    }
}

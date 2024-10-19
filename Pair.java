

public class  Pair <A,B>{
    private  A first;
    private  B second;

    public Pair(A a,B b) {
        this.first = a;
        this.second = b;
    }
    
    public  A getFirst(){
        return first;
    }
    public  B getSecond(){
        return second;
    }

    @Override
    public String toString() {
        return "first : "+ first.toString()+" second : " + second.toString();
    }
    public static void main(String[] args) {
        int a = 10;
        float b = 1.008f;
        Pair p = new Pair(a, b);
        System.out.println(p);
    }
    
}

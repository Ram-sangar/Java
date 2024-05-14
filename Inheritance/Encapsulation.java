public class Encapsulation {
    private int a ;
    private int b ;

    public Encapsulation(int a,int b){
        this.a = a;
        this.b = b;
    }

    public void set(int a){
        this.a=a;

    }
    public int get(){
        System.out.println(a);
        return this.a;

    }
    public static void main(String[] args) {
        Encapsulation e = new Encapsulation(20,20);

        e.set(100);
        e.get();
    }
}

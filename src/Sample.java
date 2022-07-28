public class Sample {
    int x;
    public void assign(int x){
        x=40;
    }
}
class Test extends Sample{
    public void assign(int x){
         x=20;
    }

}
class Main
{
    public static void main(String[] args) {
        Test t1=new Test();
        t1.x=10;
        t1.assign(56);
        System.out.println(t1.x);


    }
}

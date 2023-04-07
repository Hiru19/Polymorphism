public class Aa {
    void method(){

    }
}
class  Bb extends Aa{
    void method(){
        System.out.println("aB");
    }
}
class Cc extends  Bb {
    void method(){
        System.out.println("bC");
    }

    void newmethod(){
        System.out.println("Bc");}

}
class  TestRun{
    public static void main(String[] args) {
        Aa a =new Aa(); a.method();
        Aa b= new Bb(); b.method();
        Bb bb = new Bb(); bb.method();
        Bb cc =new Cc(); cc.method();
    }
}

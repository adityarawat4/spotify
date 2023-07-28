 class animal {
    void eat(){
        System.out.println("eating.......");
    }
}
class dog extends animal{
    void run(){
        System.out.println("runing.........");
    }
}
class cat extends dog{
    void bark(){
        System.out.println("barking........");
    }
}
public class single{
    public static void main(String[] args) {
        dog d=new dog();
        d.eat();
        cat c=new cat();
        c.run();
    }
}

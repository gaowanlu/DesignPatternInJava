package 没有代理代码;

public class Main {
    public static void main(){
        System.out.println("--没有代理代码--");
        SchoolGirl mm=new SchoolGirl();
        mm.setName("小红");
        Pursuit you=new Pursuit(mm);//mm如果根本不认识you 那么就是you直接送给了mm 但二者是不认识的 所有存在问题
        you.GiveChocolate();
        you.GiveDolls();
        you.GiveFlowers();
    }
}

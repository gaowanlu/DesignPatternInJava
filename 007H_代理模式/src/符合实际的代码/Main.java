package 符合实际的代码;

import 没有代理代码.SchoolGirl;

public class Main {
    public static void main(){
        System.out.println("--符合实际的代码--");
        SchoolGirl mm=new SchoolGirl();
        mm.setName("小红");
        Proxy daily=new Proxy(mm);//daily认识小红 但daily送出的礼物实际上是，一个追求者送的
        daily.GiveChocolate();
        daily.GiveDolls();
        daily.GiveFlowers();
    }
}

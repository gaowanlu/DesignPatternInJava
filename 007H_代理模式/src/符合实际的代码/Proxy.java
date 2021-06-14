package 符合实际的代码;

import 没有代理代码.SchoolGirl;

public class Proxy implements GiveGift{
    Pursuit gg;
    public Proxy(SchoolGirl mm){
        this.gg=new Pursuit(mm);
    }
    public void GiveDolls(){
        gg.GiveDolls();
    }
    public void GiveFlowers(){
        gg.GiveFlowers();
    }
    public void GiveChocolate(){
        gg.GiveChocolate();
    }
}

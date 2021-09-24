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

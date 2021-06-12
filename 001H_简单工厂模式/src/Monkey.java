public class Monkey extends Animal{
    Monkey(){
        super();
        super.type="Monkey";
    }
    @Override
    public void sayType(){
        System.out.println(super.type);
    }
}

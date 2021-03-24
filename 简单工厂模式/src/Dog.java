public class Dog extends Animal{
    Dog(){
        super();
        super.type="Dog";
    }
    @Override
    public void sayType(){
        System.out.println(super.type);
    }
}

public class People extends Animal{
    People(){
        super();
        super.type="People";
    }
    @Override
    public void sayType(){
        System.out.println(super.type);
    }
}

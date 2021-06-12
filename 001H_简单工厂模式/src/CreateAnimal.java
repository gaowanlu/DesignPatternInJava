public class CreateAnimal {
    public static Animal create(String type){
        switch (type){
            case "Monkey":return new Monkey();
            case "Dog":return new Dog();
            case "People":return new People();
            default:return null;
        }
    }
}

public class Person {
    public Person(){

    }
    private String name;
    public Person(String name){
        this.name=name;
    }
    public void Show(){//Show是修饰的根源
        System.out.println("修饰的"+name);
    }
}

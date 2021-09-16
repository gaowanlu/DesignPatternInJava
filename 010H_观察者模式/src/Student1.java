public class Student1 extends Observer{
    public String name;
    public Student1(Subject subject,String name){
        super();
        super.setSubject(subject);
        this.name=name;
    }
    @Override
    public void update() {
        System.out.println(name+":我接到通知了，"+super.getSubject().getStatus());
    }
}

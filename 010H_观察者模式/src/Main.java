public class Main {
    public static void main(String[] args) {
        Subject subject=new Teacher("高老师");
        Observer observer1=new Student1(subject,"小明");
        Observer observer2=new Student1(subject,"小李");
        subject.setStatus("高老师回来了");
    }
}

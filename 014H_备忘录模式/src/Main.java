public class Main {
    public static void main(String[] args) {
        CareTaker careTaker=new CareTaker();
        Task task=new Task();
        task.setState("asdfg");
        careTaker.addState(task.saveStateToMemento());//保存
        System.out.println(task);
        task.setState("asdfgh");
        careTaker.addState(task.saveStateToMemento());//保存
        System.out.println(task);
        //切换到以前的状态
        task.setState(careTaker.getIndexState(0).getState());
        System.out.println(task);
    }
}

//抽象观察者
public abstract class Observer {
    private Subject subject;
    public  void setSubject(Subject subject){
        this.subject=subject;
        subject.addObserver(this);
    }
    public Subject getSubject(){
        return subject;
    }
    public abstract void update();
}

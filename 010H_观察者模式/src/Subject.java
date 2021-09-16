import java.util.*;

//抽象统治者
public abstract class Subject {
    private String status;
    public String getStatus(){
        return status;
    }
    public void setStatus(String status){
        this.status=status;
        notif();
    }
    private List<Observer> observerList=new ArrayList<>();
    public void addObserver(Observer observer){
        observerList.add(observer);
    }
    public void delObserver(Observer observer){
        observerList.remove(observer);
    }
    public void notif(){
        for(Observer observer:observerList){
            observer.update();
        }
    }
}

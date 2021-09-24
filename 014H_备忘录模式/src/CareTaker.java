import java.util.*;
import java.util.ArrayList;

public class CareTaker {
    private List<Memento> mementoList=new ArrayList();
    public void clearState(){
        mementoList.clear();
    }
    public void addState(Memento memento){
        mementoList.add(memento);
    }
    public Memento getIndexState(int index){
        return mementoList.get(index);
    }
}

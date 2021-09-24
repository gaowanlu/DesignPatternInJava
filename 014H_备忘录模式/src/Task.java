public class Task {
    private String state;

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }

    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    public void getStateFromMemento(Memento Memento){
        state = Memento.getState();
    }
    // TODO: 2021/9/24

    @Override
    public String toString() {
        return "Task{" +
                "state='" + state + '\'' +
                '}';
    }
}
public class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("start action");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Start State";
    }
}

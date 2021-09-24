public class Context {
    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    private State state;
    public Context() {
        state = null;
    }
}

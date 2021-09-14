public class Work implements Cloneable{
    private String date;
    private String location;
    public void setData(String date,String location){
        this.date=date;
        this.location=location;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Work{" +
                "date='" + date + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}

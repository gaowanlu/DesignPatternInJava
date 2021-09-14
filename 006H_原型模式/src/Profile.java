public class Profile implements Cloneable{
    private String name;
    private String sex;
    private Work work;
    public Profile(String name,String sex){
        this.name=name;
        this.sex=sex;
        work=new Work();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    //method 1
//    private Profile(Work work){
//        try {
//            this.work=(Work)work.clone();//深拷贝work
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
//    }
    public void setWork(String date,String location){
        work.setData(date,location);
    }

    //method2
    private void setWork(Work work){
        try {
            this.work=(Work)work.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }


    @Override
    protected Object clone() {
        //method1
//        Profile obj=new Profile(work);
//        obj.name=this.name;
//        obj.sex=this.sex;
//        return obj;

        //method2
        Object obj=null;
        try {
            obj=super.clone();
            Profile profile=(Profile)obj;
            profile.setWork(this.work);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }finally {
            return obj;
        }

    }

    public void display(){
        System.out.println(String.format("name:%s sex:%s work:%s",name,sex,work.toString()));
    }
}

public class SayAll {
    private Say say1;
    private  Say say2;
    private Say say3;
    public SayAll(){
        say1=new SayImp1();
        say2=new SayImp2();
        say3=new SayImp3();
    }

    public void show() {
        say1.show();
        say2.show();
        say3.show();
    }

    public void imp1(){
        say1.show();
    }

    public void imp2(){
        say2.show();
    }

    public void imp3(){
        say3.show();
    }

}

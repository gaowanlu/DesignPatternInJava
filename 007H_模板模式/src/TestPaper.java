public abstract class TestPaper {
    public void quest1(){
        System.out.println("quest1: a.里 b.的 c.他 d.欢");
    }
    public void quest2(){
        System.out.println("quest2: a.vf b.报告 c.您好 d.表格");
    }
    public abstract void rp1();
    public abstract void rp2();
    protected final void rp(){//模板方法
        System.out.println("------------------------------------");
        quest1();
        rp1();
        quest2();
        rp2();
    }
}


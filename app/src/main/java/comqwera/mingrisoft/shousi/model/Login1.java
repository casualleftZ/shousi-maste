package comqwera.mingrisoft.shousi.model;

public class Login1 {
    private int zt_id;
    private int zt;
    private int u_id;
    private int or_id;
    public Login1(){
        super();
    }
    public Login1(int zt_id, int zt,int u_id,int or_id){
        super();
        this.zt_id=zt_id;
        this.zt=zt;
        this.u_id=u_id;
        this.or_id=or_id;
    }
//设置获得属性
    public int getZt_id() {
        return zt_id;
    }

    public int getZt() {
        return zt;
    }

    public int getU_id() {
        return u_id;
    }

    public int getOr_id() {
        return or_id;
    }

    //设置可写属性
    public void setZt_id(int zt_id) {
        this.zt_id = zt_id;
    }

    public void setZt(int zt) {
        this.zt = zt;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public void setOr_id(int or_id) {
        this.or_id = or_id;
    }
}

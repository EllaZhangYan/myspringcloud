package com.hzit;

import java.util.Date;

public class Order {
    private String orderno;

    private String userid;

    private String recname;

    private String recaddr;

    private String recphone;

    private String postage;

    private Double price;

    private Date createtime;

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno == null ? null : orderno.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getRecname() {
        return recname;
    }

    public void setRecname(String recname) {
        this.recname = recname == null ? null : recname.trim();
    }

    public String getRecaddr() {
        return recaddr;
    }

    public void setRecaddr(String recaddr) {
        this.recaddr = recaddr == null ? null : recaddr.trim();
    }

    public String getRecphone() {
        return recphone;
    }

    public void setRecphone(String recphone) {
        this.recphone = recphone == null ? null : recphone.trim();
    }

    public String getPostage() {
        return postage;
    }

    public void setPostage(String postage) {
        this.postage = postage == null ? null : postage.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}
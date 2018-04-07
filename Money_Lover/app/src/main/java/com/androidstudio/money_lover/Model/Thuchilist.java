package com.androidstudio.money_lover.Model;

/**
 * Created by VS9 X64Bit on 06/04/2018.
 */

public class Thuchilist {
    private int id;
    private String noidung;
    private String sotien;
    private Boolean hinhthuc;

    public Thuchilist()
    {

    }
    public Thuchilist(String noidung, String sotien, Boolean hinhthuc) {
        this.id = id;
        this.noidung = noidung;
        this.sotien = sotien;
        this.hinhthuc = hinhthuc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNoidung() {
        return noidung;
    }

    public void setNoidung(String noidung) {this.noidung = noidung;}

    public String getSotien() {
        return sotien;
    }

    public void setSotien(String sotien) {this.sotien = sotien;}

    public Boolean getHinhthuc() {return hinhthuc;}

    public void setHinhthuc(Boolean hinhthuc) {
        this.hinhthuc = hinhthuc;
    }


    @Override
    public String toString() {
        return "Nội dung:" +getNoidung() + " \n" +"Số tiền: "+getSotien() +"\n" + "Hình thức: "+getHinhthuc() +"\n";
    }
}

package DTO;

import org.omg.PortableInterceptor.INACTIVE;

public class ItemClass {
    private int id;
    private String name;
    private String att;
    private int dam;
    private String hyo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAtt() {
        return att;
    }

    public void setAtt(String att) {
        this.att = att;
    }

    public int getDam() {
        return dam;
    }

    public void setDam(int dam) {
        this.dam = dam;
    }

    public String getHyo() {
        return hyo;
    }

    public void setHyo(String hyo) {
        this.hyo = hyo;
    }
}

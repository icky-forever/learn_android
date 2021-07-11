package com.gyt.helloworld;

public class Plants {

    public Plants(String name, String introduce, int src){
        this.name = name;
        this.introduce = introduce;
        this.src = src;
    }

    public int getSrc() {
        return src;
    }

    public void setSrc(int src) {
        this.src = src;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String introduce;
    private String name;
    private int src;
}

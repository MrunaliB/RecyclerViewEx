package com.example.lenovo.recyclerviewex;

public class Member {

    String name;
    String discription;
    int imgId;

    Member(String name, String discription, int imgId) {
        this.name = name;
        this.discription = discription;
        this.imgId = imgId;
    }


    public String getName() {
        return name;
    }

    public String getDiscription() {
        return discription;
    }

    public int getImgID() {
        return imgId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public void setimgId(int imgId) {
        this.imgId = imgId;
    }
}


package com.example.and10_fragmentadapter.listv;

public class ListDTO {
    //R:res폴더
    //R내부 : res내부에 이쓴 모든 자원이 int형으로 관리가 된다
    private  int imgRes,age;
    private  String name,gender;
    public ListDTO(int imaRes, int age, String name, String gender) {
        this.imgRes = imaRes;
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public int getImgRes() {
        return imgRes;
    }

    public void setImgRes(int imgRes) {
        this.imgRes = imgRes;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }





    }




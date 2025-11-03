package com.example.vominhhoang_androidrecyclerview;

public class MyModel {
    private String name;
    private String age; // lưu tuổi dưới dạng chuỗi để dễ hiển thị

    public MyModel(String name, String age) {
        this.name = name;
        this.age = age;
    }

    // getters & setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}

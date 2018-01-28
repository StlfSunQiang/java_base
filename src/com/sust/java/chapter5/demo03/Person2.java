package com.sust.java.chapter5.demo03;

public class Person2 {
    private String name;
    private int age;
    private String id_card;

    public Person2(){
        super();
    }
    public Person2(String name,int age,String id_card){
        super();
        this.name = name;
        this.age = age;
        this.id_card = id_card;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId_card() {
        return id_card;
    }

    public void setId_card(String id_card) {
        this.id_card = id_card;
    }

    @Override
    public boolean equals(Object obj) {
        //判断比较的两个对象是同一对象，返回true
        if(this == obj){
            return true;
        }
        //当obj是Person2（自身类型）对象
        if (obj != null && obj.getClass() == Person2.class){
            Person2 p = (Person2) obj;
            //自定义相等标准----id_card相同
            if (this.getId_card().equals(p.getId_card())){
                return true;
            }
        }
        return false;
    }
}

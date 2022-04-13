package com.example.api.model;

import javax.persistence.*;


@Entity
@Table(name = "sample")
public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sid;

    private String sname;

    private int salary;

    public user(){
        super();
    }
    public user(int sid, String sname, int salary){
        super();
        this.sid = sid;
        this.sname = sname;
        this.salary = salary;
    }

    public int getId() {
        return sid;
    }

    public void setId(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getSalary(int salary) {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


}

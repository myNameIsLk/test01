package com.bjpowernode.entity;

public class School {
    private Integer sch_id;
    private Integer sch_name;
    private Integer sch_addr;
    private String lk;

    public Integer getSch_id() {
        return sch_id;
    }

    public void setSch_id(Integer sch_id) {
        this.sch_id = sch_id;
    }

    public Integer getSch_name() {
        return sch_name;
    }

    public void setSch_name(Integer sch_name) {
        this.sch_name = sch_name;
    }

    public Integer getSch_addr() {
        return sch_addr;
    }

    public void setSch_addr(Integer sch_addr) {
        this.sch_addr = sch_addr;
    }

    @Override
    public String toString() {
        return "School{" +
                "sch_id=" + sch_id +
                ", sch_name=" + sch_name +
                ", sch_addr=" + sch_addr +
                '}';
    }
}

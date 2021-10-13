package com.kgc.pojo;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.sun.org.apache.xerces.internal.util.EntityResolverWrapper;

import java.util.ArrayList;
import java.util.List;

public class Dept {
    private  Integer id;
    private  String deptname;
    private  List<Person> list=new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }
}

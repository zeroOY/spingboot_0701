package com.kgc.mapper;

import com.kgc.pojo.Dept;
import com.kgc.pojo.Person;

import java.util.List;

public interface DeptMapper {

    List<Person> getAllperson();

    List<Person>  getAllperson2();
    int add(Dept dept);
    int update(Dept dept);
    int delete(int id);
    List<Dept>getAll();

    Dept  getDeptByid();
}

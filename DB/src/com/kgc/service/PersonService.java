package com.kgc.service;

import com.kgc.mapper.DeptMapper;
import com.kgc.pojo.Dept;
import com.kgc.pojo.Person;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class PersonService {
    public List<Person> getAll(){
        List<Person>list = new ArrayList<>();
        SqlSession sqlSession=null;
        try {
            InputStream is = Resources.getResourceAsStream("myBaits_config.xml");
            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(is);
            sqlSession=build.openSession();
            DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
            list=mapper.getAllperson2();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }

        return  list;
    }
}

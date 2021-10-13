package com.kgc.service;


import com.kgc.mapper.DeptMapper;
import com.kgc.pojo.Dept;
import net.sf.cglib.beans.BulkBean;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class DeptService {
    public List<Dept>getAll(){
        List<Dept>list = new ArrayList<>();
        SqlSession sqlSession=null;
        try {
            InputStream is = Resources.getResourceAsStream("myBaits_config.xml");
            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(is);
            sqlSession=build.openSession();
            DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
            list=mapper.getAll();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }

        return  list;
    }

    public  int delete(int id){
        int retuli=0;
        SqlSession sqlSession=null;
        try {
            InputStream is = Resources.getResourceAsStream("myBaits_config.xml");
            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(is);
            sqlSession = build.openSession();
            DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
            retuli =mapper.delete(id);
            sqlSession.commit();

        } catch (IOException e) {
            e.printStackTrace();
            sqlSession.rollback();
        } finally {
            sqlSession.close();
        }

        return  retuli;
    }

    public int update(Dept dept){
        int retuli=0;
        SqlSession sqlSession=null;
        try {
            InputStream is = Resources.getResourceAsStream("myBaits_config.xml");
            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(is);
            sqlSession = build.openSession();
            DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
            retuli =mapper.update(dept);
            sqlSession.commit();

        } catch (IOException e) {
            e.printStackTrace();
            sqlSession.rollback();
        } finally {
            sqlSession.close();
        }

        return  retuli;
    }

    public  int insert(Dept dept){
        int retuli=0;
        SqlSession sqlSession=null;
        try {
            InputStream is = Resources.getResourceAsStream("myBaits_config.xml");
            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(is);
            sqlSession = build.openSession();
            DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
            retuli =mapper.add(dept);
            sqlSession.commit();

        } catch (IOException e) {
            e.printStackTrace();
            sqlSession.rollback();
        } finally {
            sqlSession.close();
        }

        return  retuli;
    }

}

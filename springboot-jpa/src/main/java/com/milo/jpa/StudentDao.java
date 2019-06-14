package com.milo.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author: Milogenius
 * @create: 2019-06-14 11:46
 * @description:
 **/
//泛型中第一个参数是实体类，第二个是id类型
public interface StudentDao extends JpaRepository<Student,Long> {
    //根据学生姓名查询数据
    public List<Student> findByName(String name);

}

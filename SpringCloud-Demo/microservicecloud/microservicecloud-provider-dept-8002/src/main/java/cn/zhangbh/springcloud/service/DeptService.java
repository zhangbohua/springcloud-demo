package cn.zhangbh.springcloud.service;

import cn.zhangbh.springcloud.entities.Dept;

import java.util.List;

public interface DeptService {
    public boolean addDept(Dept dept);

    public Dept get(Long id);

    public List<Dept> list();
}

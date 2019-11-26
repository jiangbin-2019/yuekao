package com.jiangbin.yuekaoproviderapp.service;

import com.jiangbin.yuekaoproviderapp.pojo.Transport;
import com.jiangbin.yuekaoproviderapp.pojo.TransportQuery;
import org.springframework.data.domain.Page;

import java.util.List;

public interface TransportService {

    /*public Page<Transport> findSearch(TransportQuery transportQuery);*/
    //保存和更新
    public boolean saveOrUpdate(Transport transport);

    /**
     * 查询列表
     * @return
     */
    public List<Transport> findAll();

    /**
     * 批量删除
     * @param ids
     * @return
     */
    boolean dels(String[] ids);

    /**
     * 单个删除
     * @param id
     * @return
     */
    boolean del(String id);

    /**
     * 根据id进行查询
     * @param id
     * @return
     */
    Transport findById(String id);
}

package com.jiangbin.yuekaoproviderapp.controller;

import com.jiangbin.yuekaoproviderapp.pojo.PageResult;
import com.jiangbin.yuekaoproviderapp.pojo.Transport;
import com.jiangbin.yuekaoproviderapp.pojo.TransportQuery;
import com.jiangbin.yuekaoproviderapp.service.TransportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/provider")
@CrossOrigin
public class TransportController {

    @Autowired
    private TransportService transportService;

/*    @RequestMapping("/lists")
    public PageResult<Transport> findSearch( TransportQuery transportQuery){
        Page<Transport> pageable = transportService.findSearch(transportQuery);
        return new PageResult<Transport>(pageable.getContent(),pageable.getTotalElements(),transportQuery.getPageNum(),transportQuery.getPageSize());
    }*/

    /**
     * 查询列表
     * @return
     */
    @RequestMapping("/list")
    public List<Transport> findAll(){
        List<Transport> transportList = transportService.findAll();
        return transportList;
    }

    /**
     * 批量删除
     * @param ids
     * @return
     */
    @RequestMapping("/dels")
    public boolean dels(String[] ids){
        return transportService.dels(ids);
    }

    /**
     * 单个删除
     * @param id
     * @return
     */
    @RequestMapping("/deleteById")
    public boolean del(String id){
        return transportService.del(id);
    }

    /**
     * 保存
     * @param transport
     * @return
     */
    @RequestMapping("/save")
    public boolean save(@RequestBody Transport transport){
        return transportService.saveOrUpdate(transport);
    }

    /**
     * 根据id进行查询
     * @param id
     * @return
     */
    @RequestMapping("/findById")
    public Object findById(String id){
        Map<String,Object> result=new HashMap<>();
        Transport transport= transportService.findById(id);
        return result.put("transport",transport);
    }
}

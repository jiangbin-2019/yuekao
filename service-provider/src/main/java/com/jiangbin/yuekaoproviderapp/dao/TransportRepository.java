package com.jiangbin.yuekaoproviderapp.dao;

import com.jiangbin.yuekaoproviderapp.pojo.Transport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TransportRepository extends JpaRepository<Transport,String>, JpaSpecificationExecutor<Transport> {
}

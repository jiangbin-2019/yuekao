package com.jiangbin.yuekaoproviderapp.service;

import com.jiangbin.yuekaoproviderapp.dao.TransportRepository;
import com.jiangbin.yuekaoproviderapp.pojo.IdWorker;
import com.jiangbin.yuekaoproviderapp.pojo.Transport;
import com.jiangbin.yuekaoproviderapp.pojo.TransportQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class TransportServiceImpl implements TransportService{

    @Autowired
    private TransportRepository transportRepository;

    @Autowired
    private IdWorker idWorker;
/*    @Nullable
    @Override
    public Page<Transport> findSearch(TransportQuery transportQuery) {
        Pageable pageable= PageRequest.of(transportQuery.getPageNum()-1,transportQuery.getPageSize());
        Specification<Transport> spec=new Specification<Transport>() {
            @Override
            public Predicate toPredicate(Root<Transport> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder cb) {
                List<Predicate> predicateList=new ArrayList<>();
                if(transportQuery.getPeopleName()!=null){
                    Predicate p1 = cb.like(root.get("peopleName"), "%" + transportQuery.getPeopleName() + "%");
                    predicateList.add(p1);
                }
                if(transportQuery.getTransportId()!=null){
                    Predicate p2 = cb.like(root.get("transportId"), "%" + transportQuery.getTransportId() + "%");
                    predicateList.add(p2);
                }
                if(transportQuery.getPeoplePhone()!=null){
                    Predicate p3 = cb.like(root.get("peoplePhone"), "%" + transportQuery.getPeoplePhone() + "%");
                    predicateList.add(p3);
                }
                if(transportQuery.getPeopleDate()!=null){
                    if(transportQuery.getPeoplestartDate()!=null){
                        Predicate p4 = cb.greaterThanOrEqualTo(root.get("peoplestartDate"), transportQuery.getPeoplestartDate());
                        predicateList.add(p4);
                    }
                    if(transportQuery.getPeopleendDate()!=null){
                        Predicate p5 = cb.lessThanOrEqualTo(root.get("peopleendDate"), transportQuery.getPeopleendDate());
                        predicateList.add(p5);
                    }
                }
                if(transportQuery.getTransportDate()!=null){
                    if(transportQuery.getTransportstartDate()!=null){
                        Predicate p6 = cb.greaterThanOrEqualTo(root.get("transportstartDate"), transportQuery.getTransportstartDate());
                        predicateList.add(p6);
                    }
                    if(transportQuery.getTransportendDate()!=null){
                        Predicate p7 = cb.lessThanOrEqualTo(root.get("transportendDate"), transportQuery.getTransportendDate());
                        predicateList.add(p7);
                    }
                }
                Predicate[] predicates = predicateList.toArray(new Predicate[predicateList.size()]);
                System.out.println("@@@@@@@@@@@@@@@@@@@@@@@"+predicates);
          return cb.and(predicates);
            }
        };
        return transportRepository.findAll(spec,pageable);
    }*/

    @Override
    public boolean saveOrUpdate(Transport transport) {
        if(transport.getTransportId()==null){
            transport.setTransportId(idWorker.nextId()+"");
            transportRepository.save(transport);
            return true;
        }else{
            transportRepository.save(transport);
            return false;
        }
    }

    @Override
    public List<Transport> findAll( ) {

        return transportRepository.findAll();
    }

    @Override
    public boolean dels(String[] ids) {

        try {
            for(String id:ids){
                transportRepository.deleteById(id);
            }
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean del(String id) {
        try {
            transportRepository.deleteById(id);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return  false;
        }

    }

    @Override
    public Transport findById(String id) {
        return transportRepository.findById(id).get();
    }
}

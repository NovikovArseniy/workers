package org.task.workers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.task.workers.model.HomeAddress;

public interface HomeAddressRepository extends JpaRepository<HomeAddress, Integer> {

    @Query(value = "select * from home_address where worker_id = ?1", nativeQuery = true)
    HomeAddress getHomeAddressByWorkerId(int workerId);
}

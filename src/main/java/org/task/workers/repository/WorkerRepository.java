package org.task.workers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.task.workers.model.Worker;

import java.util.List;

public interface WorkerRepository extends JpaRepository<Worker, Integer> {

    @Query(value = "select * from worker order by last_name, first_name, second_name", nativeQuery = true)
    List<Worker> getAllWorkers();

    @Query(value = "select * from worker where id = ?1", nativeQuery = true)
    Worker getWorkerById(int id);
}

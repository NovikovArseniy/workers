package org.task.workers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.task.workers.model.WorkSchedule;

public interface WorkScheduleRepository extends JpaRepository<WorkSchedule, Integer> {

    @Query(value = "select * from work_schedule where worker_id = ?1", nativeQuery = true)
    WorkSchedule getWorkScheduleByWorkerId(int workerId);
}

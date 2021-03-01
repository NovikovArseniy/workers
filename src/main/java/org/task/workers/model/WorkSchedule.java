package org.task.workers.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import java.io.Serializable;
import java.util.Objects;

@Entity
public class WorkSchedule implements Serializable {

    @Id
    private int workerId;

    private String beginTime;

    private String endTime;

    public WorkSchedule() { }

    public WorkSchedule(int workerId, String beginTime, String endTime) {
        this.workerId = workerId;
        this.beginTime = beginTime;
        this.endTime = endTime;
    }

    public int getWorkerId() {
        return workerId;
    }

    public void setWorkerId(int workerId) {
        this.workerId = workerId;
    }

    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;

        if (!(o instanceof WorkSchedule))
            return false;
        WorkSchedule that = (WorkSchedule) o;

        return getWorkerId() == that.getWorkerId() &&
                Objects.equals(getBeginTime(), that.getBeginTime()) &&
                Objects.equals(getEndTime(), that.getEndTime());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWorkerId(), getBeginTime(), getEndTime());
    }

    @Override
    public String toString() {
        return "WorkSchedule{" +
                "workerId=" + workerId +
                ", beginTime='" + beginTime + '\'' +
                ", endTime='" + endTime + '\'' +
                '}';
    }
}
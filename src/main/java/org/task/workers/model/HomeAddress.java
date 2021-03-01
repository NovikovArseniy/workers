package org.task.workers.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import java.io.Serializable;
import java.util.Objects;

@Entity
public class HomeAddress implements Serializable {

    @Id
    private int workerId;

    private String address;

    private String district;

    private String county;

    public HomeAddress(){};

    public HomeAddress(int workerId, String address, String district, String county) {
        this.workerId = workerId;
        this.address = address;
        this.district = district;
        this.county = county;
    }

    public int getWorkerId() {
        return workerId;
    }

    public void setWorkerId(int workerId) {
        this.workerId = workerId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;
        HomeAddress that = (HomeAddress) o;

        return workerId == that.workerId &&
                address.equals(that.address) &&
                district.equals(that.district) &&
                county.equals(that.county);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workerId, address, district, county);
    }

    @Override
    public String toString() {
        return "HomeAddress{" +
                "workerId=" + workerId +
                ", address='" + address + '\'' +
                ", district='" + district + '\'' +
                ", county='" + county + '\'' +
                '}';
    }
}
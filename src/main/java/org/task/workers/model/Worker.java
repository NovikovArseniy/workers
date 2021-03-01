package org.task.workers.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.io.Serializable;
import java.util.Objects;

@Entity
public class Worker implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    private String lastName;

    private String firstName;

    private String secondName;

    private int age;

    // For Java Bean convention
    public Worker() { }

    public Worker(int id, String lastName, String firstName, String secondName, int age) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;

        if (!(o instanceof Worker))
            return false;
        Worker worker = (Worker) o;

        return getId() == worker.getId() &&
                getAge() == worker.getAge() &&
                Objects.equals(getLastName(), worker.getLastName()) &&
                Objects.equals(getFirstName(), worker.getFirstName()) &&
                Objects.equals(getSecondName(), worker.getSecondName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getLastName(), getFirstName(), getSecondName(), getAge());
    }

    @Override
    public String toString() {
        return "Worker{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                '}';
    }
}

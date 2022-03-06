/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PcBuilder.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//JPA entity class used to map application data to sql data

@Entity
@Table(name = "pcs")
public class Pc implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "total_power", nullable = false)
    private Integer totalPower = 0;

    @Column(name = "motherboard", nullable = false)
    private String motherboard;

    @Column(name = "cpu", nullable = false)
    private String cpu;

    @Column(name = "ram", nullable = false)
    private String ram;

    @Column(name = "storage", nullable = false)
    private String storage;

    public Pc(int totalPower, String motherboard, String cpu, String ram, String storage) {
        this.totalPower = totalPower;
        this.motherboard = motherboard;
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getTotalPower() {
        return totalPower;
    }

    public void setTotalPower(int totalPower) {
        this.totalPower = totalPower;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

}

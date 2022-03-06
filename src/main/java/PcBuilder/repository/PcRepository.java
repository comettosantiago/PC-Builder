/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PcBuilder.repository;

import PcBuilder.model.Pc;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PcRepository extends JpaRepository<Pc, Integer> {
    //JpaRepository methods are transactional so it's not needed to add the annotation
    //to implement its methods
}

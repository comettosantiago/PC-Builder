/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package PcBuilder.service;

import PcBuilder.model.Pc;

import java.util.List;

public interface PcService {
    Pc savePc(Pc pc);

    Pc getPcById(int id);

    void deletePc(int id);

    List<Pc> getAllPc();

    Pc updatePc(Pc pc, int id);
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package PcBuilder.service;

import PcBuilder.model.Pc;

public interface PcService {

    Pc savePc(Pc pc);

    Pc getPc(Pc pc);
}

/*  
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import model.Pc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.PcRepository;
import service.PcService;

@Service
public class PcServiceImpl implements PcService {

    private PcRepository pcRepository;

    @Autowired // not really needed - we have just one constructor in this class
    public PcServiceImpl(PcRepository pcRepository) {
        this.pcRepository = pcRepository;
    }

    @Override
    public Pc savePc(Pc pc) {
        return pcRepository.save(pc);
    }

}

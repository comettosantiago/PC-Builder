/*  
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PcBuilder.service.impl;

import PcBuilder.model.Pc;
import org.springframework.stereotype.Service;
import PcBuilder.repository.PcRepository;
import PcBuilder.service.PcService;

@Service
public class PcServiceImpl implements PcService {

    private PcRepository pcRepository;

    // @Autowire not really needed - we have just one constructor in this class
    public PcServiceImpl(PcRepository pcRepository) {
        this.pcRepository = pcRepository;
    }

    @Override
    public Pc savePc(Pc pc) {
        return pcRepository.save(pc);
    }

    @Override
    public Pc getPc(Pc pc) {
        return pcRepository.getById(pc.getId());
    }

}

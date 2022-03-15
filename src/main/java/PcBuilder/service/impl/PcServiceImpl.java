/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PcBuilder.service.impl;

import PcBuilder.model.Pc;
import org.springframework.stereotype.Service;
import PcBuilder.repository.PcRepository;
import PcBuilder.service.PcService;

import java.util.List;
import java.util.Optional;

@Service
public class PcServiceImpl implements PcService {

    private PcRepository pcRepository;

    // @Autowire not really needed - we have just one constructor in this class
    public PcServiceImpl(PcRepository pcRepository) {
        super();
        this.pcRepository = pcRepository;
    }

    @Override
    public Pc savePc(Pc pc) {
        return pcRepository.save(pc);
    }

    @Override
    public Pc getPcById(int id) {
        return pcRepository.findById(id).orElseThrow();
    }

    @Override
    public void deletePc(int id) {
        pcRepository.deleteById(id);
    }

    @Override
    public List<Pc> getAllPc() {
        return pcRepository.findAll();
    }

    @Override
    public Pc updatePc(Pc pc, int id) {
        Pc existingPc = pcRepository.findById(id).orElseThrow();

        existingPc.setTotalPower(pc.getTotalPower());
        existingPc.setMotherboard(pc.getMotherboard());
        existingPc.setCpu(pc.getCpu());
        existingPc.setRam(pc.getRam());
        existingPc.setStorage(pc.getStorage());

        pcRepository.save(existingPc);

        return existingPc;
    }
}

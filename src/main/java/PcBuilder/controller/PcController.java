/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PcBuilder.controller;

import PcBuilder.model.Pc;
import PcBuilder.service.impl.PcServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import PcBuilder.service.PcService;

import java.util.List;

//controllers stores GET POST PUT DELETE petitions  
@RestController //replaces @Controller + @ResponseBody
@RequestMapping("/")
public class PcController {

    private PcServiceImpl pcService;

    public PcController(PcService pcService) {
        super();
        this.pcService = (PcServiceImpl) pcService;
    }

    //REST API
    @PostMapping("/new")
    public ResponseEntity<Pc> savePc(@RequestBody Pc pc) { //I use ResponseEntity class because provides complete response details
        System.out.println("post request: new pc");
        return new ResponseEntity<>(pcService.savePc(pc), HttpStatus.CREATED);
    }

    @GetMapping("/pc/{id}")
    public ResponseEntity<Pc> getPc(@PathVariable("id") int pcId) {
        return new ResponseEntity<Pc>(pcService.getPcById(pcId), HttpStatus.OK);
    }

    @DeleteMapping("/pc/delete={id}")
    public ResponseEntity<String> deletecPc(@PathVariable("id") int pcId) {
        pcService.deletePc(pcId);
        return new ResponseEntity<String>("Pc deleted", HttpStatus.OK);
    }

    @GetMapping("/pc/all")
    public ResponseEntity<List> getAllPc(){
        return new ResponseEntity<List>(pcService.getAllPc(), HttpStatus.OK);
    }

    @PatchMapping("/pc/update={id}")
    public ResponseEntity<Pc> updatePc(@PathVariable("id") int pcId, @RequestBody Pc pc) {
        return new ResponseEntity<Pc>(pcService.updatePc(pc, pcId), HttpStatus.OK);
    }

}

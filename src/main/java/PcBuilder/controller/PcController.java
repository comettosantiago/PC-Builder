/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PcBuilder.controller;

import PcBuilder.model.Pc;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import PcBuilder.service.PcService;

//controllers stores GET POST PUT DELETE petitions  
@RestController //replaces @Controller + @ResponseBody
@RequestMapping("/")
public class PcController {

    private PcService pcService;

    public PcController(PcService pcService) {
        super();
        this.pcService = pcService;
    }

    //REST API
    @PostMapping("/new")
    public ResponseEntity<Pc> savePc(@RequestBody Pc pc) { //I use ResponseEntity class because provides complete response details
        System.out.println("post request: new pc");
        return new ResponseEntity<Pc>(pcService.savePc(pc), HttpStatus.CREATED);
    }

    @GetMapping("/get={id}")
    public ResponseEntity<Pc> getPc(Pc pc) {
        return new ResponseEntity<Pc>(pcService.getPc(pc), HttpStatus.FOUND);
    }

}

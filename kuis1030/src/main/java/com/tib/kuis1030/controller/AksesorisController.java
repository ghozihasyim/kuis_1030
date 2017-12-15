package com.tib.kuis1030.controller;

import com.tib.kuis1030.entity.Aksesoris;
import com.tib.kuis1030.service.AksesorisService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/aksesoris")
public class AksesorisController {
    @Autowired
    private AksesorisService aksesorisService;
/**    
    @RequestMapping(method = RequestMethod.POST)
    public Aksesoris insertOrUpdate(@RequestBody Aksesoris product){
        return aksesorisService.insertOrUpdate(product);
    }
    @RequestMapping(method = RequestMethod.GET)
    public List<Aksesoris> findAll(){
        return aksesorisService.findAll();
    }**/
}

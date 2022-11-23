package com.farmacia.http.v1;

import com.farmacia.entity.Farmacia;
import com.farmacia.service.FarmaciaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping(path = "/api/v1/farmacia")
@CrossOrigin
public class FarmaciaController {
    @Autowired
    private FarmaciaService service;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void salvar(@RequestBody Farmacia cliente) {
        service.salvar(cliente);
    }


    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Farmacia> finAll() {
        return service.findAll();
    }


    @GetMapping("/por-id/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Farmacia findById(@RequestParam("id") Long id) {
        return service.findById(id);
    }


    @DeleteMapping
    @ResponseStatus(HttpStatus.OK)
    public void deleteById(Long id) {
        service.deleteById(id);
    }

    @PutMapping("/update-por-id/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void atualizar(@RequestParam("id") Long id, @RequestBody Farmacia cliente) {
        service.atualizar(id, cliente);
    }


}

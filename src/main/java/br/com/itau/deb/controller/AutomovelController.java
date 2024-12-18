package br.com.itau.deb.controller;

import br.com.itau.deb.entity.AutomovelEntity;
import br.com.itau.deb.service.AutomovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teste")
public class AutomovelController {

    @Autowired
    private AutomovelService service;

    @PostMapping
    public Boolean criarAutomovel(@RequestBody AutomovelEntity automovelEntity){
        return service.criar(automovelEntity);
    }

    @GetMapping
    public List<AutomovelEntity> listarTodos(){
        return service.listarTodos();
    }
}

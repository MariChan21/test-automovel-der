package br.com.itau.deb.service;

import br.com.itau.deb.entity.AutomovelEntity;
import br.com.itau.deb.repository.AutomovelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class AutomovelService {

    @Autowired
    private AutomovelRepository repository;

    public Boolean criar(AutomovelEntity entity){
        entity.setDateCadastro(LocalDate.now());
        AutomovelEntity entity1 = repository.saveAndFlush(entity);
        if(entity1 != null)
            return true;
        return false;
    }

    public List<AutomovelEntity> listarTodos() {
        return repository.findAll();
    }
}

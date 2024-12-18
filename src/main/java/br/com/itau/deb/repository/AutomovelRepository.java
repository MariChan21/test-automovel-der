package br.com.itau.deb.repository;

import br.com.itau.deb.entity.AutomovelEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutomovelRepository extends JpaRepository<AutomovelEntity,Long> {

}

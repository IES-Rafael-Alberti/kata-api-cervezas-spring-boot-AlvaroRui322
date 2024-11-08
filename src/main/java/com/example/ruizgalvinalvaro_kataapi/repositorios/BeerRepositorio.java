package com.example.ruizgalvinalvaro_kataapi.repositorios;

import com.example.ruizgalvinalvaro_kataapi.modelo.Beer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BeerRepositorio extends JpaRepository<Beer, Long> {
    List<Beer> findAllById(Long beerId);
}
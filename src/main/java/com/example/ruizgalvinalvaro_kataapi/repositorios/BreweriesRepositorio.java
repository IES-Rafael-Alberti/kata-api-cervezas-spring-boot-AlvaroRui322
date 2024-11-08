package com.example.ruizgalvinalvaro_kataapi.repositorios;

import com.example.ruizgalvinalvaro_kataapi.modelo.Breweries;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BreweriesRepositorio extends JpaRepository<Breweries, Long> {

}
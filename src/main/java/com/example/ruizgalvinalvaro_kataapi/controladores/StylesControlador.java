package com.example.ruizgalvinalvaro_kataapi.controladores;

import com.example.ruizgalvinalvaro_kataapi.modelo.Styles;
import com.example.ruizgalvinalvaro_kataapi.repositorios.StylesRepositorio;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api")
public class StylesControlador {

    private final StylesRepositorio stylesRepositorio;

    public StylesControlador(StylesRepositorio stylesRepositorio) {
        this.stylesRepositorio = stylesRepositorio;
    }

    @GetMapping("/styles")
    public List<Styles> getAllStyles() {
        return stylesRepositorio.findAll();
    }

    @GetMapping("/style/{id}")
    public Optional<Styles> getStyleById(@PathVariable Long id) {
        return stylesRepositorio.findById(id);
    }
}
package com.example.ruizgalvinalvaro_kataapi.controladores;

import com.example.ruizgalvinalvaro_kataapi.modelo.Categories;
import com.example.ruizgalvinalvaro_kataapi.repositorios.CategoriesRepositorio;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api")
public class CategoriesControlador {

    private final CategoriesRepositorio categoriesRepositorio;

    // Corregir la declaración del constructor
    public CategoriesControlador(CategoriesRepositorio categoriesRepositorio) {
        this.categoriesRepositorio = categoriesRepositorio;
    }

    // Método para obtener todas las categorías
    @GetMapping("/categories")
    public List<Categories> getAllCategories() {
        return categoriesRepositorio.findAll();
    }

    // Método para obtener una categoría por su ID
    @GetMapping("/categorie/{id}")
    public Optional<Categories> getCategoryById(@PathVariable Long id) {
        return categoriesRepositorio.findById(id);
    }
}

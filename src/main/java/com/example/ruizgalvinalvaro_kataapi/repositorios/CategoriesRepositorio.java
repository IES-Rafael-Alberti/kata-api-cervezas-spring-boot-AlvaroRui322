package com.example.ruizgalvinalvaro_kataapi.repositorios;

import com.example.ruizgalvinalvaro_kataapi.modelo.Categories;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriesRepositorio extends JpaRepository<Categories, Long> {
}

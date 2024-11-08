package com.example.ruizgalvinalvaro_kataapi.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Styles {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private Integer cat_id;
    private String style_name;
}

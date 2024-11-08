package com.example.ruizgalvinalvaro_kataapi.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
;

import java.util.Date;

@Data @AllArgsConstructor @NoArgsConstructor
@Entity
public class Beer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private Integer brewery_id;
    private Integer cat_id;
    private String name;
    private String descript;
    private Integer style_id;
    private Float abv;
    private Float ibu;
    private Float srm;
    private Integer upc;
    private String filepath;
    private Integer adduser;
    private Date datetime;

}
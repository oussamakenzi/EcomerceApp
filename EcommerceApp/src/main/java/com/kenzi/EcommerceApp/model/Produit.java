package com.kenzi.EcommerceApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Produit {
    @Id
    private Long id;
    private String nomProduit;
    private String adresse;
    private Double prixUnitaire;
    private Double prixVente;
    private String reference;
    private String designation;
    private String description;




}

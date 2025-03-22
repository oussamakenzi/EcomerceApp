package com.kenzi.EcommerceApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Entity
@Data
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
    private Date  dateExpiraton;




}

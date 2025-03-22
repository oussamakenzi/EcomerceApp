package com.kenzi.EcommerceApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Vente {
    @Id
    private Long id;
    private Date dateVente;
    private Integer quantiteVante;
    private Double prixVente;
    private Double prixAchat;




}

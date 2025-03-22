package com.kenzi.EcommerceApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class FactureVente extends Facture {
    @Id
    private Long id;




}

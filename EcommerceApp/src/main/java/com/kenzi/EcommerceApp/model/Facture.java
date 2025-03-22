package com.kenzi.EcommerceApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.Data;

import java.util.Date;
@Entity
@Data
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Facture {
    @Id
    private Long id;
    private String numeroDFacture;
    private Date dateFacture;
    private Double mantant_ht;
    private Double mantant_vt;
    private Double mantant_tva;





}

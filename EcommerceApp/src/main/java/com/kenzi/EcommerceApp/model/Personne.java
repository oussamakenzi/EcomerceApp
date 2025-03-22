package com.kenzi.EcommerceApp.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String nom;
    @NotNull
    private String prenom;
    private String adresse;
    @NotNull
    @Email
    @Column(unique = true)
    private String email;
    @Pattern(regexp = "^\\+?[0-9]{8,15}$", message = "Format de téléphone invalide")
    private String telephone;
    @Size(min = 8)
    @Column(length = 60)
    private String password;
    @Column(columnDefinition = "CHAR(1) CHECK (sexe IN ('F', 'M'))")
    private String sexe;




}

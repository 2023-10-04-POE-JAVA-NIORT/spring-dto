package com.example.demo.api.mapper;

import com.example.demo.api.dto.ProduitDTO;
import com.example.demo.api.dto.ProduitPostDTO;
import com.example.demo.dao.Produit;

public class ProduitMapper {


    public static ProduitDTO convertToDTO(Produit entity){
        ProduitDTO dto = new ProduitDTO();
        dto.setNom(entity.getNom());
        dto.setDescription(entity.getDescription());
        dto.setPrixHT(entity.getPrixHT());
        return dto;
    }

    public static Produit convertToEntity(ProduitDTO dto){
        Produit entity = new Produit();
        entity.setNom(dto.getNom());
        entity.setDescription(dto.getDescription());
        return entity;
    }

    public static Produit convertProduitPostDtoToEntity(ProduitPostDTO dto){
        Produit entity = new Produit();
        entity.setNom(dto.getNom());
        entity.setDescription(dto.getDescription());
        entity.setPrixHT(dto.getPrixHT());
        return entity;
    }
}

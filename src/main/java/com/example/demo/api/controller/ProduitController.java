package com.example.demo.api.controller;

import com.example.demo.api.dto.ProduitDTO;
import com.example.demo.api.dto.ProduitPostDTO;
import com.example.demo.api.mapper.ProduitMapper;
import com.example.demo.dao.Produit;
import com.example.demo.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProduitController {

    @Autowired
    ProduitService produitService;

    @GetMapping("produits")
    public List<ProduitDTO> getAll(){
        List<Produit> entities = produitService.getAll();
        List<ProduitDTO> dtos = new ArrayList<>();
        for(Produit p : entities)
            dtos.add(ProduitMapper.convertToDTO(p));
        return dtos;
    }

    @PostMapping("produits")
    public void add(@RequestBody ProduitPostDTO dto){
        produitService.addProduit(ProduitMapper.convertProduitPostDtoToEntity(dto));

    }

}

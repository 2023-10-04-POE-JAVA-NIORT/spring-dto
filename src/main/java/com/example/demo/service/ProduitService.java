package com.example.demo.service;

import com.example.demo.dao.Produit;
import com.example.demo.dao.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitService {

    @Autowired
    ProduitRepository produitRepository;

    public void addProduit(Produit produit){
        produitRepository.save(produit);
    }

    public List<Produit> getAll(){
        return produitRepository.findAll();
    }
}

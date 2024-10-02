/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upeu.edu.pe.ecomerce_v1.infrastructure.adapter;

import org.springframework.stereotype.Repository;
import upeu.edu.pe.ecomerce_v1.app.repository.CategoriesRepository;
import upeu.edu.pe.ecomerce_v1.infrastructure.entity.CategoryEntity;


/**
 *
 * @author Support HP
 */
@Repository
public class CategoriesRepositoryImpl implements CategoriesRepository{
 private final CategoriesCrudRepository categoriesCrudRepository;
 
    public CategoriesRepositoryImpl(CategoriesCrudRepository categoriesCrudRepository) {
        this.categoriesCrudRepository = categoriesCrudRepository;
    }

    @Override
    public Iterable<CategoryEntity> getCategories() {
    return categoriesCrudRepository.findAll();
    }
}
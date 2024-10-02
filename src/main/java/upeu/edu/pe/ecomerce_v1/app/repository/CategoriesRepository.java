/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package upeu.edu.pe.ecomerce_v1.app.repository;

import upeu.edu.pe.ecomerce_v1.infrastructure.entity.CategoryEntity;



/**
 *
 * @author Support HP
 */
public interface CategoriesRepository {
          
  Iterable<CategoryEntity> getCategories();

}



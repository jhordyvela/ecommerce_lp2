/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upeu.edu.pe.ecomerce_v1.infrastructure.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import upeu.edu.pe.ecomerce_v1.app.repository.CategoriesRepository;
import upeu.edu.pe.ecomerce_v1.app.repository.ProductRepository;
import upeu.edu.pe.ecomerce_v1.app.repository.UserRepository;
import upeu.edu.pe.ecomerce_v1.app.service.CategoriesServices;
import upeu.edu.pe.ecomerce_v1.app.service.ProductService;
import upeu.edu.pe.ecomerce_v1.app.service.UploadFile;
import upeu.edu.pe.ecomerce_v1.app.service.UserService;

/**
 *
 * @author tpp
 */
@Configuration
public class BeanConfiguration {
    @Bean
    public UserService userService(UserRepository userRepository){
        return new UserService(userRepository);
    }
    @Bean
    public ProductService productService(UploadFile uploadFile,ProductRepository productRepository){
        return new ProductService(uploadFile,productRepository);
    }
    
    @Bean
    public CategoriesServices categoriesServices (CategoriesRepository categoriesRepository){
        return  new CategoriesServices(categoriesRepository);
    }
     @Bean
      public UploadFile uploadFile(){
        return new UploadFile();
    }
}

package com.likelion.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.likelion.ecommerce.entities.Product;
import com.likelion.ecommerce.entities.ProductImage;

@Repository
public interface ProductImagesRepo extends JpaRepository<ProductImage, Integer> {

}
package com.projeto.myfirstproject.entities;

import java.io.Serializable;
import java.util.Objects;

public class Product  implements Serializable {
    private static  final long serialVersion = 1L;

    private Long Id;
    private String name;
    private Double price;

   private Category category;

   public Product(){

   }

    public Product(Long id, String name, Double price, Category category) {
        Id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Id.equals(product.Id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id);
    }
}

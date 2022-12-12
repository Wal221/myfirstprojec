package com.projeto.myfirstproject;

import com.projeto.myfirstproject.entities.Category;
import com.projeto.myfirstproject.entities.Product;
import com.projeto.myfirstproject.repositories.CategoryRepository;
import com.projeto.myfirstproject.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class MyfirstprojectApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryRepository;

    @Autowired
	private ProductRepository productRepository;
	public static void main(String[] args) {
		SpringApplication.run(MyfirstprojectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//Criei 2 categorias e 4 produtos
		Category cat1 = new Category(1L,"Eletronics");
		Category cat2= new Category(2L, "Book");

		Product p1 = new Product(1L,"TV", 2200.00,cat1);
		Product p2= new Product(2L,"Domain Drive Desing",2800.00,cat2);
		Product p3 = new Product(3L,"PS5", 2900.00,cat1);
		Product p4 = new Product(1L,"Docker", 100.00,cat1);

        //E Associei cada produto tem uma referencia para sua categoria
		//E cada categoria tem uma lista com umas referencias para seus produtos
		cat1.getProducts().addAll(Arrays.asList(p1,p3));
		cat2.getProducts().addAll(Arrays.asList(p2,p4));




        categoryRepository.save(cat1);
		categoryRepository.save(cat2);


		productRepository.save(p1);
		productRepository.save(p2);
		productRepository.save(p3);
		productRepository.save(p4);
	}
}

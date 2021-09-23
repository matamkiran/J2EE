package com.example.postgresdemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "products")
public class Product {
	 @Id
	    @GeneratedValue(generator = "product_generator")
	    @SequenceGenerator(
	            name = "product_generator",
	            sequenceName = "product_sequence1",
	            initialValue = 1
	    )
	 private Integer id;

	    @NotBlank
	    @Size(min = 3, max = 100)
	    @Column(columnDefinition = "name")
	    private String name;

	    @Column(columnDefinition = "price")
	    private Integer price;

		
	    @Column(columnDefinition = "is_deleted")
	    private boolean delete;
	    
	    
	
		public boolean isDelete() {
			return delete;
		}
		public void setDelete(boolean delete) {
			this.delete = delete;
		}
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getPrice() {
			return price;
		}

		public void setPrice(Integer price) {
			this.price = price;
		}

		

}

package com.ecommerce;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  
	@Table(name= "eproduct")   
	public class EProduct {    
	  
	        @Id @GeneratedValue   
	        @Column(name = "ID")
	        private long ID;
	        
	        @Column(name = "name")
	        private String name;

			public long getID() {
				return ID;
			}

			public void setID(long iD) {
				ID = iD;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}
	}


package com.example.library.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="author")
public class Author {	
		
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO) 
		private Integer id;
		
		private  String name;
		
		private String sname;
		
		@ManyToMany(mappedBy = "author",fetch = FetchType.EAGER)
	    private List<Book> book;
		

		Author(){}
		
		public Integer getId () {
            return id;
		}
        public void setId (Integer id) {
        	this.id = id ;
        }
        public String getName () {
        	return name;
	    }
        public void setName(String name) {
        	this.name = name;
        }
        public String getSname() {
        	return sname;
        }
	    public void setSname (String sname) {
	    	this.sname = sname;
	    }

		@Override
		public String toString() {
			return "Author [id=" + id + ", name=" + name + ", sname=" + sname + "]";
		}
	    
	    

}

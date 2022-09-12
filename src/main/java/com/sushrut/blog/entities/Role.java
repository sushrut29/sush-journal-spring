package com.sushrut.blog.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
//@Getter
//@Setter
@Data
public class Role {
	
	@Id
	private int id;
	
	private String name;
	
	@ManyToMany(fetch = FetchType.EAGER, mappedBy="roles") 
	private List<User> users = new ArrayList<>();

}

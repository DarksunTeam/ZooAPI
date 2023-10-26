package com.darksun.model;

import com.darksun.model.type.Category;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee implements Serializable {
	@Serial
	private static final long serialVersionUID = -3072039166577639096L;
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private Long     id;
	private String   name;
	private Category category;
	private Manager  manager;

	@OneToMany( mappedBy = "employee", fetch = FetchType.EAGER )
	@JsonIgnoreProperties( "employee" )
	private List< Assignment > assignments;
}

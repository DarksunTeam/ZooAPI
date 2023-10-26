package com.darksun.model;

import com.darksun.model.type.Category;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Task implements Serializable {
	@Serial
	private static final long serialVersionUID = 8875369117491991213L;
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private Long     id;
	private String   name;
	private Integer  numberOfEmployees;
	private Integer  repetitions;
	private Category category;
}

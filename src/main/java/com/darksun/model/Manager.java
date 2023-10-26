package com.darksun.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import java.io.Serial;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Manager extends Employee {
	@Serial
	private static final long serialVersionUID = -417947767510103964L;
	
	private String password;
}

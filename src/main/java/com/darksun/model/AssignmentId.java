package com.darksun.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;
import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class AssignmentId implements Serializable {
	@Serial
	private static final long serialVersionUID = 3583702682795871970L;
	
	private Long employeeId;
	private Long taskId;
}

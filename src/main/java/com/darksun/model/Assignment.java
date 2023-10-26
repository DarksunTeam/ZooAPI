package com.darksun.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Assignment implements Serializable {
	@Serial
	private static final long serialVersionUID = 6006262532627183199L;
	
	@EmbeddedId
	private AssignmentId  id;
	private LocalDateTime startTime;
	private LocalDateTime endTime;

	@ManyToOne
	@JsonIgnoreProperties( "assignments" )
	@MapsId( "employeeId" )
	private Employee employee;

	@ManyToOne
	@MapsId( "taskId" )
	private Task task;
}

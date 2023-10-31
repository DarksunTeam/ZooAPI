package com.darksun.service;

import com.darksun.model.Task;
import com.darksun.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class TaskService {

	@Autowired
	TaskRepository repository;

	public Task create( Task task ) {
		if ( task.getId( ) == null ) {
			throw new IllegalArgumentException( "Task has no Id. Must be zero." );
		}
		if ( !task.getId( ).equals( 0L ) ) {
			throw new IllegalArgumentException( "This task is already registered." );
		}

		return repository.save( task );
	}

	public List< Task > readAll( ) {
		return repository.findAll( );
	}

	public Task readById( Long id ) {
		return repository.findById( id )
						 .orElseThrow( ( ) -> new EntityNotFoundException(
								 "Task not found with ID: " + id ) );
	}
}

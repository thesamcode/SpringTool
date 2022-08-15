package com.thesamecode.saveTravels.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.thesamecode.saveTravels.models.Expense;

	@Repository
	public interface ExpenseRepository extends CrudRepository <Expense, Long> {
	    // this method retrieves all the expenses from the database
	    List<Expense> findAll();
	    
	    List<Expense> findByNameIs(String name);
	    // this method finds expenses with descriptions containing the search string
	    List<Expense> findByDescriptionContaining(String search);
	    // this method counts how many names contain a certain string
	    Long countByNameContaining(String search);
	    // this method deletes an expense that starts with a specific name
	    Long deleteByNameStartingWith(String search);
	
	
}

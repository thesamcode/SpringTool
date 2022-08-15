package com.thesamecode.saveTravels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.thesamecode.saveTravels.models.Expense;
import com.thesamecode.saveTravels.repositories.ExpenseRepository;

@Service
public class ExpenseService {

	private final ExpenseRepository expenseRepository;
	
	public ExpenseService(ExpenseRepository expenseRepository) {
		this.expenseRepository = expenseRepository;
	}
	// returns all the expenses
    public List<Expense> allExpenses() {
        return expenseRepository.findAll();
    }
    
    // creates an expense
    public Expense createExpense(Expense e) {
        return expenseRepository.save(e);
    }
    // retrieves an expense
    public Expense findExpense(Long id) {
        Optional<Expense> optionalExpense = expenseRepository.findById(id);
        if(optionalExpense.isPresent()) {
            return optionalExpense.get();
        } else {
            return null;
        }
    }
    // updates an expense info
    public Expense updateExpense(Expense e) {
    	return expenseRepository.save(e);
    }
    // deletes an expense
    public void deleteExpense(Long id) {
		expenseRepository.deleteById(id);
	}
	
}

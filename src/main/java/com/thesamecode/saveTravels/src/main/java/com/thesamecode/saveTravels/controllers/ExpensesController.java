package com.thesamecode.saveTravels.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.thesamecode.saveTravels.models.Expense;
import com.thesamecode.saveTravels.services.ExpenseService;

@Controller
public class ExpensesController {
	
	@Autowired
	ExpenseService expenseService;
	
	@GetMapping("/")
	public String home(Model model) {
		return "redirect:/expenses";
	}
	
////	@GetMapping("/expenses/new")
////	public String newExpense(@ModelAttribute("expense") Expense expense) {
////		return "index.jsp";
////	}
	
	@GetMapping("/expenses")
	public String index(@ModelAttribute("expense") Expense expense, Model model) {
		List<Expense> expenses = expenseService.allExpenses();
		model.addAttribute("expenses", expenses);
		return "index.jsp";
	}
	
//	@GetMapping("/expenses")
//	public String index(Model model) {
//		
//		List<Expense> expenses = expenseService.allExpenses();
//		model.addAttribute("expenses", expenses);
//		
//		return "index.jsp";
//	}
	
	@PostMapping("/expenses")
	public String index(@Valid @ModelAttribute("expense") Expense expense, BindingResult result, Model model) {
		if(result.hasErrors()) {
			List<Expense> expenses = expenseService.allExpenses();
			model.addAttribute("expenses", expenses);
			return "index.jsp";
		}else {
			expenseService.createExpense(expense);
			return "redirect:/expenses";
		}
	}
	
	@RequestMapping("/expenses/{id}/edit")
    public String edit(@PathVariable("id") Long id, Model model) {
        Expense expense = expenseService.findExpense(id);
        model.addAttribute("expense", expense);
        return "/edit.jsp";
    }
	
//	@GetMapping("/expenses/edit")
//	public String edit(Model model) {
//		return "redirect:/expenses";
//	}
	
	@RequestMapping(value="/expenses/{id}", method=RequestMethod.PUT)
    public String update(@Valid @ModelAttribute("expense") Expense expense, BindingResult result) {
        if (result.hasErrors()) {
            return "/expenses/edit.jsp";
        } else {
        	expenseService.updateExpense(expense);
            return "redirect:/expenses";
        }
    }
	
	@RequestMapping(value="/expenses/{id}", method=RequestMethod.DELETE)
    public String destroy(@PathVariable("id") Long id) {
        expenseService.deleteExpense(id);
        return "redirect:/expenses";
    }
	
	@GetMapping("/expenses/{expenseId}")
	public String show(Model model, @PathVariable("expenseId") Long expenseId) {
		Expense expense = expenseService.findExpense(expenseId);
		model.addAttribute("expense", expense);
		return "/show.jsp";
	}
	
//	@PostMapping("/expenses")
//	public String create(
//			@Valid @ModelAttribute ("expense") Expense expense,
//			BindingResult result)
//	{
//		if (result.hasErrors()) {
//			return "index.jsp";
//		}
//		expenseService.createExpense(expense);
//		return "redirect:/expenses";
//	}
	
	

}

package com.Ani.expense.Tracker.Controller;

import com.Ani.expense.Tracker.Entity.Expense;
import com.Ani.expense.Tracker.Repository.ExpenseRepository;
import com.Ani.expense.Tracker.Sevice.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/expenses")
public class ExpenseController {
@Autowired
private ExpenseService expenseService;

// get all details
@GetMapping
    public List<Expense> getAllExpenses(){
    return  expenseService.getAllExpenses();
}
@GetMapping("/{id}")
public Optional<Expense> getExpenseById(@PathVariable Long id) {
    return expenseService.getExpenseById(id);
}
@PostMapping
    public  Expense addExpense(@RequestBody Expense expense){
    return  expenseService.saveExpense(expense);
}
@PutMapping("/{id}")
    public Expense updateExpense(@PathVariable Long id, @RequestBody Expense updatedExpense) {
        return expenseService.updateExpense(id, updatedExpense);
    }
    @DeleteMapping("/{id}")
    public void deleteExpense(@PathVariable Long id) {
        expenseService.deleteExpense(id);
    }




}

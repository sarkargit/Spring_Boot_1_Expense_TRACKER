package com.Ani.expense.Tracker.Sevice;

import com.Ani.expense.Tracker.Entity.Expense;
import com.Ani.expense.Tracker.Repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExpenseService {
    @Autowired
    private ExpenseRepository expenseRepository;

    public List<Expense> getAllExpenses(){
        return  expenseRepository.findAll();
    }
    public Optional<Expense> getExpenseById(Long id) {
        return Optional.of(expenseRepository.findById(id).get());
    }
    public  Expense saveExpense(Expense expense){
        return expenseRepository.save(expense);
    }
    public Expense updateExpense(Long id, Expense updatedExpense) {
        return expenseRepository.findById(id).map(expense -> {
            expense.setDescription(updatedExpense.getDescription());
            expense.setAmount(updatedExpense.getAmount());
            expense.setDate(updatedExpense.getDate());
            expense.setCategory(updatedExpense.getCategory());
            return expenseRepository.save(expense);
        }).orElseThrow(() -> new RuntimeException("Expense not found"));
    }
    public void deleteExpense(Long id) {
        expenseRepository.deleteById(id);
    }




}

package com.Ani.expense.Tracker.Repository;

import com.Ani.expense.Tracker.Entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface ExpenseRepository extends JpaRepository <Expense, Long> {

}

package com.Ani.expense.Tracker.Repository;

import com.Ani.expense.Tracker.Entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface CategoryRepository extends JpaRepository<Category, Long> {


}

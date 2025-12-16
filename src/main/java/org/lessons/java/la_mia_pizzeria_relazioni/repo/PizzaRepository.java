package org.lessons.java.la_mia_pizzeria_relazioni.repo;

import org.lessons.java.la_mia_pizzeria_relazioni.models.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaRepository extends JpaRepository<Pizza, Integer>{
    
}

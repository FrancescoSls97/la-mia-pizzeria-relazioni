package org.lessons.java.la_mia_pizzeria_relazioni.repo;

import org.lessons.java.la_mia_pizzeria_relazioni.models.Ingrediente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredienteRepository extends JpaRepository <Ingrediente, Integer> {

    
} 

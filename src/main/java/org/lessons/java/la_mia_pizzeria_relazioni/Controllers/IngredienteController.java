package org.lessons.java.la_mia_pizzeria_relazioni.Controllers;

import java.util.List;

import org.lessons.java.la_mia_pizzeria_relazioni.models.Ingrediente;
import org.lessons.java.la_mia_pizzeria_relazioni.repo.IngredienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/ingrediente")
public class IngredienteController {
    
    @Autowired
    private IngredienteRepository ingredienteRepository;

    //index
    @GetMapping
    public String index(Model model){
        List<Ingrediente> ingredienti = ingredienteRepository.findAll();
        model.addAttribute("ingredienti", ingredienti);
        return "ingrediente/index";
    }
}

package org.pizzeria.demo.controller;

import java.util.List;
import java.util.Optional;

import org.pizzeria.demo.model.Pizza;
import org.pizzeria.demo.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pizze")
public class Pizzacontroller {

    @Autowired //con Autowired richiediamo il controllo delle operazioni di implementazioni dell'interfaccia PizzaRepository.
    //Autowired segna il punto di iniezione perchè la classe Pizzacontroller ha una dipendenza verso PizzaRepository.
    //
    private PizzaRepository repository;

@GetMapping //Questo metodo risponde a richieste HTTP Get all'URL associato al controller
public String index (Model model) { //index è il nome della pagina che deve essere renderizzata. Model model è un contenitore che serve a passare dati dal controller alla pagina.
    List<Pizza> result = repository.findAll(); //usa PizzaRepository per recuperare tutte le pizze dal database. findAll è un metodo ereditato da JpaRepository
    model.addAttribute("list", result);
    return "/pizze/index";
}

@GetMapping ("/show/{id}") 
//Pathvariable consente di rimanere nell'url aggiungendo un ID
//Come scegliere se usare il PathVariable o il query param? il query param consente di inserire nell'url un ? seguito dal parametro
//La differenza è di concetto. Se il filtro identifica solo una risorsa occorre il path, se invece il filtro restituisce più risorse è meglio usare il query param
public String show(@PathVariable("id") Integer id, Model model){
    Optional <Pizza> optionalPizza = repository.findById(id);  
    // model.addAttribute("pizza", optionalPizza.get());
    if (optionalPizza.isPresent()) {
        model.addAttribute("pizza", optionalPizza.get());
        model.addAttribute("empty", false);
    } else {
        model.addAttribute ("empty", true);
    }
    
    return "/pizze/show";

}

    
}

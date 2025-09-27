package org.pizzeria.demo.repository;

import org.pizzeria.demo.model.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;



public interface PizzaRepository extends JpaRepository<Pizza, Integer> { //Pizza è la classe, Integer è la chiave
// dal momento in cui estende una interfaccia eredita i suoi comportamenti, siccome JpaRepository è un Bean, PizzaRepository 
//diventa un Bean per ereditarietà ed entra nel contesto di Spring. In questo modo abbiamo lasciato a Spring il controllo delle operazioni

}

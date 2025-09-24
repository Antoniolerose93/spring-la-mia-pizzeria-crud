package org.pizzeria.demo.repository;

import org.pizzeria.demo.model.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;



public interface PizzaRepository extends JpaRepository<Pizza, Integer> {


}

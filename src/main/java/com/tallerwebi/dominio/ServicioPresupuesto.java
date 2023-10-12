package com.tallerwebi.dominio;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface ServicioPresupuesto {
    @Autowired
    private RepositorioPresupuesto budgetRepository;

    public Presupuesto saveBudget(Presupuesto budget) {
        return budgetRepository.save(budget);
    }

    public List<Presupuesto> getAllBudgets() {
        return budgetRepository.findAll();
    }

    public Presupuesto calculateBudget(Usuario userInput) {
        Presupuesto budget = new Presupuesto();
        budget.setName(userInput.getName());
        // Implementa la lógica para calcular el monto del presupuesto aquí
        double amount = calculateAmount(userInput);
        budget.setAmount(amount);
        return budget;
    }

    private double calculateAmount(Usuario userInput) {
        // Implementa la lógica para calcular el monto del presupuesto aquí
        // Utiliza los datos en userInput (opciones seleccionadas, información adicional, etc.) para realizar los cálculos necesarios.
        return 0.0; // Reemplaza esto con los cálculos reales.
    }
}

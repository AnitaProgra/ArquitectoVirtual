package com.tallerwebi.presentacion;

import com.tallerwebi.dominio.Presupuesto;
import com.tallerwebi.dominio.ServicioPresupuesto;
import com.tallerwebi.dominio.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public class ControladorPresupuesto {
    @Autowired
    private ServicioPresupuesto budgetService;

    @GetMapping("/formulario")
    public String mostrarFormulario(Model model) {
        model.addAttribute("userInput", new Usuario());
        return "formulario";
    }

    @PostMapping("/calcularPresupuesto")
    public String calcularPresupuesto(@ModelAttribute("userInput") Usuario userInput, Model model) {
        Presupuesto budget = budgetService.calculateBudget(userInput);
        budgetService.saveBudget(budget); // Guarda el presupuesto en la base de datos
        model.addAttribute("budget", budget);
        return "resultado";
    }

    @GetMapping("/presupuestos")
    public String listarPresupuestos(Model model) {
        List<Presupuesto> budgets = budgetService.getAllBudgets();
        model.addAttribute("budgets", budgets);
        return "listado";
    }
}

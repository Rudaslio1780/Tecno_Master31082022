package com.tecnomaster.Analisysis_Code.Controller;

import com.tecnomaster.Analisysis_Code.Entities.MovimientoDinero;
import com.tecnomaster.Analisysis_Code.Services.MovimientoDineroServices;
import org.springframework.web.bind.annotation.*;

public class MovimientoDineroController {
    MovimientoDineroServices services;

    public MovimientoDineroController(){
        this.services = new MovimientoDineroServices();
    }

    @GetMapping("/enterprises/{id}/movements")

    public MovimientoDinero ConsultarMovimiento (@PathVariable("id") Integer index){
        return this.services.buscarMovimientoDinero(index);
    }

    @PostMapping("/enterprises/{id}/movements")

    public  String crearMovimientoDinero (@RequestBody MovimientoDinero md){
        return this.services.crearMovimientoDinero(md);
    }

    @DeleteMapping("/enterprises/{id}/movements")

    public String eliminarMovimientoDinero (@PathVariable("id") Integer index){
        return this.services.eliminarMovimientoDinero(index);
    }
}

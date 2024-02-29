package com.msvc.inventario.controller;

import com.msvc.inventario.dto.InventarioResponse;
import com.msvc.inventario.model.Inventario;
import com.msvc.inventario.service.InventarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventario")
public class InventarioController {

    @Autowired
    private InventarioService inventarioService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<InventarioResponse> isInStock(@RequestParam List<String> codigoSku){
        return inventarioService.isInStock(codigoSku);
    }


}

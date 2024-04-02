/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Contrato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.ContratoService;
import org.springframework.http.ResponseEntity;

import java.net.URI;
import java.util.List;

/**
 *
 * @author JUAN CAMILO
 */

@RestController
@RequestMapping("/contratos")
public class ContratoController {

    @Autowired
    private ContratoService contratoService;

    @PostMapping
    public ResponseEntity<Contrato> createContrato(@RequestBody Contrato contrato) {
        Contrato createdContrato = contratoService.createContrato(contrato);
        return ResponseEntity.created(URI.create("/contratos/" + createdContrato.getId())).body(createdContrato);
    }
    
    @GetMapping
    public ResponseEntity<List<Contrato>> getAllContratos() {
        List<Contrato> contratos = contratoService.getAllContratos();
        return ResponseEntity.ok().body(contratos);
    }

    // Otros métodos para manejar operaciones CRUD
}

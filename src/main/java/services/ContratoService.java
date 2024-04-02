/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import java.util.List;
import model.Contrato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import repository.ContratoRepository;

/**
 *
 * @author JUAN CAMILO
 */
@Service
public class ContratoService {

    @Autowired
    private ContratoRepository contratoRepository;

    public List<Contrato> getAllContratos() {
        return contratoRepository.findAll();
    }

    public Contrato createContrato(Contrato contrato) {
        try {
            if (contrato.getNumeroContrato() == null || contrato.getModalidad() == null || contrato.getRegimen() == null) {
                throw new IllegalArgumentException("Los datos del contrato son inválidos");
            }

            return contratoRepository.save(contrato);
        } catch (Exception err) {

            return null;

        }
    }

}

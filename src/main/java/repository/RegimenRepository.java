/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import model.Regimen;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author JUAN CAMILO
 */
public interface RegimenRepository extends JpaRepository<Regimen, Long> {
}

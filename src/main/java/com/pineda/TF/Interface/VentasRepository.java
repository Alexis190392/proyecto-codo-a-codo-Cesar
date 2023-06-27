package com.pineda.TF.Interface;

import com.pineda.TF.Model.VentaTicket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentasRepository extends JpaRepository<VentaTicket, Long> {
}

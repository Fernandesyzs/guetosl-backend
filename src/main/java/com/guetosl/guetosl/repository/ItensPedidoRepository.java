package com.guetosl.guetosl.repository;

import com.guetosl.guetosl.model.ItensPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItensPedidoRepository extends JpaRepository<ItensPedido, Integer> {
}

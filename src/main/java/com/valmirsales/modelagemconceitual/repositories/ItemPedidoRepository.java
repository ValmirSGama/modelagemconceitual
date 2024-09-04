package com.valmirsales.modelagemconceitual.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.valmirsales.modelagemconceitual.domain.ItemPedido;
import com.valmirsales.modelagemconceitual.domain.ItemPedidoPK;

@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, ItemPedidoPK> {
	
}

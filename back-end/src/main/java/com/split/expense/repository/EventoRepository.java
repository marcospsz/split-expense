package com.split.expense.repository;

import com.split.expense.domain.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoRepository extends JpaRepository<Evento , Long> {
}

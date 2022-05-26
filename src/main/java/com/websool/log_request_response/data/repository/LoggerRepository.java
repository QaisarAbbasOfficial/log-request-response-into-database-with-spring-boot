package com.websool.log_request_response.data.repository;

import com.websool.log_request_response.data.entities.LoggerTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoggerRepository extends JpaRepository<LoggerTable, Long> {
}

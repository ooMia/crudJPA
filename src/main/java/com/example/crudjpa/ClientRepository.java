package com.example.crudjpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClientRepository
        extends JpaRepository<Client, Long> {
    @Query("SELECT c FROM Client c WHERE c.id = ?1")
    Optional<Client> findClientById(String id);


}

package edu.iud.floristeriaiud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.iud.floristeriaiud.model.Flores;

public interface florRepository extends JpaRepository<Flores, Long>{
    
}

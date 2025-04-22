package com.ironhack.hellojpa.repository;

import com.ironhack.hellojpa.model.Kombucha;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KombuchaRepository extends JpaRepository<Kombucha, Integer> {

}

package com.upiiz.E10.respositories;

import com.upiiz.E10.entities.Heroe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeroeRepository extends JpaRepository<Heroe,Long> {
}

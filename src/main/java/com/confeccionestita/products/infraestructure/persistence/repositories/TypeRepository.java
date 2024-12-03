package com.confeccionestita.products.infraestructure.persistence.repositories;

import com.confeccionestita.products.infraestructure.persistence.entities.TypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TypeRepository extends JpaRepository<TypeEntity, Integer> {

    @Query(value = "SELECT s.style_name,t.type_name FROM specifics_types t  " +
            "JOIN styles s "+
            "ON s.style_id = t.style_id "+
            "JOIN type_genders tg  "+
            "ON tg.type_id = t.type_id " +
            "JOIN genders g " +
            "ON tg.gender_id = g.gender_id "+
            "WHERE g.gender_name =:name;", nativeQuery = true)
    List<Object[]> findAllByGender(@Param("name") String name);
}

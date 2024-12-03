package com.confeccionestita.products.infraestructure.persistence.repositories;

import com.confeccionestita.products.infraestructure.persistence.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface ProductRepository extends JpaRepository<ProductEntity, String> {

    @Query(value = "SELECT p.product_id, p.price, p.description, m.material_name, g.gender_name, se.season_name, st.type_name, c.color_name, s.size_name, sp.stock " +
            "FROM products p " +
            "JOIN materials m " +
            "ON p.material_id = m.material_id " +
            "JOIN genders g " +
            "ON p.gender_id = g.gender_id " +
            "JOIN specifics_types st " +
            "ON p.type_id = st.type_id " +
            "JOIN seasons se " +
            "ON p.season_id = se.season_id " +
            "JOIN colors_product cp " +
            "ON cp.product_id = p.product_id " +
            "JOIN colors c " +
            "ON cp.color_id = c.color_id " +
            "JOIN sizes_color_product sp " +
            "ON sp.product_id = p.product_id AND sp.color_id = cp.color_id " +
            "JOIN sizes s " +
            "ON sp.size_id = s.size_id;", nativeQuery = true)
    List<Object[]> findProducts();

    @Query(value = "SELECT p.product_id, p.price, p.description, m.material_name, g.gender_name, se.season_name, st.type_name, c.color_name, s.size_name, sp.stock " +
            "FROM products p " +
            "JOIN materials m " +
            "ON p.material_id = m.material_id " +
            "JOIN genders g " +
            "ON p.gender_id = g.gender_id " +
            "JOIN specifics_types st " +
            "ON p.type_id = st.type_id " +
            "JOIN seasons se " +
            "ON p.season_id = se.season_id " +
            "JOIN colors_product cp " +
            "ON cp.product_id = p.product_id " +
            "JOIN colors c " +
            "ON cp.color_id = c.color_id " +
            "JOIN sizes_color_product sp " +
            "ON sp.product_id = p.product_id AND sp.color_id = cp.color_id " +
            "JOIN sizes s " +
            "ON sp.size_id = s.size_id "+
            "WHERE p.product_id = :id;", nativeQuery = true)
    List<Object[]> findProductById(@Param("id") String id);

}

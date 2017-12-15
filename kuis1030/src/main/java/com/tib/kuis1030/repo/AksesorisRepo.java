/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tib.kuis1030.repo;

import com.tib.kuis1030.entity.Aksesoris;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface AksesorisRepo {
    @Query("select p from Aksesoris p")
    public List<Aksesoris> findAllProduct();
    
    @Query("select p from Aksesoris p where p.model.id= :id")
    public List<Aksesoris> findByCategory(@Param("id") Long id);
    
    @Query("select p from Aksesoris p where LOWER(p.nama) LIKE LOWER(:nama)")
    public List<Aksesoris> findByName(@Param("nama") String name);

    public Aksesoris save(Aksesoris aksesoris);

    public void delete(Long id);

}

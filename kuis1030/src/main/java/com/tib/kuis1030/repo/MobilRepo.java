/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tib.kuis1030.repo;

import com.tib.kuis1030.entity.Mobil;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author PC32
 */
public interface MobilRepo {
    @Query("select c from Mobil c")
    public List<Mobil> findAllCategory();

    public Mobil save(Mobil mobil);

    public void delete(Long id);

    public Mobil findOne(Long id);
}

package com.tib.kuis1030.service;

import com.tib.kuis1030.entity.Aksesoris;
import com.tib.kuis1030.repo.AksesorisRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("aksesorisService")
@Transactional
public class AksesorisService {
    @Autowired
    private AksesorisRepo repo;

    public Aksesoris insertOrUpdate(Aksesoris aksesoris) {
        return repo.save(aksesoris);
    }

    public boolean delete(Long id) {
        repo.delete(id);
        return true;
    }

    public List<Aksesoris> findAll() {
        return repo.findAllProduct();
    }

    public List<Aksesoris> findByCategory(Long categoryId) {
        return repo.findByCategory(categoryId);
    }

    public List<Aksesoris> findByName(String name) {
        return repo.findByName("%" + name + "%");
    }
}

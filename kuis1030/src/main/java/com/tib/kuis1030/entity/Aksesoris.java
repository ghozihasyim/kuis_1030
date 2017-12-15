package com.tib.kuis1030.entity;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "aksesoris_1030")

public class Aksesoris implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 20, nullable = false)
    private String nama;
    @Column(length = 20, nullable = true)
    private String jenis;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    
    public String getNama() {
        return nama;
    }
    public void setNama(String Nama) {
        this.nama = Nama;
    }

    public String getJenis() {
        return jenis;
    }
    public void setJenis(String Jenis) {
        this.jenis = Jenis;
    }
    
}

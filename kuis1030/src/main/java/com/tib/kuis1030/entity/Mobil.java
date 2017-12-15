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
@Table(name = "mobil_1030")
public class Mobil implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 20, nullable = false, unique = true)
    private String merk;
    @Column(length = 20, nullable = true)
    private String jenis;
    @OneToMany
    @JoinColumn(name="id")
    private Set<Aksesoris> Aksesoris;
    
    public Long getId() {
        return id;
    }
    public void setNim(Long id) {
        this.id = id;
    }
   
    public String getMerk() {
        return merk;
    }
    public void setNama(String Merk) {
        this.merk = Merk;
    }

    public String getJenis() {
        return jenis;
    }
    public void setJenis(String Jenis) {
        this.jenis = Jenis;
    }
    
}

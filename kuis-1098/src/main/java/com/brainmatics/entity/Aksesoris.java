/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainmatics.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

/**
 *
 * @author Hendro Steven
 */
@Entity
@Table(name = "aksesoris_1098")
public class Aksesoris implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long noseri_akses;
    @Column(length = 100, nullable = false, unique = true)
    private String nama;
    @Column(length = 100, nullable = true)
    private String merk;
    @Column(length = 100, nullable = true)
    private String tipe;
  
    @Column
    private Long noseri;
   
    public Long getNoseri_akses() {
        return noseri_akses;
    }

      public void setNoseri_akses(Long noseri_akses) {
        this.noseri_akses = noseri_akses;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getTipe() {
        return tipe;
    }
    
    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public Long getNoseri(){
        return noseri;
    }
    
    public void setNoseri(Long noseri){
        this.noseri=noseri;
    }
      
    
}

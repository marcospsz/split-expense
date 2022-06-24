package com.split.expense.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.text.SimpleDateFormat;

@Entity
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nm_evento;
    private Integer id_local;
    private String dt_evento;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNm_evento() {
        return nm_evento;
    }

    public void setNm_evento(String nm_evento) {
        this.nm_evento = nm_evento;
    }

    public Integer getId_local() {
        return id_local;
    }

    public void setId_local(Integer id_local) {
        this.id_local = id_local;
    }

    public String getDt_evento() {
        return dt_evento;
    }

    public void setDt_evento(String dt_evento) {
        this.dt_evento = dt_evento;
    }
}

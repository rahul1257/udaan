package com.udaan.project.entities;

import javax.persistence.Entity;

@Entity
public class ResponseEntity extends  BaseEntity{

    private String response;

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}

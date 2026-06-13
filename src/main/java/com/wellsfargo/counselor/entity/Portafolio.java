package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Portafolio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long portafolioId;

    @Column(nullable = false)
    private String creationDate;

    @Column(nullable = false)
    private long clientID;

    public Portafolio(long portafolioId, String creationDate, Client client){
        this.portafolioId = portafolioId;
        this.creationDate = creationDate;
        this.clientID = client.getClientId();
    }

    public long getPortafolioId() {
        return portafolioId;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public long getClientID() {
        return clientID;
    }

}

package com.example.mim.model;

import java.util.Date;

public class ContratLocation {

    private int id;
    private Client leClient;
    private Vehicule leVehicule;
    private Date dateEnlevement;
    private Date dateRestitution;

    private ContratLocation() {}

    public ContratLocation(int id, Client leClient, Vehicule leVehicule, Date dateEnlevement, Date dateRestitution) {
        this.id = id;
        this.leClient = leClient;
        this.leVehicule = leVehicule;
        this.dateEnlevement = dateEnlevement;
        this.dateRestitution = dateRestitution;
    }

    public int getId() { return id;  }

    public void setId(int id) { this.id = id;  }

    public Client getLeClient() {return leClient;  }

    public void setLeClient(Client leClient) { this.leClient = leClient;  }

    public Vehicule getLeVehicule() {  return leVehicule;  }

    public void setLeVehicule(Vehicule leVehicule) { this.leVehicule = leVehicule;  }

    public Date getDateEnlevement() { return dateEnlevement;  }

    public void setDateEnlevement(Date dateEnlevement) {  this.dateEnlevement = dateEnlevement; }

    public Date getDateRestitution() { return dateRestitution;  }

    public void setDateRestitution(Date dateRestitution) { this.dateRestitution = dateRestitution; }

    @Override
    public String toString() {
        return "ContratLocation{" +
                "id=" + id +
                ", leClient=" + leClient +
                ", leVehicule=" + leVehicule +
                ", dateEnlevement=" + dateEnlevement +
                ", dateRestitution=" + dateRestitution +
                '}';
    }
}

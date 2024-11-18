package model;

public class Client {
    String nom,prenom;
    public Client(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;

    }

    @Override
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }
}

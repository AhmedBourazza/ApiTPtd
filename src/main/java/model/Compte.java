package model;

public class Compte {
    public int numCompte;
    public float solde;
    Client client;
    public Compte(int numCompte, float solde, Client client) {
        this.numCompte = numCompte;
        this.solde = solde;
        this.client = client;
    }

    @Override
    public String toString() {
        return "Compte{" + "numCompte=" + numCompte + ", solde=" + solde+", "+client + '}';
    }
}

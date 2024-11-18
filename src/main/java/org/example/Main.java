package org.example;

import Service.BanqueService;
import model.Client;
import model.Compte;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Compte> comptes = new ArrayList<Compte>();
        comptes.add(new Compte(1,1562,new Client("BOURAZZA","Ahmed")));
        comptes.add(new Compte(2,150,new Client("MAKHLOUL","Ilyas")));
        comptes.add(new Compte(3,10000,new Client("ammidouah","Adnan")));


        for (Compte compte : comptes) {
            System.out.println(compte);
        }
        // Tri des comptes par solde croissant
        BanqueService banqueService = new BanqueService();
        ArrayList<Compte> comptesTries = banqueService.sortBySolde(comptes);

        // Affichage des comptes triés
        System.out.println("\nListe des comptes après tri :");
        for (Compte compte : comptesTries) {
            System.out.println(compte);
        }

    }
}
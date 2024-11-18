package org.example;

import Service.BanqueService;
import model.Client;
import model.Compte;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Compte> comptes = new ArrayList<Compte>();
      /*  comptes.add(new Compte(1,1562,new Client("BOURAZZA","Ahmed")));
        comptes.add(new Compte(2,150,new Client("MAKHLOUL","Ilyas")));
        comptes.add(new Compte(3,10000,new Client("ammidouah","Adnan")));

*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer le nombre de compte à ajouter ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Veuillez entrer le numero de compte "+(i+1));
            int num = scanner.nextInt();
            System.out.println("Veuillez entrer le solde de compte ");
            float solde = scanner.nextFloat();
            System.out.println("Veuillez entrer le nom du client ");
            String nom = scanner.next();
            System.out.println("Veuillez entrer le prenom du client ");
            String prenom = scanner.next();
            comptes.add(new Compte(num,solde,new Client(nom,prenom)));

        }
        System.out.println("-----------------------------------------------");

        System.out.println("Voici la liste des comptes");

        for (Compte compte : comptes) {
            System.out.println(compte);
        }

        System.out.println("-----------------------------------------------");
        System.out.println("Voici la liste des comptes triés selon le solde");

        BanqueService banqueService = new BanqueService();
        ArrayList<Compte> comptesTries = banqueService.sortBySolde(comptes);

        System.out.println("\nListe des comptes après tri :");
        for (Compte compte : comptesTries) {
            System.out.println(compte);
        }

    }
}
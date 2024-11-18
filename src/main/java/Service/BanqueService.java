package Service;

import model.Compte;

import java.util.ArrayList;

public class BanqueService {
    public ArrayList sortBySolde(ArrayList<Compte> comptes)
    {
        ArrayList<Compte> sortedList = new ArrayList<>();

        while (!comptes.isEmpty()) {
            Compte minCompte = comptes.get(0);
            for (Compte compte : comptes) {
                if (compte.solde < minCompte.solde) {
                    minCompte = compte;
                }
            }
            sortedList.add(minCompte);
            comptes.remove(minCompte);
        }

        return sortedList;
    }
}

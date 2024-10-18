package banque;

public class SGB {

    public boolean effectuerVirementP(int id, int noC1, int noC2, int mnt){
        Client client = chercherClient(id);
        Compte c1 = client.compte(noC1);
        Compte c2 = client.compte(noC2);

        Virement virement = new Virement(c1,c2, mnt);
        return virement.effectuer();
    }

    public Client chercherClient(int id){
        return null;
    }
}

package banque;

public class Compte {
    private int solde;

    public Compte(int solde) {
        this.solde = solde;
    }

    public boolean retirer(int mnt){
        if (solde < mnt)
            return false;

        solde = solde - mnt;
        return true;
    }

    public boolean deposer(int mnt){
        solde = solde + mnt;
        return true;
    }
}

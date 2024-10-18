package banque;

public class Virement {
    private Compte c1;
    private Compte c2;
    private int mnt;

    public Virement (Compte c1, Compte c2, int mnt){
        this.c1 = c1;
        this.c2 = c2;
        this.mnt = mnt;
    }

    public boolean effectuer(){
        if (!c1.retirer(mnt))
            return false;

        c2.deposer(mnt);
        return true;
    }
}

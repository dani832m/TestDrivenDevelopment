//Simpelt lille program, der fungerer som en tidlig beta til 1. semesterprojektet

package dk.n4;

public class LoenKonto {

    int saldo;
    boolean positiveBalance;

    public int getSaldo() {
        return saldo;
    }

    public boolean setSaldo(int saldo) {
        this.saldo = saldo;

        if (saldo >= 0) {
            positiveBalance = true;
        }
        else {
            positiveBalance = false;
        }

        return positiveBalance;
    }

}
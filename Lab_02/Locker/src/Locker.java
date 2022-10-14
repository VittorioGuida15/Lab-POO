public class Locker {

    private boolean isOpen;
    private String code;

    public Locker() {
        isOpen = true;
        code = "";
    }

    public void unlock(String code) {
        if(this.code.equals(code)) {
            isOpen = true;
            System.out.println("La serratura è stata aperta");
        }
        else System.out.println("Codice errato!!");
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void lock() {
        if(isOpen) {
            isOpen = false;
            System.out.println("La serratura è stata chiusa");
        }
        else System.out.println("La serratura è già chiusa! ");
    }

    public void newComb(String newCode) {
        if(isOpen) {
            code = newCode;
            System.out.println("Codice impostato con successo!");
        }
        else System.out.println("Sbloccare prima la serratura!");
    }

}
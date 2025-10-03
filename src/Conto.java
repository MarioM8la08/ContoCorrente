import java.util.ArrayList;
import java.util.List;

public class Conto {
    private String Iban;
    private String Titolare;
    private double saldo;
    private List<Operazione> operazioni;

    public Conto(String iban, String titolare, double saldo, List<Operazione> operazioni) {
        Iban = iban;
        Titolare = titolare;
        this.saldo = saldo;
        this.operazioni = operazioni;
    }

    public void Prelievo(double prelievo) {
        if (prelievo > 0 && prelievo <= saldo) {
            saldo -= prelievo;
            operazioni.add(new Operazione(java.time.LocalDate.now(), TypeOperazione.PRELIEVO, prelievo));
        } else {
            System.out.println("Importo di prelievo non valido.");
        }
    }

    public void Versamento(double versamento) {
        if (versamento > 0) {
            saldo += versamento;
            operazioni.add(new Operazione(java.time.LocalDate.now(), TypeOperazione.DEPOSITO, versamento));
        } else {
            System.out.println("Importo di versamento non valido.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Operazione> getOperazioni() {
        return operazioni;
    }

    public List<Operazione> getOperazioniByType(TypeOperazione tipo) {
        List<Operazione> filterOperazioni = new ArrayList<>();
        for (Operazione operazione : operazioni) {
             if (operazione.getTipo() == tipo) {
                 filterOperazioni.add(operazione);
             }
        }
        return filterOperazioni;
    }
}

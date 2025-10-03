import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Operazione operazione1 = new Operazione(java.time.LocalDate.of(2025, 10, 3), TypeOperazione.DEPOSITO, 500.0);
        Operazione operazione2 = new Operazione(java.time.LocalDate.of(2025, 10, 3), TypeOperazione.PRELIEVO, 200.0);
        List<Operazione> operazioni = new ArrayList<Operazione>();
        operazioni.add(operazione1);
        operazioni.add(operazione2);
        Conto conto = new Conto("IT1234567890123456789012345", "Mario Rossi", 1000.0, operazioni);
        System.out.println("Saldo iniziale: " + conto.getSaldo());
        conto.Versamento(300.0);
        System.out.println("Saldo dopo versamento: " + conto.getSaldo());
        conto.Prelievo(150.0);
        System.out.println("Saldo dopo prelievo: " + conto.getSaldo());
        System.out.println("Operazioni di deposito:");
        for (Operazione op : conto.getOperazioniByType(TypeOperazione.DEPOSITO)) {
            System.out.println(op.getData() + " - " + op.getTipo() + " - " + op.getImporto());
        }
        System.out.println("Operazioni di prelievo:");
        for (Operazione op : conto.getOperazioniByType(TypeOperazione.PRELIEVO)) {
            System.out.println(op.getData() + " - " + op.getTipo() + " - " + op.getImporto());
        }
    }
}
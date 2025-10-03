import java.time.LocalDate;

public class Operazione {
    private LocalDate data;
    private TypeOperazione tipo;
    private double importo;

    public Operazione(LocalDate data, TypeOperazione tipo, double importo) {
        this.data = data;
        this.tipo = tipo;
        this.importo = importo;
    }
    public LocalDate getData() {
        return data;
    }
    public TypeOperazione getTipo() {
        return tipo;
    }
    public double getImporto() {
        return importo;
    }
}

package Lista10;

public class Seguro {
    private int codigo;
    private String nomeSegurado;
    private double valorSegurado;
    private double valorBase;

    public Seguro(int codigo, String nomeSegurado, double valorSegurado, double valorBase) {
        this.codigo = codigo;
        this.nomeSegurado = nomeSegurado;
        this.valorSegurado = valorSegurado;
        this.valorBase = valorBase;
    }

    public double calcularPremio() {
        return this.valorBase;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNomeSegurado() {
        return nomeSegurado;
    }

    public double getValorSegurado() {
        return valorSegurado;
    }

    public double getValorBase() {
        return valorBase;
    }
}
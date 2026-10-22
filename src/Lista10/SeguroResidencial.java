public class SeguroResidencial extends Seguro {

    public SeguroResidencial(int codigo, String nomeSegurado, double valorSegurado, double valorBase) {
        super(codigo, nomeSegurado, valorSegurado, valorBase);
    }

    @Override
    public double calcularPremio() {
        return getValorBase() + (getValorSegurado() * 0.01);
    }
}
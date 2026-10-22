public class SeguroVida extends Seguro {
    private int idade;

    public SeguroVida(int codigo, String nomeSegurado, double valorSegurado, double valorBase, int idade) {
        super(codigo, nomeSegurado, valorSegurado, valorBase);
        this.idade = idade;
    }

    @Override
    public double calcularPremio() {
        double premio = getValorBase() + (getValorSegurado() * 0.02);

        if (idade > 55) {
            premio += premio * 0.20;
        }

        return premio;
    }

    public int getIdade() {
        return idade;
    }
}
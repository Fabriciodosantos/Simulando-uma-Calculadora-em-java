package calculadoraatividade1;

public class OperaçãoDivisão {

    private float valor1;
    private float valor2;
    private float resultado;

    public OperaçãoDivisão(float valor1, float valor2, float resultado) {
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.resultado = resultado;
    }

    public OperaçãoDivisão() {
    }

    public float getValor1() {
        return valor1;
    }

    public void setValor1(float valor1) {
        this.valor1 = valor1;
    }

    public float getValor2() {
        return valor2;
    }

    public void setValor2(float valor2) {
        this.valor2 = valor2;
    }

    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }

    public void divisãoValores() {
        this.setResultado(this.getValor1() / this.getValor2());
        System.out.println(this.getValor1() + " / " + this.getValor2() + " = " + this.getResultado() + ".");
    }
}

package calculadoraatividade1;

public class Operações {

    private int valor1;
    private int valor2;
    private int resultado;

    //Construtores
    public Operações() {

    }

    public Operações(int valor1, int valor2, int resultado) {
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.resultado = resultado;
    }

    //getters e setters
    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    //Metodos da Classe
    public void somaValores() {
        this.setResultado(this.getValor1() + this.getValor2());
        System.out.println(this.getValor1() + " + " + this.getValor2() + " = " + this.getResultado() + ".");
    }

    public void subtraçãoValores() {
        this.setResultado(this.getValor1() - this.getValor2());
        System.out.println(this.getValor1() + " - " + this.getValor2() + " = " + this.getResultado() + ".");
    }

    public void multiplicaçãoValores() {
        this.setResultado(this.getValor1() * this.getValor2());
        System.out.println(this.getValor1() + " x " + this.getValor2() + " = " + this.getResultado() + ".");
    }

    public void quadradoValores() {
        this.setResultado(this.getValor1() * this.getValor1());
        System.out.println("O quadrado de " + this.getValor1() + " = " + this.getResultado());
    }
}

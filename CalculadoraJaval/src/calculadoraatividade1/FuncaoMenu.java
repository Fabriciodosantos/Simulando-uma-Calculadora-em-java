package calculadoraatividade1;

import java.util.Scanner;

public class FuncaoMenu {

    private int op;

    public int getOp() {
        return op;
    }

    public void setOp(int op) {
        this.op = op;
    }

    
    public void calcular() {
        Scanner scanner = new Scanner(System.in);
        do {
        System.out.println("* CALCULADORA *");
        System.out.println("------------------------------------");
        System.out.println("*Menu:*");
        this.apresentarMenu();
        System.out.print("Digite a opção escolhida: ");
        this.setOp(scanner.nextInt());
        System.out.println("------------------------------------");
        

        
            

            switch (this.getOp()) {
                case 1: {
                    Operações soma = new Operações();

                    System.out.println("Operação: *Somar* ");

                    System.out.print("Digite o Valor 1: ");
                    soma.setValor1(scanner.nextInt());
                    System.out.print("");

                    System.out.print("Digite o Valor 2: ");
                    soma.setValor2(scanner.nextInt());

                    soma.somaValores();
                    

                    break;
                }
                case 2: {
                    Operações subtração = new Operações();

                    System.out.println("Operação: *Subtração*");

                    System.out.print("Digite o Valor 1: ");
                    subtração.setValor1(scanner.nextInt());
                    System.out.print("");

                    System.out.print("Digite o Valor 2: ");
                    subtração.setValor2(scanner.nextInt());

                    subtração.subtraçãoValores();
                    

                    break;
                }
                case 3: {
                    Operações multiplicação = new Operações();

                    System.out.println("Operação: *Multiplicação*");

                    System.out.print("Digite o Valor 1: ");
                    multiplicação.setValor1(scanner.nextInt());
                    System.out.print("");

                    System.out.print("Digite o Valor 2: ");
                    multiplicação.setValor2(scanner.nextInt());

                    multiplicação.multiplicaçãoValores();
                    

                    break;
                }
                case 4: {
                    OperaçãoDivisão divisão = new OperaçãoDivisão();

                    System.out.println("Operação: *Divisão*");

                    System.out.print("Digite o Valor 1: ");
                    divisão.setValor1(scanner.nextInt());
                    System.out.print("");

                    System.out.print("Digite o Valor 2: ");
                    divisão.setValor2(scanner.nextInt());

                    divisão.divisãoValores();
                    

                    break;
                }
                case 5: {
                    Operações quadrado = new Operações();

                    System.out.println("Operação: *Quadrado*");

                    System.out.print("Digite o Valor: ");
                    quadrado.setValor1(scanner.nextInt());
                    System.out.print("");

                    quadrado.quadradoValores();
                    

                    break;
                }
                default:
                    if(this.getOp()== 0){
                        return;
                    }
                    System.out.println("Operação invalida: Escolha novamente!");
                    break;
                    

            }
            System.out.println("------------------------------------");
            System.out.print("\n\n");
        } while (this.getOp() != 0);
    }
    
    public void apresentarMenu(){
        System.out.println("1: Soma.");
        System.out.println("2: Subtração.");
        System.out.println("3: Multiplicação.");
        System.out.println("4: Divisão.");
        System.out.println("5: Quadrado.");
        System.out.println("0: Sair");
        System.out.println("------------------------------------");
    }

}

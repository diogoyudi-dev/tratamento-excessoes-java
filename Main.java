package Tratamento_Excessao;

import Tratamento_Excessao.Excessoes.ContaException.ContaException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        try(Scanner sc = new Scanner(System.in);) {
            System.out.println("Digite o saldo");
            double saldo = sc.nextDouble();

            System.out.println("Digite o limite");
            double limite = sc.nextDouble();

            ContaBanco conta = new ContaBanco(saldo,limite);

            System.out.println("Digite quanto deseja retirar");
            double retirada = sc.nextDouble();

            conta.sacar(retirada);

            System.out.println("Retirada feita com sucesso!!!");
            System.out.println("Saldo atual: " + conta.getSaldo());

        }catch(ContaException e){
            System.out.println(e.getMessage());
        }catch(InputMismatchException e) {
            System.out.println("Digite números válidos");
        }catch(Exception e) {
            System.out.println("Erro inesperado aconteceu");
        }
    }
}   

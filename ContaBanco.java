package Tratamento_Excessao;

import Tratamento_Excessao.Excessoes.LimiteInvalidoException;
import Tratamento_Excessao.Excessoes.RetiradaInvalidaException;
import Tratamento_Excessao.Excessoes.SaldoInvalidoException;
import Tratamento_Excessao.Excessoes.ValorInvalidoException;

public class ContaBanco {
    private double saldo;
    private double limite;

        public ContaBanco(double saldo, double limite) {
            if (saldo < 0) {
                throw new ValorInvalidoException("Saldo inválido");
            } else if (limite <= 0) {
                throw new ValorInvalidoException("Limite inválido");
            } else {
                this.saldo = saldo;
                this.limite = limite;
            }
        }


        public double getSaldo() {
            return this.saldo;
        }

        public double getLimite() {
            return this.limite;
        }

        public void sacar(double retirada) {
            if (retirada > saldo) {
                throw new SaldoInvalidoException("Não há saldo suficiente para retirar");
            } else if (retirada > limite) {
                throw new LimiteInvalidoException("Não há limite suficiente para retirar");
            } else if (retirada <= 0) {
                    throw new RetiradaInvalidaException("Valor de retirada inválido");
            } else {
                    this.saldo -= retirada;
            }
            }

    }



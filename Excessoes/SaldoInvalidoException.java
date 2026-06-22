package Tratamento_Excessao.Excessoes;

import Tratamento_Excessao.Excessoes.ContaException.ContaException;

public class SaldoInvalidoException extends ContaException {
    public SaldoInvalidoException(String message) {
        super(message);
    }
}

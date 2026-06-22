package Tratamento_Excessao.Excessoes;

import Tratamento_Excessao.Excessoes.ContaException.ContaException;

public class RetiradaInvalidaException extends ContaException {
    public RetiradaInvalidaException(String message) {
        super(message);
    }
}

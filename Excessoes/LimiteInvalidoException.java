package Tratamento_Excessao.Excessoes;

import Tratamento_Excessao.Excessoes.ContaException.ContaException;

public class LimiteInvalidoException extends ContaException {
    public LimiteInvalidoException(String message) {
        super(message);
    }
}

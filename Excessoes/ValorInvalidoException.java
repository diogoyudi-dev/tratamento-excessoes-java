package Tratamento_Excessao.Excessoes;

import Tratamento_Excessao.Excessoes.ContaException.ContaException;

public class ValorInvalidoException extends ContaException {

    public ValorInvalidoException(String msm){
        super(msm);
    }
}

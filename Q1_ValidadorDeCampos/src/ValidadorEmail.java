//Classe que implementa o tipo EMAIL do switch inicialmente criado em Validator:

public class ValidadorEmail extends Validador{
    public boolean valida(String valor) {
        int posA = valor.indexOf('@');
        int posPt = valor.indexOf('.');
        if (posA <= 0 || posPt <= 0) return false;
        return true;
    }
}
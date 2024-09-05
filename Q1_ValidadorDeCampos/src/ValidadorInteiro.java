//Classe que implementa o tipo INTEIRO do switch inicialmente criado em Validator:

public class ValidadorInteiro extends Validador{
    public boolean valida(String valor) {
        for (int i = 0; i < valor.length(); i++) {
            if (!Character.isDigit(valor.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
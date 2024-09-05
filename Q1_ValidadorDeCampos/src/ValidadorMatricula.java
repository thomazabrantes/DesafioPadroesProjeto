//Classe que implementa o tipo MATRICULA do switch inicialmente criado em Validator:

public class ValidadorMatricula extends Validador{
    public boolean valida(String valor) {
        Validador inteiroValidador = new ValidadorInteiro();
        if (!inteiroValidador.valida(valor)) {
            return false;
        } else {
            int sum = 0;
            for (int i = 0; i < valor.length() - 1; i++) {
                sum += Character.getNumericValue(valor.charAt(i));
            }
            int verificador = sum % 10;
            return verificador == Character.getNumericValue(valor.charAt(valor.length() - 1));
        }
    }
}
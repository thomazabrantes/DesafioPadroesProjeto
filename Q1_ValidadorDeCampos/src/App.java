public class App {
    public static void main(String[] args) throws Exception {
        String inteiro = "21";
        String matricula = "221891403";
        String email = "bernardo.copstein@pucrs.br";
        Validador validadorEmail = new ValidadorEmail();

        if (validadorEmail.valida(email)){
            System.out.println(email+" é um email válido!");
        }else{
            System.out.println(email+" não é um email válido!");
        }
    }
}

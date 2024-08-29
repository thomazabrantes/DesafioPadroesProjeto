public class App {
    public static void main(String[] args) throws Exception {
        //ValidadorFactory vf = new ValidadorFactory();

        String nro = "2475463";
        IValidador vi = ValidadorFactory.getInstance().createInstance(Tipo.INTEIRO);
        System.out.println(vi.valida(nro));

        String email = "abc@cde.com";
        IValidador ve = ValidadorFactory.getInstance().createInstance(Tipo.EMAIL);
        System.out.println(ve.valida(email));
    }
}

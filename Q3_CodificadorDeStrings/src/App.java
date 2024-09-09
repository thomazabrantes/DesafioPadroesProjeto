public class App {
    public static void main(String[] args) throws Exception {
        Codificador cod = new CodificaSimples();
        Codificador codi = new CodificaDesloca();
        Codificador de = new DescodificaDesloca();
        Codificador dec = new DescodificaSimples();

        String aux = "Desafio Padrões de Projeto";
        System.out.println(aux);

        aux = cod.codificador(aux);
        System.out.println(aux);

        aux = codi.codificador(aux);
        System.out.println(aux);

        aux = de.codificador(aux);
        System.out.println(aux);

        aux = dec.codificador(aux);
        System.out.println(aux);
        
    }
}

public class App {
    public static void main(String[] args) {

        Dado d6 = new Dado(6);
        Dado d20 = new Dado(20);

        d6.rolar();
        d20.rolar();

        System.out.println("D6: " + d6.getValor());
        System.out.println("D20: " + d20.getValor());

        //
        DadoH d6H = new DadoH(d6, 6);
        DadoH d20H = new DadoH(d20, 20);

        for (int i = 0; i <=4; i++){
            d6H.rolar();
            d20H.rolar();
        }

        System.out.println("D6 com Histórico: " + d6H.historico());
        System.out.println("D20 com Histórico: " + d20H.historico());
    

       
    }
}

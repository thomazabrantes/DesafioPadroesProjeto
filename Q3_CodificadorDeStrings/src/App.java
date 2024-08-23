public class App {

    // REFAZER !!!

    public static void main(String[] args) throws Exception {
        var log = new LogNiveis();

        log.log(1,"Eu acho que vi um gatinho!");
        log.log(2,"Alguma coisa esta cheirando mal!");
        log.log(3,"PANIC! Rebooting!");

        for(String msg:log){
            System.out.println(msg);
        }
    }
}

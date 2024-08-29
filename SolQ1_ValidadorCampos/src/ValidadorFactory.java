public class ValidadorFactory {
    private static ValidadorFactory vf = null;

    private ValidadorFactory(){

    }

    public static ValidadorFactory getInstance(){
        if (vf == null){
            vf = new ValidadorFactory();
        }
        return vf;
    }
    
    public IValidador createInstance(Tipo tipo){
        switch(tipo){
            case INTEIRO:
                return new ValidaInteiro();
            case EMAIL:
                return new ValidadorEmail();
            default:
                return null;
        }
    }
}

import java.util.HashMap;
import java.util.Map;
public class CodificaDesloca implements Codificador{
       private Map<Character,Character> tabCod;

       public CodificaDesloca() {
        tabCod = new HashMap<>();
        tabCod.put('a', '@');
        tabCod.put('e', '#');
        tabCod.put('i', '!');
        tabCod.put('o', '$');
        tabCod.put('u', '%');
    }
    

    @Override
    public String codificador(String str) {
        char[] aux = str.toCharArray();
        char[] resp = new char[str.length()];
        for(int i=0;i<aux.length;i++){
            resp[i] = (char)(Character.valueOf(aux[i])+1);
        }
        return(new String(resp));
    }
    
}

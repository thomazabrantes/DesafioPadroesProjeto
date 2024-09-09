import java.util.HashMap;
import java.util.Map;
public class CodificaSimples implements Codificador{
       private Map<Character,Character> tabCod;

       public CodificaSimples() {
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
                if (tabCod.containsKey(aux[i])){
                    resp[i] = tabCod.get(aux[i]);
                }else{
                    resp[i] = aux[i];
                }
            }
            return(new String(resp));
        }
        
    }





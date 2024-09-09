
import java.util.HashMap;
import java.util.Map;

public class DescodificaDesloca implements Codificador{
    private Map<Character,Character> tabDeCod;

    public DescodificaDesloca(){
        tabDeCod = new HashMap<>();
        tabDeCod.put('@','a');
        tabDeCod.put('#','e');
        tabDeCod.put('!','i');
        tabDeCod.put('$','o');
        tabDeCod.put('%','u');
    }

    @Override
    public String codificador(String str) {
        char[] aux = str.toCharArray();
        char[] resp = new char[str.length()];
        for(int i=0;i<aux.length;i++){
            resp[i] = (char)(Character.valueOf(aux[i])-1);
        }
        return(new String(resp));
    }

    
}

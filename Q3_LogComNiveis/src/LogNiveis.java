import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LogNiveis implements Iterable<String>{
    private List<String> mensagens;

    public LogNiveis(){
        mensagens = new LinkedList<>();
    }

    public void log(int nivel,String msg){
        String logM = nivel+":";
        switch(nivel){
            default:
            case 1:
                logM += msg;
              break;
              case 2:
              logM += LocalDate.now().toString() + " : " + msg;
              break;
            case 3:
              logM += LocalDateTime.now().toString() + " : " + msg;
              break;
        }
        mensagens.add(logM);
    }

    @Override
    public Iterator<String> iterator() {
        return mensagens.iterator();
    }
}
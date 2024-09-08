// Todos os clientes devem acessar uma única instância compartilhada da classe 
// Nenhuma instância adicional deve ser criada acidentalmente

/*
 * Solução? 
 * Alternativa 1: Classe com todos os métodos e atributos estáticos
 * Alternativa 2: Classe definida com um contrutor privado que cria uma instância única de si mesma;
 *                Fornece-se um método estático que retorna uma referência para a instância única.
 */

 import java.time.LocalDate;
 import java.util.Iterator;
 import java.util.LinkedList;
 import java.util.List;
 
 public class LogSimples implements Iterable<String>{
     private List<String> mensagens;
     static LogSimples instance;
 
     private LogSimples(){
         mensagens = new LinkedList<>();
     }
 
     static synchronized public LogSimples getInstance() {
         if(instance == null)
             instance = new LogSimples();
         return (instance);
     }
 
     @Override
     public Object clone() throws CloneNotSupportedException {
         throw new CloneNotSupportedException();
     }
 
     public void log(String m){
         String logM = LocalDate.now().toString() + " : " + m;
         mensagens.add(logM);
     }
 
     @Override
     public Iterator<String> iterator() {
         return mensagens.iterator();
     }
 }
 
public class ThreadSuono extends Thread{
    Campana campana;

    public ThreadSuono(String nome, Campana c){
        super(nome);
        this.campana = c;
    }

    @Override
    public void run() {
        while(true){
            campana.emettiSuono();

            try {
                sleep(1000);
            } catch (Exception e) {
            
            }
        }
        
        
    }
}

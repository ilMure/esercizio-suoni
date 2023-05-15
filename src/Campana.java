public class Campana {
    String precedente;

    public Campana(){
        this.precedente = "";
    }

    public synchronized void emettiSuono(){
        String richiedente = Thread.currentThread().getName();

        while(precedente == "" && !(richiedente.equalsIgnoreCase("DIN")) || richiedente.equalsIgnoreCase("DIN") && precedente.equalsIgnoreCase("DON") || 
            richiedente.equalsIgnoreCase("DON") && precedente.equalsIgnoreCase("DAN") ||
            richiedente.equalsIgnoreCase("DAN") && precedente.equalsIgnoreCase("DIN")){
            try {
                wait();
            } catch (Exception e) {
                
            }
        }

        System.out.println("SUONO: "+richiedente);

        precedente = richiedente;

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            
        }

        notifyAll();
    }
}

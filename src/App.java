public class App {
    public static void main(String[] args) throws Exception {
        Campana c = new Campana();
        Thread threadDin = new ThreadSuono("DIN", c);
        Thread threadDon = new ThreadSuono("DON", c);
        Thread threadDan = new ThreadSuono("DAN", c);
 
        
        threadDon.start();     
        threadDan.start(); 
        threadDin.start();

        Thread.sleep(10000);

        System.exit(0);


    }
}

public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smarTv = new SmartTv();

        smarTv.diminuirVolume();
        smarTv.diminuirVolume();
        smarTv.diminuirVolume();
        smarTv.aumentarVolume();

        System.out.println("Canal atual: " + smarTv.canal);

        smarTv.mudarCanal(17);
        
        System.out.println("Canal atual: " + smarTv.canal);

        System.out.println("Volume atual : " + smarTv.volume);
        System.out.println("A TV está ligada ? " + smarTv.ligada);
        System.out.println("volume da tv: " + smarTv.volume);
        System.out.println("Canal atual: " + smarTv.canal);
       

        smarTv.ligar ();
        System.out.println("Novo status -> Tv ligada ? " + smarTv.ligada);

        smarTv.desligar ();
        System.out.println("Novo status -> Tv ligada ? " + smarTv.ligada);




    }
}

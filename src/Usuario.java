public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.ligar();

        System.out.println("A TV está no canal " + smartTv.canal);
        System.out.println("A TV está no volume " + smartTv.volume);

        smartTv.mudarCanal(05);
        System.out.println("Agora TV está no canal " + smartTv.canal);

        smartTv.abaixarVolume();
        System.out.println("Volume: " + smartTv.volume);
        smartTv.abaixarVolume();
        System.out.println("Volume: " + smartTv.volume);
        smartTv.abaixarVolume();
        System.out.println("Volume: " + smartTv.volume);
        smartTv.abaixarVolume();
        System.out.println("Volume: " + smartTv.volume);
        smartTv.abaixarVolume();
        System.out.println("Volume: " + smartTv.volume);

        smartTv.desligar();
        System.out.println("A TV ainda está ligada? " + smartTv.ligada);

    }
}

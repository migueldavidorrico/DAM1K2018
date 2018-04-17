public class AccesoMap {
    public static void main(String[] args) {
        VideoClub video = new VideoClub();
        Pelicula trescientos = new Pelicula("300", 2003);
        video.anyadirActor(trescientos, "Kevin Bacon");
        video.anyadirActor(trescientos, "Gerald Balder");
        video.anyadirActor(trescientos, "Santiago Segura");
        video.anyadirActor(trescientos, "Han solo");
        Pelicula elDespertar = new Pelicula("El despertar", 2003);
        video.anyadirActor(elDespertar, "Kevin Bacon");
        video.anyadirActor(elDespertar, "Santiago Segura");
        video.anyadirActor(elDespertar, "Ana Belén");
        Pelicula soloEnCasa = new Pelicula("Solo en Casa", 2016);
        video.anyadirActor(soloEnCasa, "Kevin Bacon");
        video.anyadirActor(soloEnCasa, "Macunie culquin");
        System.out.println(video.salidaBonita());
        System.out.println(video.participa("Juan Nadie"));
    }
}

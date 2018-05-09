public enum Idioma {
    ESPANOL("ESPAÑOL"), INGLES("INGLÉS"), ALEMAN("ALEMÁN"), JAPONES("JAPONÉS");

    String textoCastelano;

    Idioma(String texto) {
        this.textoCastelano = texto;
    }

    @Override
    public String toString() {
        return textoCastelano;
    }
}

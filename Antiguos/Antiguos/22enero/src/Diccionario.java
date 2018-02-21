public enum Diccionario {
    FACIL("Dimensión","Corrección","Pasión","Presión","Precisión","Privación","Composición","Tradición"),
    INTERMEDIO("Tensión","Oración","Misión","Ilusión","División","Decisión","Comprensión","Intención"),
    DIFICIL("Televisión","Ocasión","Unción");
    private String[] lista;

    Diccionario(String... lista){
        this.lista=lista;
    }

    public String[] getLista() {
        return lista;
    }
}

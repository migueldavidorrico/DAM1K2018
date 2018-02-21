public class QuiereSalirException extends RuntimeException{
    public QuiereSalirException(){ }
    public QuiereSalirException(String cadena){
        super(cadena);
    }
}

public class MetodosMasMetodos {
    static void interior() {
        throw new MuyLiada("ALGO HORRIBLE PASÓ");
    }
    static  void mediano(){
        interior();
    }
    public static void main(String[] args) {
        try {
            mediano();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

}

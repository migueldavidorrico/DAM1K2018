public class PruebaEmpresa {
    public static void main(String[] args) {
        Empresa e1=new Empresa("Cárnicas Ilicitanas");
        System.out.println(e1.pagoImpuestos());
        Empresa e2=new Empresa("Mudanzas Pepe",5000,200);
        System.out.println(e2.pagoImpuestos());
        Empresa e3=new Empresa("Bancarrota S.A",50,3000);
        System.out.println(e3.pagoImpuestos());
        System.out.println("Se está pagando un " + Empresa.devuelveImpuesto() + "% de impuestos");
    }
}

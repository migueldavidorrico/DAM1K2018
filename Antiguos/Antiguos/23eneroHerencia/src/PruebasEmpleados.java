public class PruebasEmpleados {
    public static void main(String[] args) {
        Empleado[] plantilla={
            new Comercial("Ana",34,300,400),
            new Comercial("Bea",34,300,400),
            new Repartidor("Clara",21,300,"Murcia"),
            new Comercial("Delia",34,300,400),
            new Repartidor("Elena",18,300,"zona 3"),
            new Comercial("Flori",34,300,400),
            new Comercial("Gema",34,300,400),
            new Repartidor("Xabi",34,300,"Elche"),
            new Comercial("Yago",34,300,400),
            new Comercial("Zaca",34,300,400),
        };
        for (Empleado e :
                plantilla) {
            System.out.println(e);
            e.plus();
        }
    }
}

public class UtilidadPartidos {
    public static final Equipo REAL_MADRID=new Equipo("REAL MADRID","BERNABÉU",1980,"Madrid");
    public static final Equipo BARCELONA=new Equipo("BARCELONA","CAMP NOU",1970,"Barcelona");

    static{
        REAL_MADRID.anyadePortero(new Futbolista("Casillas",1,Posicion.PORTERO,23));
        REAL_MADRID.anyadeDefensa(new Futbolista("Ana",2,Posicion.DEFENSA,23));
        REAL_MADRID.anyadeDefensa(new Futbolista("Bea",3,Posicion.DEFENSA,23));
        REAL_MADRID.anyadeDefensa(new Futbolista("Clara",4,Posicion.DEFENSA,23));
        REAL_MADRID.anyadeDefensa(new Futbolista("Delia",5,Posicion.DEFENSA,23));
        REAL_MADRID.anyadeMedio(new Futbolista("Elena",6,Posicion.MEDIO,23));
        REAL_MADRID.anyadeMedio(new Futbolista("Flori",7,Posicion.MEDIO,23));
        REAL_MADRID.anyadeMedio(new Futbolista("Gema",8,Posicion.MEDIO,23));
        REAL_MADRID.anyadeMedio(new Futbolista("Xabi",9,Posicion.MEDIO,23));
        REAL_MADRID.anyadeDelantero(new Futbolista("Yago",10,Posicion.DELANTERO,23));
        REAL_MADRID.anyadeDelantero(new Futbolista("Zacarías",11,Posicion.DELANTERO,23));
        BARCELONA.anyadePortero(new Futbolista("Zubizarreta",1,Posicion.PORTERO,23));
        BARCELONA.anyadeDefensa(new Futbolista("Sergi",2,Posicion.DEFENSA,23));
        BARCELONA.anyadeDefensa(new Futbolista("Nadal",3,Posicion.DEFENSA,23));
        BARCELONA.anyadeDefensa(new Futbolista("Bogarde",4,Posicion.DEFENSA,23));
        BARCELONA.anyadeDefensa(new Futbolista("Prosinecky",5,Posicion.DEFENSA,23));
        BARCELONA.anyadeMedio(new Futbolista("Hagi",6,Posicion.MEDIO,23));
        BARCELONA.anyadeMedio(new Futbolista("Laudrup",7,Posicion.MEDIO,23));
        BARCELONA.anyadeMedio(new Futbolista("Reçarch",8,Posicion.MEDIO,23));
        BARCELONA.anyadeMedio(new Futbolista("Pelé",9,Posicion.MEDIO,23));
        BARCELONA.anyadeDelantero(new Futbolista("Kim",10,Posicion.DELANTERO,23));
        BARCELONA.anyadeDelantero(new Futbolista("Eva",11,Posicion.DELANTERO,23));
    }
}

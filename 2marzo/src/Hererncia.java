public class Hererncia {
    public static void main(String[] args) {
        persona[] p = {new pertiguista(), new oficinista()};


    }
}

class persona {
    void seHablar() {
    }
}

class pertiguista extends persona {
    void saltaPertiga() {
    }
}

class oficinista extends persona {
    void fichaOficina() {
    }
}

class ventrilocuo extends persona {
    @Override
    void seHablar() {
        System.out.println("Hablo or el muñeco");
    }
}
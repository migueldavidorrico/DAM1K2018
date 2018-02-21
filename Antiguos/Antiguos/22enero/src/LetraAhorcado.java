public class LetraAhorcado {
    private final char c;
    private boolean visible;
    LetraAhorcado(char c){
        this.c=c;
    }

    @Override
    public String toString() {
        return this.visible? String.valueOf(this.c) :"_";
    }

    public char getC() {
        return c;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public boolean esIgual(char c) {
        switch(this.c){
            case 'Ó':if(c=='O'){
                return true;
            }
            break;
            case 'Í':
            case 'Ï':
                if(c=='I'){
                return true;
            }
            break;
            default:if(this.c==c){
                return true;
            }
        }
        return false;
    }
}

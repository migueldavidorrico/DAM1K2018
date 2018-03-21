public class Usuario implements Comparable<Usuario> {
    String nombre;
    String password;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Usuario usuario = (Usuario) o;

        return nombre != null ? nombre.equals(usuario.nombre) : usuario.nombre == null;
    }

    @Override
    public int hashCode() {
        return nombre != null ? nombre.hashCode() : 0;
    }

    @Override
    public String toString() {
        return this.nombre + "/" + "*****" + this.password.substring(this.password.length() - 4);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Usuario(String nombre, String password) {
        this.nombre = nombre;
        this.password = password;
    }

    @Override
    public int compareTo(Usuario o) {
        return this.nombre.compareToIgnoreCase(o.nombre);
    }
}

public class NodoBST {

    public int     codigoICA;
    public String  nombreFinca;
    public String  municipio;
    public NodoBST izquierdo;
    public NodoBST derecho;

    public NodoBST(int codigoICA, String nombreFinca, String municipio) {
        this.codigoICA   = codigoICA;
        this.nombreFinca = nombreFinca;
        this.municipio   = municipio;
        this.izquierdo   = null;
        this.derecho     = null;
    }

    @Override
    public String toString() {
        return "Nodo[" + codigoICA + " | " + nombreFinca + " | " + municipio + "]";
    }
}
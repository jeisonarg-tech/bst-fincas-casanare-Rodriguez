public class ArbolBST {

    private NodoBST raiz;

    public ArbolBST() {
        this.raiz = null;
    }

    // ── Insercion ────────────────────────────────────────────
    public void insertar(int codigoICA, String nombreFinca, String municipio) {
        raiz = insertarRecursivo(raiz, codigoICA, nombreFinca, municipio);
    }

    private NodoBST insertarRecursivo(NodoBST nodo, int codigo, String nombre, String municipio) {
        if (nodo == null) {
            return new NodoBST(codigo, nombre, municipio);
        }
        if (codigo < nodo.codigoICA) {
            nodo.izquierdo = insertarRecursivo(nodo.izquierdo, codigo, nombre, municipio);
        } else if (codigo > nodo.codigoICA) {
            nodo.derecho = insertarRecursivo(nodo.derecho, codigo, nombre, municipio);
        } else {
            System.out.println("Codigo " + codigo + " ya existe. Actualizando datos.");
            nodo.nombreFinca = nombre;
            nodo.municipio   = municipio;
        }
        return nodo;
    }

    // ── Busqueda ─────────────────────────────────────────────
    public NodoBST buscar(int codigoICA) {
        return buscarRecursivo(raiz, codigoICA);
    }

    private NodoBST buscarRecursivo(NodoBST nodo, int codigo) {
        if (nodo == null || nodo.codigoICA == codigo) return nodo;
        if (codigo < nodo.codigoICA) return buscarRecursivo(nodo.izquierdo, codigo);
        return buscarRecursivo(nodo.derecho, codigo);
    }

    // ── PreOrden: Raiz -> Izquierdo -> Derecho ───────────────
    public void preOrden() {
        System.out.print("PreOrden  [Raiz->Izq->Der]: ");
        preOrdenRecursivo(raiz);
        System.out.println();
    }

    private void preOrdenRecursivo(NodoBST nodo) {
        if (nodo != null) {
            System.out.print(nodo.codigoICA + " ");
            preOrdenRecursivo(nodo.izquierdo);
            preOrdenRecursivo(nodo.derecho);
        }
    }

    // ── InOrden: Izquierdo -> Raiz -> Derecho ────────────────
    public void inOrden() {
        System.out.print("InOrden   [Izq->Raiz->Der]: ");
        inOrdenRecursivo(raiz);
        System.out.println();
    }

    private void inOrdenRecursivo(NodoBST nodo) {
        if (nodo != null) {
            inOrdenRecursivo(nodo.izquierdo);
            System.out.print(nodo.codigoICA + " ");
            inOrdenRecursivo(nodo.derecho);
        }
    }

    // ── PostOrden: Izquierdo -> Derecho -> Raiz ──────────────
    public void postOrden() {
        System.out.print("PostOrden [Izq->Der->Raiz]: ");
        postOrdenRecursivo(raiz);
        System.out.println();
    }

    private void postOrdenRecursivo(NodoBST nodo) {
        if (nodo != null) {
            postOrdenRecursivo(nodo.izquierdo);
            postOrdenRecursivo(nodo.derecho);
            System.out.print(nodo.codigoICA + " ");
        }
    }

    // ── Utilidades ───────────────────────────────────────────
    public int altura() { return calcularAltura(raiz); }

    private int calcularAltura(NodoBST nodo) {
        if (nodo == null) return 0;
        return 1 + Math.max(calcularAltura(nodo.izquierdo), calcularAltura(nodo.derecho));
    }

    public int contarNodos() { return contarRecursivo(raiz); }

    private int contarRecursivo(NodoBST nodo) {
        if (nodo == null) return 0;
        return 1 + contarRecursivo(nodo.izquierdo) + contarRecursivo(nodo.derecho);
    }
}
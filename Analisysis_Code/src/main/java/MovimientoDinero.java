public class MovimientoDinero {
    //Atributos
    private int monto;
    private boolean tipo; //Donde False: Es un movimiento negativo y True: Es un movimiento positivo
    private String conceptoMovimiento;
    private Empleado usuario; // Usuario es un objeto de la clase empleado

    //Constructor
    public MovimientoDinero(int monto, boolean tipo, String conceptoMovimiento, Empleado usuario) {
        this.monto = monto;
        this.tipo = tipo;
        this.conceptoMovimiento = conceptoMovimiento;
        this.usuario = usuario;
    }
    //Getter y Setters

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }



    public String getConceptoMovimiento() {
        return conceptoMovimiento;
    }

    public void setConceptoMovimiento(String conceptoMovimiento) {
        this.conceptoMovimiento = conceptoMovimiento;
    }

    public Empleado getUsuario() {
        return usuario;
    }

    public void setUsuario(Empleado usuario) {
        this.usuario = usuario;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    public boolean isTipo() {
        return tipo;
    }

    //Metodo toString

    @java.lang.Override
    public java.lang.String toString() {
        return "MovimientoDinero{" +
                "monto=" + monto +
                ", tipo=" + tipo +
                ", conceptoMovimiento='" + conceptoMovimiento + '\'' +
                ", usuario=" + usuario +
                '}';
    }
}

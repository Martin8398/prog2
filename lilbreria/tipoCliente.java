package lilbreria;

public enum tipoCliente {
    NORMAL(0.10),
    FRECUENTE(0.15),
    SOCIO(0.30);

    private double descuento;
    TipoCliente(double d) { this.descuento = d; }
    public double getDescuento() { return descuento; }
}

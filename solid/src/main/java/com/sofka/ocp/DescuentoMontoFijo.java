package com.sofka.ocp;

class DescuentoMontoFijo implements Descuento {
    private double montoFijo;

    public DescuentoMontoFijo(double montoFijo) {
        this.montoFijo = montoFijo;
    }

    @Override
    public double aplicarDescuento(double precio) {
        return precio - montoFijo;
    }
}
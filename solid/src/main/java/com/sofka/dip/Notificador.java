package com.sofka.dip;

class Notificador {
    private ServicioNotificacion servicio;

    public Notificador(ServicioNotificacion servicio) {
        this.servicio = servicio;
    }

    public void enviarNotificacion(String mensaje) {
        servicio.enviar(mensaje);
    }
}
package com.sofka.lsp;


import java.util.Arrays;

public class CalculadoraArea {
    public double calcularAreaTotal(Forma[] formas) {

        return Arrays.stream(formas)
                .map(Forma::calcularArea)
                .reduce(Double::sum)
                .orElseThrow(RuntimeException::new);

    }
}

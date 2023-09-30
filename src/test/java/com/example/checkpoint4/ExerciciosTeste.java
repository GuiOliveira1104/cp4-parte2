package com.example.checkpoint4;

import com.example.checkpoint4.Controller.ExerciciosController;
import com.example.checkpoint4.Entity.Exercicios;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;

public class ExerciciosTeste {

    ExerciciosController exe = new ExerciciosController();

    @Test
    public void TestePalindromoSucesso() {

        String resultadoEsperado = "Palíndromo!";

        String frase = "Arara";

        Assertions.assertEquals(resultadoEsperado, exe.isPalindromo(frase));

    }

    @Test
    public void TestePalindromoFalha() {

        String resultadoNaoEsperado = "Não é Palíndromo!";

        String frase = "Lala";

        Assertions.assertEquals(resultadoNaoEsperado, exe.isPalindromo(frase));

    }

    @Test
    public void TesteNumeroUnicoSucesso() {

        Integer resultadoEsperado = 0;

        int[] lista = {2, 1, 2, 1, 0};

        Assertions.assertEquals(resultadoEsperado, exe.achaNumero(lista));
    }

    @Test
    public void TesteNumeroUnicoFalha() {

        Integer resultadoEsperado = 4;

        int[] lista = {2, 1, 2, 1};

        Assertions.assertEquals(resultadoEsperado, exe.achaNumero(lista));
    }

}

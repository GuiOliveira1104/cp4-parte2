package com.example.checkpoint4.Controller;

import com.example.checkpoint4.Entity.Exercicios;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@RestController
@RequestMapping("/exercicio4")

public class ExerciciosController {

    @PostMapping("/is-palindrome")
    public String isPalindromo(@RequestBody String entrada) {
        String entradaNormal = entrada;
        String entradaInvertida = "";

        entradaNormal = entradaNormal.replaceAll(" ", "");

        entradaNormal = entradaNormal.replaceAll("[,.!?]", "");

        entradaNormal = entradaNormal.toLowerCase();

        for (int i = entradaNormal.length() - 1; i >= 0; --i) {
            entradaInvertida += entradaNormal.charAt(i);
        }

        if (entradaNormal.equals(entradaInvertida)) {
            return "Palíndromo!";
        }
        return "Não é Palíndromo!";

    }

    @PostMapping("/single-number")
    public int achaNumero(@RequestBody int[] nums) {
        Arrays.sort(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
        for (int i = 0; i < nums.length - 1; i += 2) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return 0;
    }

}

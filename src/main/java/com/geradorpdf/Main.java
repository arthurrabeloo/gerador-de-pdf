package com.geradorpdf;

import com.geradorpdf.modelo.Pessoa;
import com.geradorpdf.servico.PDF;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> lista = Arrays.asList(
                new Pessoa("Arthur", 20),
                new Pessoa("Marcus", 22)
        );

        PDF pdfService = new PDF();
        pdfService.gerarRelatorio(lista, "relatorio.pdf");
    }
}

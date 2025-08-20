package com.geradorpdf.servico;

import com.geradorpdf.modelo.Pessoa;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;

import java.io.IOException;
import java.util.List;

public class PDF {

    public void gerarRelatorio(List<Pessoa> pessoas, String caminhoArquivo) {
        try {
            PdfWriter writer = new PdfWriter(caminhoArquivo);
            PdfDocument pdf = new PdfDocument(writer);
            Document document = new Document(pdf);

            document.add(new Paragraph("Relatório de Pessoas")
                    .setFontSize(20)
                    .setBold());

            document.add(new Paragraph("Lista gerada automaticamente:"));

            float[] colunas = {150F, 50F, 100F}; // Nome | Idade | Time
            Table table = new Table(colunas);

            table.addCell("Nome");
            table.addCell("Idade");
            table.addCell("Time");

            for (Pessoa p : pessoas) {
                table.addCell(p.getNome());
                table.addCell(String.valueOf(p.getIdade()));
                table.addCell(p.getTime());
            }

            document.add(table);
            document.close();

            System.out.println("PDF gerado em: " + caminhoArquivo);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

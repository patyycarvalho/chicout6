package br.com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {
    public static void main(String[] args) {
        String csvFile = "dados.csv";
        String line;
        String csvSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                // Dividindo a linha em campos usando a vírgula como separador
                String[] fields = line.split(csvSplitBy);
                
                // Exibindo cada campo no console
                for (String field : fields) {
                    System.out.print(field + " ");
                }
                System.out.println(); // Nova linha para separar as linhas do arquivo
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonatual;

import com.google.gson.GsonBuilder;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author supero
 */
public class JsonAtual {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String line = "";
        String delemiter = ";";
        
        BufferedReader reader = new BufferedReader(new InputStreamReader
                (new FileInputStream("C:\\Users\\supero\\Desktop\\docs\\movielist.csv")));
        
        BufferedOutputStream stream = new BufferedOutputStream
                (new FileOutputStream("C:\\Users\\supero\\Desktop\\docs\\arquivo.json"));
        
        line = reader.readLine().toString();
        while ((line = reader.readLine()) != null) {
                String[] filme = line.split(delemiter);
                Filmes filmes = new Filmes(filme[0], filme[1], filme[2], filme[3], filme[4]); 
                System.out.println("Filme: " + new GsonBuilder().setPrettyPrinting().create().toJson(filme));
                String gson = new GsonBuilder().setPrettyPrinting().create().toJson(filme);
                stream.write(gson.getBytes());               
                stream.flush();  
                
        }        
    }
}

import java.io.*;

public class Main {

    public static void main(String[] args) {
        String fileInput = "report.txt";
        String fileOutputCifrato = "criptato.txt";
        String fileOutputDecifrato = "decriptato.txt";

        CriptaDecripta criptaDecripta = new CriptaDecripta();
        criptaDecripta.criptaContenuto(fileInput, fileOutputCifrato);
        criptaDecripta.decriptaContenuto(fileOutputCifrato, fileOutputDecifrato);
        criptaDecripta.stampaContenuto(fileOutputDecifrato);
    }
}
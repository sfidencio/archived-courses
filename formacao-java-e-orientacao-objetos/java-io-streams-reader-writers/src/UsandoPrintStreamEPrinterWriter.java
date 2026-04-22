import java.io.*;

public class UsandoPrintStreamEPrinterWriter {

    public static void main(String[] args) throws IOException {
        //Mais antigo, utilizava este..
        PrintStream ps = new PrintStream(new File("usando-ps.txt"));
        ps.println("Ola");


        PrintWriter pw = new PrintWriter("usando-pw.txt");
        pw.println("Obrigado");
        pw.println();
        pw.print(true);
        pw.close();

        PrintWriter pw2 = new PrintWriter("usando-pw2.txt");
        BufferedWriter bw = new BufferedWriter(pw2);
        bw.write("Teste");
        bw.newLine(); //System.lineSeparator();
        bw.close();
        pw2.close();
    }
}

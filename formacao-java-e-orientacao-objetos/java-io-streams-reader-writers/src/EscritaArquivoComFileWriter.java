import java.io.*;
import java.util.logging.Logger;

public class EscritaArquivoComFileWriter {
    public static Logger logger = Logger.getLogger(EscritaArquivoComFileWriter.class.getName());

    public static void main(String[] args) throws IOException {
        /*OutputStream fos = new FileOutputStream("distro-linux-saida.txt");
        Writer osw = new OutputStreamWriter(fos);
        Writer brw = new BufferedWriter(osw);*/
        FileWriter fileWriter = new FileWriter("distro-linux-saida-file-writer.txt");
        fileWriter.write("001" + System.lineSeparator()); //lineSeparator pega de acordo com SO se \n\r(windows) ou \n (unix)
        fileWriter.write("002" + System.lineSeparator());
        fileWriter.write("003" + System.lineSeparator());
        fileWriter.write(System.lineSeparator());
        fileWriter.flush();
        fileWriter.close();

        FileWriter fileWriter2 = new FileWriter("distro-linux-saida-file-writer2.txt");
        fileWriter2.write("001\n");
        fileWriter2.write("002\n");
        fileWriter2.write("003\n");
        //fileWriter2.write(System.lineSeparator());
        fileWriter2.flush();
        fileWriter2.close();


        FileWriter fileWriter3= new FileWriter("distro-linux-saida-file-writer3.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter3);
        bufferedWriter.write("001\n");
        bufferedWriter.newLine();
        bufferedWriter.write("002\n");
        bufferedWriter.write("003\n");
        bufferedWriter.newLine();
        //fileWriter2.write(System.lineSeparator());
        bufferedWriter.flush();
        bufferedWriter.close();


        FileReader fileReader = new FileReader("distro-linux-saida-file-writer.txt");



    }
}

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
 
 public class ReadFile {
 
    public static void main(String[] args) throws IOException {
        String file = "C:\Users\User\Downloads\679549712.log";
         
        // построчно читаем с файла с помощью BufferedReader
        readUsingBufferedReader(file);
        
    }
	private static void readUsingScanner(String fileName) throws IOException {
        Path path = Paths.get(fileName);
        Scanner scanner = new Scanner(path);
        //читаем построчно
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
        }
    }
 }


		
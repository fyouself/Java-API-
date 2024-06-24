package Hw2;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class Lesson {
    public static void main(String[] args) throws IOException {

        Path path = Path.of("new_file.txt");
        if (Files.notExists(path)){
            Files.createFile(path);
        }
        try {
            OutputStream os = Files.newOutputStream(path);
            String hi = " Hello world";
            byte[] hi_byte = hi.getBytes();
            os.write(hi_byte);
            os.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try{
            InputStream inputStream = Files.newInputStream(path);
            byte [] allByte =inputStream.readAllBytes();
            System.out.println(new String(allByte));

        } catch (IOException exception){
            System.out.println("Произошла ошибка");
        }


    }

}

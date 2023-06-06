import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String path;
        File file;

        int counter = 0;
        boolean fileExists;
        boolean isDirectory;

        while (true) {
            path = new Scanner(System.in).nextLine();
            file = new File(path);
            fileExists = file.exists();
            isDirectory = file.isDirectory();

            if (!fileExists) {
                System.out.println("Указанный файл не существует");
                continue;
            } else if (isDirectory) {
                System.out.println("Указан путь до папки. Нужно указать путь до файла");
                continue;
            } else {
                System.out.println("Путь указан верно");
                counter++;
                System.out.println("Это файл №" + counter);
            }
        }
    }
}
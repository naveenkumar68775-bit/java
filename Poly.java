import java.io.File;
import java.io.IOException;
class Poly {
    public static void main(String[] args) {
        try {
            File f = new File("Baby.java");

            if (f.createNewFile()) {
                System.out.println("File created");
            } else {
                System.out.println("Already Exists");
            }
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

class LecturaNumeros extends BufferedReader {
    
    public LecturaNumeros() {
        super(new InputStreamReader(System.in));
    }
    
    public LecturaNumeros(Reader r) {
        super(r);
    }
    
    public int readInt() throws IOException {
        String line = super.readLine();
        return Integer.parseInt(line.trim());
    }
    
    public int readInt(String mensaje) throws IOException {
        System.out.print(mensaje);
        return readInt();
    }
    
    public Integer readInteger() throws IOException {
        return readInt();
    }
    
    public double readDouble() throws IOException {
        String line = super.readLine();
        return Double.parseDouble(line.trim());
    }
    
    public double readDouble(String mensaje) throws IOException {
        System.out.print(mensaje);
        return readDouble();
    }
}

public class TestLecturaNumeros {
    public static void main(String[] args) {
        try {
            LecturaNumeros reader = new LecturaNumeros();
            
            System.out.println("Ingresa 2 enteros:");
            int int1 = reader.readInt();
            int int2 = reader.readInt();
            
            System.out.println("ingresa un Integer:");
            Integer integer = reader.readInteger();
            
            System.out.println("Ingresa un double:");
            double double1 = reader.readDouble();
            
            System.out.println("Ingresa un double:");
            Double double2 = reader.readDouble();
            
            System.out.println("enteros: " + int1 + ", " + int2);
            System.out.println("Integer: " + integer);
            System.out.println("Double: " + double1);
            System.out.println("Double: " + double2);
            
        } catch (IOException e) {
            System.out.println("Error al leer la entrada" + e.getMessage());
        }
    }
}


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class inputfilegenerator {
public static void main(String[] args) throws IOException{
	
    PrintWriter writer = new PrintWriter("C:/Users/tfouda.CS.001/Desktop/h.txt", "UTF-8");
    for ( int i = 0; i<7680;i++){
    	Random rn = new Random();
    	int n = 1440 - 1 + 1;
    	int k = rn.nextInt() % n;
     writer.println(Math.abs(1+k));
    }
}
}
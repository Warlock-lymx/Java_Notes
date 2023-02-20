package learning.properties;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Properties1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\javaPractice\\src\\learning\\properties\\mysql.properties"));
        String line = "";
        while ((line = br.readLine()) != null) {
            String[] words = line.split("=");
            System.out.println(words[0] + "的值为" + words[1]);
        }
        br.close();
    }
}

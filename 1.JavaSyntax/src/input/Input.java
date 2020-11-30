package input;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Input {
    InputStream inputStream = System.in;
    Reader inputStreamReader = new InputStreamReader(inputStream);
    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

   // String name = bufferedReader.readLine();
    //String sAge = bufferedReader.readLine();
   //int nAge = Integer.parseInt(sAge);
}

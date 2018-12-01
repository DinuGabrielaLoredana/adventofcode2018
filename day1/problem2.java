import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
class Main {


  private static final String FILENAME = "puzzle_input.txt";

  public static void main(String[] args)  {
     ArrayList<Integer> lista = new ArrayList<Integer>();
     int ok = 0;

    BufferedReader br = null;
		FileReader fr = null;
    int x=0;
    	String sCurrentLine;

	while(ok==0){
		try {
			fr = new FileReader(FILENAME);
				br = new BufferedReader(fr);

				while ((sCurrentLine = br.readLine()) != null) {
			x+=Integer.parseInt(sCurrentLine);
			if(lista.size()!=0){
			  if (lista.contains(x)){
				ok=1;
				System.out.println(x);
				break;
			  }
			}		
			lista.add(x);
			

				}

			} catch (IOException e) {

				e.printStackTrace();

			} finally {

				try {

					if (br != null)
						br.close();

					if (fr != null)
						fr.close();

				} catch (IOException ex) {

					ex.printStackTrace();

				}

			}
	}
  }


}
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
class Main {
  private static final String FILENAME = "puzzle_input.txt";
  public static void main(String[] args)  {
    BufferedReader br = null;
		FileReader fr = null;
    int x=0;
    String sCurrentLine;

	
		try {
			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);

			while ((sCurrentLine = br.readLine()) != null) {
			x+=Integer.parseInt(sCurrentLine);
			}		
      System.out.println(x);
	
		}
    catch (IOException e) {
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
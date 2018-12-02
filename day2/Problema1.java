

import java.io.BufferedReader;

import java.io.FileReader;

import java.io.IOException;

class Problema1 {

  public static void main(String[] args) {
	String box;
	int id_box;
	int two_same_letter_box = 0;
	int three_same_letter_box = 0;
	int sum_two_same_letter_box = 0;
	int sum_three_same_letter_box = 0;
    BufferedReader br = null;
    FileReader fr = null;
		try {
			fr = new FileReader("input.txt");
			br = new BufferedReader(fr);
			while ((box = br.readLine()) != null) {
		          for (char i = 'a'; i <= 'z'; i++) {
		        	  String j = ""+i;
			          id_box =box.length() - box.replace(j, "").length();
			          if (id_box == 2) {
			        	  two_same_letter_box = 1;	
			          }
			          if (id_box == 3) {
			        	  three_same_letter_box = 1;
			          }
		          }		
		          sum_three_same_letter_box += three_same_letter_box;		
		          sum_two_same_letter_box += two_same_letter_box;		
		          three_same_letter_box = 0;		
		          two_same_letter_box = 0;
			}		
		}catch (IOException e) {
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
        System.out.println(sum_three_same_letter_box * sum_two_same_letter_box);
  }




}
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Maze 
{
	public static void main(String [] args) {
		System.out.print("Enter the name of the file: ");
		Scanner one = new Scanner(System.in);
		String two = one.nextLine();
        // The name of the file to open.
        String fileName = two;

        // This will reference one line at a time
        String line = null;
        char[][] maze1;
        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }   
            
            
            BufferedReader brTest = new BufferedReader(new FileReader(two));
            Scanner lineOfFile = new Scanner(brTest.readLine());
            int rows = lineOfFile.nextInt();
            int cols = lineOfFile.nextInt();
            int startRow = lineOfFile.nextInt();
            int startCol = lineOfFile.nextInt();
            int endRow = lineOfFile.nextInt();
            int endCol = lineOfFile.nextInt();
            
            maze1 = new char[rows][cols];
            
            
            int line1 = 0;
            String readline;
            while((readline = brTest.readLine()) != null) {
                char[] charArr = readline.toCharArray();
                maze1[line1] = charArr;
                line1++;
            }
            System.out.println("Printing 2D array: ");
            for (int row = 0; row < rows; row++) 
    		{
    			  for(int column = 0; column < cols; column++)
    			  {
    			      System.out.print(maze1[row][column]);
    			  }
    			  System.out.println();
    		}
            bufferedReader.close();
            
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
    }

}

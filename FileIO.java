// Required Libraries 

import javax.swing.JOptionPane;
import java.io.*;



//Start of the class FileManagement

public class FileIO {

  //Executable: Main method:
  
  
    public static void main(String[] args) {
    
     //Variable Section:
     
     
        String inputSentence = JOptionPane.showInputDialog("Please enter a sentence:");
        File outputFile = new File("output_sentence.txt");
        try {
            FileWriter writer = new FileWriter(outputFile);
            writer.write(inputSentence);   //Input Section:
            writer.close();
            JOptionPane.showMessageDialog(null, "Sentence was saved to a file named output_sentence.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "An error occurred while saving to file.");
            e.printStackTrace();
        }
        
        
                //Output Section

        try {
            FileReader reader = new FileReader(outputFile);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String outputSentence = bufferedReader.readLine();
            bufferedReader.close();
            JOptionPane.showMessageDialog(null, "The sentence you entered was: " + outputSentence);
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "The output sentence file was not found.");
            e.printStackTrace();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "An error occurred while reading from file.");
            e.printStackTrace();
        }
    }
}

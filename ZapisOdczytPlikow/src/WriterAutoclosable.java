

	import java.io.BufferedWriter;
	import java.io.FileWriter;
	import java.io.IOException;
	 
	public class WriterAutoclosable {
	    public static void main(String[] args) {
	        String fileName = "testFile.txt";
	        try(
	            FileWriter fileWriter = new FileWriter(fileName, true);
	            BufferedWriter writer = new BufferedWriter(fileWriter);
	        ) {
	            writer.write("Bolek");
	            writer.newLine();
	            writer.write("Lolek");
	            writer.newLine();
	            writer.write("Karolek");
	            writer.newLine();
	        } catch(IOException e) {
	            e.printStackTrace();
	        }
	    }
	}
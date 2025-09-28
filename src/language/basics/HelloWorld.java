package language.basics;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Logger;

public class HelloWorld {

	public static void main(String[] args) throws FileNotFoundException {
		// My First Java program to print a line
		
		System.out.println("\u001B[1m" + "Hello World!" + "\u001B[0m");

		System.out.println("Hello World!");
		
		Logger logger = Logger.getLogger("ai");
		
		logger.info("This is just an info");
		logger.warning("This is a warning");
		
		
		//Print the logs in the text file to export the log file
		
		PrintWriter logs = new PrintWriter("C:\\AutomationTraining\\JavaTraining\\Logs.txt");
		logs.println("This is just an info");
		logs.println("This is a warning");
		logs.println("This is an error");
		logs.close();

		
	}	

}

package utilities;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class CSV {
	public static List<String[]> read(String file){
		List<String[]> data = new LinkedList<String[]>();
		String dataRow;
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			try {
				while((dataRow=br.readLine())!=null) {
					String[] dataRecords = dataRow.split(",");
					data.add(dataRecords);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
	} catch(FileNotFoundException e) {
		System.out.println("Filenot found");
		e.printStackTrace();
	}
		return data;
		
}
}

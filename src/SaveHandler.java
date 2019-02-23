import java.io.*;

public class SaveHandler {
	
	SaveHandler() {
		
	}
	
	public void saveSchedule(Schedule s) {
		try {
			FileOutputStream f = new FileOutputStream("test.ser");
			ObjectOutputStream o = new ObjectOutputStream(f);
			
			o.writeObject(s);
			o.close();
			f.close();
			
		}
		catch(Exception e) {
			System.out.println("Save Failed: " + e);
		}
	}
	
	public Schedule loadSchedule() {
		try {
			FileInputStream f = new FileInputStream("test.ser");
			ObjectInputStream i = new ObjectInputStream(f);
			
			
			Schedule tmp = (Schedule)i.readObject();
			i.close();
			f.close();
			return tmp;
			
		}
		catch(Exception e) {
			System.out.println("Load Failed : " + e);
			return null;
		}
	}
	
}

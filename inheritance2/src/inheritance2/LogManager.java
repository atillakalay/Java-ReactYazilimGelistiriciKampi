package inheritance2;

public class LogManager {

	public void Log(int logType) {
		if (logType == 1) {
			System.out.println("Database'e loglandý.");
		}
		if (logType == 2) {
			System.out.println("File loglandý.");
		}
		if (logType == 3) {
			System.out.println("Email'e loglandý.");
		}
	}

}

//1- Database
//2- File
//3- Email

package Lab8;

public class FileProgram {
public static void main (String args[]) {
	String sourceFilepath="E:\\FPArray1.java";
	String targetFilepath="D:\\FPArray1.txt";
	CopyDataThread cp=new CopyDataThread(sourceFilepath,targetFilepath);
 cp.start();
	
}
}

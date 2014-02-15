package easy;
//Print the size of a file in bytes.
import java.io.File;

public class FileSize {
public static void main(String[]args){
	File file = new File("E:/JAVA_Ecllipse/MY_ECLIPES/CodeEval/doc/reverseword");
	long size = file.length();
	System.out.println("size of the file in byte is  is : "+size);
}
}

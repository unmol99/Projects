package comp_decomp_methods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class compress {
	public static void method(File file) throws IOException 
	{
		String fileDirectory = file.getParent();// path where compressed file will be stored i.e. parent of file selected for compression
		FileInputStream fis = new FileInputStream(file);// read the bits of input file
		FileOutputStream fos = new FileOutputStream(fileDirectory+ "/CompressedFile.gz"); // to write the bits of file on target directory
		GZIPOutputStream gzip = new GZIPOutputStream(fos);// whatever bits we are writing in output stream must be compressed-> compression of written bits
		
		byte[] buffer = new byte[1024];
		int len;
		
		while((len = fis.read(buffer))!=-1)// fis.read(buffer)-> read bits of file using file input stream and store it it buffer byte array
		{
			gzip.write(buffer, 0, len);// write the buffer array(which has bits)starting from 0 to its length(so that no bits are lost) in gzip type
		}
		gzip.close();
		fos.close();
		fis.close();
		}
	
	public static void main(String[] args) throws IOException
	{
		File path = new File("C:\\Users\\anmol\\Downloads\\comp-decomp\\Video_PDP");// path of file to be compressed
		method(path);
	}

}

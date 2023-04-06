package comp_decomp_methods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class decompress {
	
	public static void method(File file) throws IOException 
	{
		String fileDirectory = file.getParent();// path where compressed file will be stored i.e. parent of file selected for compression
		FileInputStream fis = new FileInputStream(file);// read the bits of compressed file
		GZIPInputStream gzip = new GZIPInputStream(fis);// makes sure compressed bytes are read properly and stored in gzip var
		FileOutputStream fos = new FileOutputStream(fileDirectory+"decompressedFile");// write decompressed bits as file name
		
		byte[] buffer = new byte[1024];
		int len;
		
		while((len = gzip.read(buffer))!= -1)// read all the compressed bits of compressed file and store it in buffer till bit is not -1 means file is read completely
		{
			fos.write(buffer, 0, len); // write the already read file as normal(uncompressed) file so fos not gzip
		}
		gzip.close();
		fis.close();
		fos.close();
	}
	
	public static void main(String[] args) throws IOException
	{
		File path = new File("C:\\Users\\anmol\\Downloads\\comp-decomp\\ompressedFile.gz");// path of file to be compressed
		method(path);
	}

}


package fileio;

import java.io.*;

/**
 * FileIO
 * 
 * File I/O for BioSearch
 * 
 * @author Brett Long
 * @version (4/5/2013)
 */
public class FileIO {

	// ---------------------------------------------------------------------
	// Declarations
	// ---------------------------------------------------------------------
	private BufferedReader reader;
	private BufferedWriter writer; // the writer object
	private File inFile;
	private File outFile;

	// private String fileName;

	/**
	 * constructor
	 * 
	 * @throws FileNotFoundException
	 */
	public FileIO(String inName) throws FileNotFoundException {
		String outName;

		if (inName != null) {
			// create temp file for output
			if (inName.indexOf(".") > -1)
				outName = inName.substring(0, inName.lastIndexOf(".")) + ".txt";
			else
				outName = inName + ".txt";
			// instantiate File objects
			inFile = new File(inName);
			outFile = new File(outName);

			// instantiate File reader and writer
			reader = new BufferedReader(new FileReader(inFile));
		} // end if
	}

	/**************************** Public Methods *************************/

	public void read() throws IOException {
		String line;
		while ((line = reader.readLine()) != null) {
			System.out.println(line);
		}
		reader.close();
	}

	/**
	 * closeWriter
	 * 
	 * close the files and rename the output file to the input file name
	 */
	public void closeWriter() throws IOException {
		writer.close();
		inFile.delete();
		outFile.renameTo(inFile);

	} // method closeWriter

	/**
	 * open the file writer
	 * 
	 * @return boolean
	 * @throws IOException
	 */
	public boolean openWriter() throws IOException {
		boolean canWrite = false;
		try {
			writer = new BufferedWriter(new FileWriter(outFile));
			canWrite = true;

		} // end try
		catch (IOException e) {
		}
		return canWrite;

	} // method openWriter

	/**
	 * write a line
	 * 
	 * @param String
	 */
	public void write(String s) throws IOException {
		writer.write(s + "\n");
	} // method write

} // class FileIO

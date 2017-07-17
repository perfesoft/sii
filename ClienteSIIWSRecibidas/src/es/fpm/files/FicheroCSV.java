package es.fpm.files;

import java.io.IOException;
import java.io.InputStreamReader;

import javax.servlet.http.Part;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import es.fpm.log.Log;

public class FicheroCSV {
	public List<CSVRecord> leeCSV(Part filePart, String separador){
		List<CSVRecord> parseado = null;
		try {
			CSVFormat fmt = CSVFormat.EXCEL.withDelimiter(';');
			CSVParser csvParser = new CSVParser(new InputStreamReader(filePart.getInputStream()),fmt);
			parseado = csvParser.getRecords();
			csvParser.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			Log.print(e.toString(), Log.ERROR);
		}
		return parseado;
	}

}

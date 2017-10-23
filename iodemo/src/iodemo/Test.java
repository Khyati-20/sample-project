package iodemo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.w3c.dom.ls.LSInput;

public class Test implements filepath{
	static ArrayList<Record> list = new ArrayList<>();
	static HashSet<String> hstatus = new HashSet<>();
//	final String LOCATION = "C:\\Users\\Deepak\\eclipse-workspace\\iodemo\\output\\";

	static void createFolder(File file) {
		if (!file.exists()) {
			file.mkdir();
		}

	}

	static void createFile(File file) throws IOException {

		if (!file.exists()) {
			file.createNewFile();
		}
	}

	void getData(ArrayList<Record> list, File in) throws IOException, ParseException {

		File[] fileList = in.listFiles();
		for (File file : fileList) {
			List<String> data = FileUtils.readLines(file);
			data.remove(0);
			for (String str : data) {
				Record robj = new Record();
				String lineRecord[] = str.split(",");
				robj.setId(Integer.parseInt(lineRecord[0]));
				robj.setFirstName(lineRecord[1]);
				robj.setLastName(lineRecord[2]);
				robj.setStatus(lineRecord[3]);
				robj.setGender(lineRecord[4]);
				robj.setDate(new SimpleDateFormat("dd-MM-yyyy").parse(lineRecord[5]));
				robj.setYear(Integer.parseInt(lineRecord[5].split("-")[0]));
				// System.out.println(lineRecord[5].split("-")[0]);

				list.add(robj);
				hstatus.add(lineRecord[3]);

			}

		}

	}

	void setData(Record robj) throws IOException {


		for (Record record : list) {

			if (!new File(record.getStatus()).exists()) {
			//	createFolder(new File( record.getStatus()));
				createFolder(new File(LOCATION+ record.getStatus()));
				
			}

			if (!new File(Integer.toString(record.getYear())).exists()) {
			//	createFile(new File( record.getStatus() + "\\" + Integer.toString(record.getYear())+".csv"));
				createFile(new File( LOCATION+record.getStatus() + "\\" + Integer.toString(record.getYear())+".csv"));
				}

		//	FileWriter fw=new FileWriter(record.getStatus() + "\\" + Integer.toString(record.getYear())+".csv",true);
			FileWriter fw=new FileWriter(LOCATION+ record.getStatus() + "\\" + Integer.toString(record.getYear())+".csv",true);
			
			BufferedWriter bfr=new BufferedWriter(fw);
			bfr.append(record.getId() +", "+record.getFirstName()+", "+record.getLastName()+" ,"+record.getStatus()+", "+record.getGender()+", "+record.getDate().getDate()+"-"+record.getDate().getMonth()+"- "+(record.getYear() ));
			bfr.newLine();
			bfr.flush();
			
			
		}

	}

	public static void main(String[] args) throws IOException, ParseException {

		File in = new File("input");
		File out = new File("output");
		createFolder(in);
		createFolder(out);

		Record robj = new Record();
		Test tobj = new Test();
		tobj.getData(list, in);

		list.sort(new Comparator<Record>() {

			@Override
			public int compare(Record o1, Record o2) {
				// TODO Auto-generated method stub
				return o1.getDate().compareTo(o2.getDate());
			}
		});

		tobj.setData(robj);

	}

}

package wc.exe;
 import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class fileUnit {
	public String ReadTextFile(String filePath) {
	    String data = "";
	    File file = new File(filePath);
	    BufferedReader reader = null;
	    try {
	        reader = new BufferedReader(new FileReader(file));
	        String tempString = null;
	        while ((tempString = reader.readLine()) != null) {
	            data = data + tempString+"\n";
	        }
	        reader.close();
	    } catch (IOException e) {
	        e.printStackTrace();
	    } finally {
	        if (reader != null) {
	            try {
	                reader.close();
	            } catch (IOException e1) {
	            }
	        }
	    }
	    return data;
	}

	public int ReadTextFile1(String filePath) {
	    String data = "";
	    int line=0;
	    File file = new File(filePath);
	    BufferedReader reader = null;
	    try {
	        reader = new BufferedReader(new FileReader(file));
	        String tempString = null;
	        while ((tempString = reader.readLine()) != null) {
	            data = data + tempString+"\n";
	            line++;
	        }
	        reader.close();
	    } catch (IOException e) {
	        e.printStackTrace();
	    } finally {
	        if (reader != null) {
	            try {
	                reader.close();
	            } catch (IOException e1) {
	            }
	        }
	    }
	    return line;
	}

	public String ReadTextFile2(String filePath) {
	    String data = "";
	    int line=0;
	    int nullline=0;
	    int commentline=0;
	    int codeline=0;
	    boolean temp=false;
	    File file = new File(filePath);
	    BufferedReader reader = null;
	    try {
	        reader = new BufferedReader(new FileReader(file));
	        String tempString = null;
	        while ((tempString = reader.readLine()) != null) {
	            data = data + tempString+"\n";
	            line++;
	            if(tempString.length()==0) {
	            	nullline++;
	            }
	            tempString=tempString.trim();
	            if(tempString.startsWith("/*")&&!tempString.endsWith("*/")) {
	            	commentline++;
	            	temp=true;
	            }else if(temp) {
	            	commentline++;
	            	if(tempString.endsWith("*/")) {
	            		temp=false;
	            	}
	            }else if(tempString.startsWith("//")) {
	            	commentline++;
	            }else if(tempString.startsWith("/*")&&tempString.endsWith("*/")) {
	            	commentline++;
	            }
	            codeline=line-commentline-nullline;
	        }
	        System.out.println("空行数:" + nullline);
	        System.out.println("注释行数:" + commentline);
	        System.out.println("代码行数:" + codeline);        
	        reader.close();
	    } catch (IOException e) {
	        e.printStackTrace();
	    } finally {
	        if (reader != null) {
	            try {
	                reader.close();
	            } catch (IOException e1) {
	            }
	        }
	    }
	    return data;
	}
}

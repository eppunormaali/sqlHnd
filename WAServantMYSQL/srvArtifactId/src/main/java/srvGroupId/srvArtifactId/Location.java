package srvGroupId.srvArtifactId;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;

import org.json.simple.JSONObject;

public class Location {
	public void getdata() {
	JSONParser parser = new JSONParser();
	String huomiot = null;
	try {
    Object obj = parser.parse(new FileReader("/home/seppo/test.json"));
    System.out.println(obj);
    JSONObject jsonObject = (JSONObject) obj;
    
    JSONObject childjsonObject = (JSONObject)jsonObject.get("sessiodata");
    System.out.println(childjsonObject.toString());
    
    String huiom = (String) childjsonObject.get("huomio");
    System.out.println(huiom);
    
    JSONObject aloitus = (JSONObject)childjsonObject.get("session_aloitus");
    System.out.println(aloitus.toString());
	}
    catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
   } catch (ParseException e) {
      e.printStackTrace();
   }

	} 
	private static void parseEmployeeObject(JSONObject employee)
    {
        //Get employee object within list
        JSONObject employeeObject = (JSONObject) employee.get("employee");
         
        //Get employee first name
        String firstName = (String) employeeObject.get("firstName");   
        System.out.println(firstName);
         
        //Get employee last name
        String lastName = (String) employeeObject.get("lastName"); 
        System.out.println(lastName);
         
        //Get employee website name
        String website = (String) employeeObject.get("website");   
        System.out.println(website);
    }
	
}

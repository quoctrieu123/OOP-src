/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javausertable;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author User
 */
 
public class senatatoserver 
{  
    public JSONArray printserver(String input,String type){
    try {
            
            URL url = new URL("http://localhost:5000/data"); // URL của API server Flask
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setDoOutput(true);

            // Tạo đối tượng JSON để gửi dữ liệu
            JSONObject jsonInput = new JSONObject();
            jsonInput.put("input", input);
            jsonInput.put("type", type);

            OutputStream os = conn.getOutputStream();
            byte[] inputBytes = jsonInput.toString().getBytes("utf-8");
            os.write(inputBytes, 0, inputBytes.length);
            os.flush();
            os.close();

            if (conn.getResponseCode() != HttpURLConnection.HTTP_OK) {
                throw new RuntimeException("Failed: HTTP error code: " + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
            
            String output;
            String result="";
            while ((output = br.readLine()) != null) {
            	result+=output;
            }
            String jsonString= result;
            try
            {
		JSONParser jsonParser = new JSONParser();
		JSONArray jsonArray = (JSONArray) jsonParser.parse(jsonString);
		return jsonArray;
             
             
            }
		
		
		

		
            catch (ParseException e) 
            {
                e.printStackTrace();
                return null;
            }
        }
    catch (Exception ex) 
    {
        ex.printStackTrace();
        return null;
    }
    }
}


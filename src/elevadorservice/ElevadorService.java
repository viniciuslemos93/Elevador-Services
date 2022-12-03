/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package elevadorservice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Vinicius
 */
public class ElevadorService {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Andar, elevador e turno.
        JSONObject jSONObject;
        JSONParser parser = new JSONParser();
        
        Elevador ele = new Elevador();
        
        try {
            
           jSONObject = (JSONObject) parser.parse(new FileReader ("input.json"));
           ele.setAndar((String) jSONObject.get("andar"));
           ele.setElevador((String) jSONObject.get("elevador"));
           ele.setTurno((String) jSONObject.get("turno"));
           
            System.out.println("Dados do JSON: " + ele.toString());      
            
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException ex) {
            Logger.getLogger(ElevadorService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

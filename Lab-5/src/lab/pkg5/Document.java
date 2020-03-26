/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg5;

/**
 *
 * @author User
 */
import java.util.*;
public class Document {
    private String id;
    private String name;
    private String location;
    private Map<String, Object> tags = new HashMap<>();
    public Document(){
        this.id=null;
        this.name=null;
        this.location=null;
    }
    public Document(String id, String name, String location){
        this.id=id;
        this.name=name;
        this.location=location;
    }
    public String setId(String id){
        return id;
    }
    public String getId(String id){
        return id;
    }
    public String ToString(){
        return id;
    }
    public String setName(String name){
        return name;
    }
    public String setLocation(String location){
        return location;
    }
    public void add(String key, Document doc){
        tags.put(key, doc);
    }
}

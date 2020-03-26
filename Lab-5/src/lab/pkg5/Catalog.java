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
public class Catalog {
    private String nume;
    private String path;
    private List<Document> documents = new ArrayList<>();
    private Map<String, Object> tags = new HashMap<>();
    public Catalog (){
       this.nume=null;
       this.path=null;
    }
    public Catalog(String nume, String path){
        this.nume=nume;
        this.path=path;
    }
    public String setNume(String nume){
        return nume;
    }
    public String setName(String name){
        return path;
    }
    public void add(Document doc) {
        documents.add(doc);
    }
    public void addTag(String nume, Document doc){
         tags.put(nume, doc);
    }
    public Document findById(String id) {
        return documents.stream()
        .filter(d -> d.getId(id).equals(id)).findFirst().orElse(null);
    }
}

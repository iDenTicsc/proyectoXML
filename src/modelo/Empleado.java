/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.KeyStore;
import java.util.LinkedList;
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;


/**
 *
 * @author sebastian.carmona
 */
public class Empleado extends persona {
    
    private String Departamento;
    
    private String Codigo;
    /**
     * Get the value of Departamento
     *
     * @return the value of Departamento
     */
    public String getDepartamento() {
        return Departamento;
        
    }
    

    /**
     * Get the value of Codigo
     *
     * @return the value of Codigo
     */
    public String getCodigo() {
        return Codigo;
    }

    /**
     * Set the value of Codigo
     *
     * @param Codigo new value of Codigo
     */
    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }


    /**
     * Set the value of Departamento
     *
     * @param Departamento new value of Departamento
     */
    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    public Empleado(String Departamento, String Codigo, String Nombre, int Edad, String Direccion) {
        super(Nombre, Edad, Direccion);
        this.Departamento = Departamento;
        this.Codigo = Codigo;
    }

    public Empleado() {
    }
    

    @Override
    public String toString() {
        return super.toString()+ "," + Departamento + "," + Codigo;
    }

    public boolean guardarEmpleados(LinkedList<Empleado> losEmpleados)  
    {
        boolean g = false;
        try {             
            String nombreArchivo = "Guardar.txt";               
            PrintWriter  salida  =  new  PrintWriter(new BufferedWriter(new FileWriter(nombreArchivo))) ;          
            System.out.println("Guardando datos de archivo" );
            String linea;
            for(Empleado dato : losEmpleados)
            {
                linea=dato.getNombre()+"--"+dato.getDepartamento()+"--"+ dato.getDireccion()+"--"+dato.getEdad()+"--"+ dato.getCodigo()+"--"; 
                salida.println(linea);
            }
             salida.close();
            System.out.println("\n\n Guardado Finalizado" );                       
       } catch(IOException e ) 
       { 
           e.printStackTrace() ; 
       }
        return g;
    }

    public boolean crearFileXML(LinkedList<Empleado> listaEmpleados)
    {
        boolean g = false;
       try 
       {
           Element company = new Element("company"); 
           Document doc=new Document(company);
           
           
           for(int i =0;i<listaEmpleados.size();i++){
           Element staff = new Element("staff");
           staff.setAttribute(new Attribute("id","1"));
           staff.addContent(new Element("Nombre").setText(listaEmpleados.get(i).getNombre()));
           staff.addContent(new Element("Direccion").setText(listaEmpleados.get(i).getDireccion()));
           staff.addContent(new Element("Edad").setText(String.valueOf(listaEmpleados.get(i).getEdad())));
           staff.addContent(new Element("Codigo").setText(listaEmpleados.get(i).getCodigo()));
           staff.addContent(new Element("Departamento").setText(listaEmpleados.get(i).getDepartamento()));
           
           doc.getRootElement().addContent(staff);
           }
           
           XMLOutputter xmlOutput = new XMLOutputter();
           xmlOutput.setFormat(Format.getPrettyFormat());
           xmlOutput.output(doc, new FileWriter("Company.xml"));
           g = true;
        }
       catch(IOException io)
        {
           System.out.println(io.getMessage());
           g = false;
        }  
           
       return g;
    }
         
        
}

   

    


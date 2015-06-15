/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.XMLOutputter;

/**
 *
 * @author vini
 */
public class RegistroUsuarios {
    
 private Document document;
    private Element raiz;
    private String ruta;

    //========================================================================
    ////////////////////////////////////////////////////////////////////////////
    private RegistroUsuarios(String ruta, String raiz) throws IOException {
        this.ruta = ruta;
        this.raiz = new Element(raiz);
        this.document = new Document(this.raiz);
        this.guardar();
    }

    private RegistroUsuarios(String ruta) throws JDOMException, IOException {
        SAXBuilder builder = new SAXBuilder();
        builder.setIgnoringElementContentWhitespace(true);

        this.document = builder.build(ruta);
        this.raiz = document.getRootElement();
        this.ruta = ruta;
        System.err.println(this.raiz);
    }

    public static RegistroUsuarios abrirDocumento(String nombreDocument) throws JDOMException, IOException {
        return new RegistroUsuarios(nombreDocument);
    }

    public static RegistroUsuarios crearDocumento(String nombreDocumento) throws IOException {
        return new RegistroUsuarios(nombreDocumento, "usuarios");
    }

    public void guardar() throws IOException {
        XMLOutputter xMLOutputter = new XMLOutputter();
        xMLOutputter.output(document, new PrintWriter(this.ruta));    
        xMLOutputter.output(document, System.out); //Imprime en consola
    }
  

    ///========================================================================
    ///////////////////////////////////////////////////////////////////////////
    public boolean login(String usuario, String contrasena) {
        List<Element> listaUsuarios = (List<Element>) this.raiz.getChildren();

        for (Element persona : listaUsuarios) {
            if (persona.getAttributeValue("cedula").equalsIgnoreCase(contrasena)) {
                if (persona.getChildText("usuario").equalsIgnoreCase(usuario)) {
                    return true;
                }
            }
        }

        return false;
    }

    ///////////////////////////////////////////////////////////////////////////
//    public String agregar(Ususarios personaParamentro) throws IOException {
//        Element ePersona = new Element("persona");
//        Element eContrasena = new Element("contrasena");
//        Attribute eCedula = new Attribute("cedula", personaParamentro.getCedula());
//        Element eNombre = new Element("nombre");
//        Element eUsuario = new Element("usuario");
//
//        eNombre.addContent(personaParamentro.getNombre());
//        eUsuario.addContent(personaParamentro.getUsuario());
//
//        ePersona.addContent(eContrasena);
//        ePersona.setAttribute(eCedula);
//        ePersona.addContent(eNombre);
//        ePersona.addContent(eUsuario);
//
//        System.err.println(document.getRootElement());
//
//        this.document.getRootElement().addContent(ePersona);
//
//        this.guardar();
//
//        return "Usuario agregado";
//
//    }

    ///////////////////////////////////////////////////////////////////////////
//    public Element buscar(String cedula) {
//        List<Element> lista = (List<Element>) this.raiz.getChildren();
//
//        for (Element persona : lista) {
//            System.err.println("paso");
//            if (persona.getAttributeValue("cedula").equalsIgnoreCase(cedula)) {
//                return persona;
//            }
//        }
//        return null;
//    }

    ///////////////////////////////////////////////////////////////////////////
//    public String modificar(Ususario ususario) throws IOException {
//        Element eBuscar = buscar(ususario.getCedula());
//
//        eBuscar.getChild("contrasena").setText(ususario.getContrasena());
//        eBuscar.setAttribute("cedula", ususario.getCedula());
//        eBuscar.getChild("nombre").setText(ususario.getNombre());
//        eBuscar.getChild("usuario").setText(ususario.getUsuario());
//
//        this.guardar();
//        return "Usuario modificado";
//    }

    ////////////////////////////////////////////////////////////////////////////
//    public String eliminar(Element element) throws IOException {
//        this.raiz.removeContent(element);
//        this.guardar();
//        return "Usuario eliminado";
//    }
}

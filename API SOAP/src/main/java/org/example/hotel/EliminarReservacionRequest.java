//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.06.18 a las 10:02:32 PM CDT 
//


package org.example.hotel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UsuarioCliente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NumeroReservacion" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "usuarioCliente",
    "numeroReservacion"
})
@XmlRootElement(name = "EliminarReservacionRequest")
public class EliminarReservacionRequest {

    @XmlElement(name = "UsuarioCliente", required = true)
    protected String usuarioCliente;
    @XmlElement(name = "NumeroReservacion")
    protected int numeroReservacion;

    /**
     * Obtiene el valor de la propiedad usuarioCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuarioCliente() {
        return usuarioCliente;
    }

    /**
     * Define el valor de la propiedad usuarioCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuarioCliente(String value) {
        this.usuarioCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroReservacion.
     * 
     */
    public int getNumeroReservacion() {
        return numeroReservacion;
    }

    /**
     * Define el valor de la propiedad numeroReservacion.
     * 
     */
    public void setNumeroReservacion(int value) {
        this.numeroReservacion = value;
    }

}

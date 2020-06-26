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
 *         &lt;element name="NumHabitacion" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="UsuarioCliente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NumDias" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="FechaLLegada" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FechaSalida" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "numHabitacion",
    "usuarioCliente",
    "numDias",
    "fechaLLegada",
    "fechaSalida"
})
@XmlRootElement(name = "ReservacionRequest")
public class ReservacionRequest {

    @XmlElement(name = "NumHabitacion")
    protected int numHabitacion;
    @XmlElement(name = "UsuarioCliente", required = true)
    protected String usuarioCliente;
    @XmlElement(name = "NumDias")
    protected int numDias;
    @XmlElement(name = "FechaLLegada", required = true)
    protected String fechaLLegada;
    @XmlElement(name = "FechaSalida", required = true)
    protected String fechaSalida;

    /**
     * Obtiene el valor de la propiedad numHabitacion.
     * 
     */
    public int getNumHabitacion() {
        return numHabitacion;
    }

    /**
     * Define el valor de la propiedad numHabitacion.
     * 
     */
    public void setNumHabitacion(int value) {
        this.numHabitacion = value;
    }

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
     * Obtiene el valor de la propiedad numDias.
     * 
     */
    public int getNumDias() {
        return numDias;
    }

    /**
     * Define el valor de la propiedad numDias.
     * 
     */
    public void setNumDias(int value) {
        this.numDias = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaLLegada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaLLegada() {
        return fechaLLegada;
    }

    /**
     * Define el valor de la propiedad fechaLLegada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaLLegada(String value) {
        this.fechaLLegada = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaSalida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaSalida() {
        return fechaSalida;
    }

    /**
     * Define el valor de la propiedad fechaSalida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaSalida(String value) {
        this.fechaSalida = value;
    }

}

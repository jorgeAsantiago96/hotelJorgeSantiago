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
 *         &lt;element name="numReservacionC" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="fechacompra" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="monto" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "numReservacionC",
    "fechacompra",
    "monto"
})
@XmlRootElement(name = "CompraRequest")
public class CompraRequest {

    protected int numReservacionC;
    @XmlElement(required = true)
    protected String fechacompra;
    protected int monto;

    /**
     * Obtiene el valor de la propiedad numReservacionC.
     * 
     */
    public int getNumReservacionC() {
        return numReservacionC;
    }

    /**
     * Define el valor de la propiedad numReservacionC.
     * 
     */
    public void setNumReservacionC(int value) {
        this.numReservacionC = value;
    }

    /**
     * Obtiene el valor de la propiedad fechacompra.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechacompra() {
        return fechacompra;
    }

    /**
     * Define el valor de la propiedad fechacompra.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechacompra(String value) {
        this.fechacompra = value;
    }

    /**
     * Obtiene el valor de la propiedad monto.
     * 
     */
    public int getMonto() {
        return monto;
    }

    /**
     * Define el valor de la propiedad monto.
     * 
     */
    public void setMonto(int value) {
        this.monto = value;
    }

}

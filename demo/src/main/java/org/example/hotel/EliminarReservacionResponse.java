//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.04.27 a las 11:17:38 PM CDT 
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
 *         &lt;element name="ResultadoEliminarReservacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "resultadoEliminarReservacion"
})
@XmlRootElement(name = "EliminarReservacionResponse")
public class EliminarReservacionResponse {

    @XmlElement(name = "ResultadoEliminarReservacion", required = true)
    protected String resultadoEliminarReservacion;

    /**
     * Obtiene el valor de la propiedad resultadoEliminarReservacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultadoEliminarReservacion() {
        return resultadoEliminarReservacion;
    }

    /**
     * Define el valor de la propiedad resultadoEliminarReservacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultadoEliminarReservacion(String value) {
        this.resultadoEliminarReservacion = value;
    }

}

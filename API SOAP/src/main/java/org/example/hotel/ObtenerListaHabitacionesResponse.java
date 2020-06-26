//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.06.18 a las 10:02:32 PM CDT 
//


package org.example.hotel;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="habitacion" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="numeroHabitacion" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
    "habitacion"
})
@XmlRootElement(name = "ObtenerListaHabitacionesResponse")
public class ObtenerListaHabitacionesResponse {

    @XmlElement(required = true)
    protected List<ObtenerListaHabitacionesResponse.Habitacion> habitacion;

    /**
     * Gets the value of the habitacion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the habitacion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHabitacion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObtenerListaHabitacionesResponse.Habitacion }
     * 
     * 
     */
    public List<ObtenerListaHabitacionesResponse.Habitacion> getHabitacion() {
        if (habitacion == null) {
            habitacion = new ArrayList<ObtenerListaHabitacionesResponse.Habitacion>();
        }
        return this.habitacion;
    }


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
     *         &lt;element name="numeroHabitacion" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "numeroHabitacion",
        "estado"
    })
    public static class Habitacion {

        protected int numeroHabitacion;
        @XmlElement(required = true)
        protected String estado;
        
        public Habitacion() {
        	
        }

        public Habitacion(int numeroHabitacion, String estado) {
			super();
			this.numeroHabitacion = numeroHabitacion;
			this.estado = estado;
		}

		/**
         * Obtiene el valor de la propiedad numeroHabitacion.
         * 
         */
        public int getNumeroHabitacion() {
            return numeroHabitacion;
        }

        /**
         * Define el valor de la propiedad numeroHabitacion.
         * 
         */
        public void setNumeroHabitacion(int value) {
            this.numeroHabitacion = value;
        }

        /**
         * Obtiene el valor de la propiedad estado.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEstado() {
            return estado;
        }

        /**
         * Define el valor de la propiedad estado.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEstado(String value) {
            this.estado = value;
        }

    }

}

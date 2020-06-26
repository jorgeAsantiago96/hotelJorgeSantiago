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
 *         &lt;element name="reservacion" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="numRes" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="usuarioRes" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="numHabitacion" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="fechaLlegada" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="fechaSalida" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "reservacion"
})
@XmlRootElement(name = "ObtenerListaReservacionesResponse")
public class ObtenerListaReservacionesResponse {

    @XmlElement(required = true)
    protected List<ObtenerListaReservacionesResponse.Reservacion> reservacion;

    /**
     * Gets the value of the reservacion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reservacion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReservacion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObtenerListaReservacionesResponse.Reservacion }
     * 
     * 
     */
    public List<ObtenerListaReservacionesResponse.Reservacion> getReservacion() {
        if (reservacion == null) {
            reservacion = new ArrayList<ObtenerListaReservacionesResponse.Reservacion>();
        }
        return this.reservacion;
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
     *         &lt;element name="numRes" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="usuarioRes" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="numHabitacion" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="fechaLlegada" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="fechaSalida" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "numRes",
        "usuarioRes",
        "numHabitacion",
        "fechaLlegada",
        "fechaSalida"
    })
    public static class Reservacion {

        protected int numRes;
        @XmlElement(required = true)
        protected String usuarioRes;
        protected int numHabitacion;
        @XmlElement(required = true)
        protected String fechaLlegada;
        @XmlElement(required = true)
        protected String fechaSalida;

        
        public Reservacion() {
        	
        }
        
        public Reservacion(int numRes, String usuarioRes, int numHabitacion, String fechaLlegada, String fechaSalida) {
			super();
			this.numRes = numRes;
			this.usuarioRes = usuarioRes;
			this.numHabitacion = numHabitacion;
			this.fechaLlegada = fechaLlegada;
			this.fechaSalida = fechaSalida;
		}

		/**
         * Obtiene el valor de la propiedad numRes.
         * 
         */
        public int getNumRes() {
            return numRes;
        }

        /**
         * Define el valor de la propiedad numRes.
         * 
         */
        public void setNumRes(int value) {
            this.numRes = value;
        }

        /**
         * Obtiene el valor de la propiedad usuarioRes.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUsuarioRes() {
            return usuarioRes;
        }

        /**
         * Define el valor de la propiedad usuarioRes.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUsuarioRes(String value) {
            this.usuarioRes = value;
        }

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
         * Obtiene el valor de la propiedad fechaLlegada.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFechaLlegada() {
            return fechaLlegada;
        }

        /**
         * Define el valor de la propiedad fechaLlegada.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFechaLlegada(String value) {
            this.fechaLlegada = value;
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

}

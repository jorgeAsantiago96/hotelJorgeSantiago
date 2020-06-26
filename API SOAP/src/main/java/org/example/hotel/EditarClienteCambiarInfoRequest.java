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
 *         &lt;element name="UsuarioR" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ContraseñaR" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NombreR" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ApellidoR" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CorreoR" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TelefonoR" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "usuarioR",
    "contrase\u00f1aR",
    "nombreR",
    "apellidoR",
    "correoR",
    "telefonoR"
})
@XmlRootElement(name = "EditarClienteCambiarInfoRequest")
public class EditarClienteCambiarInfoRequest {

    @XmlElement(name = "UsuarioR", required = true)
    protected String usuarioR;
    @XmlElement(name = "Contrase\u00f1aR", required = true)
    protected String contraseñaR;
    @XmlElement(name = "NombreR", required = true)
    protected String nombreR;
    @XmlElement(name = "ApellidoR", required = true)
    protected String apellidoR;
    @XmlElement(name = "CorreoR", required = true)
    protected String correoR;
    @XmlElement(name = "TelefonoR", required = true)
    protected String telefonoR;

    /**
     * Obtiene el valor de la propiedad usuarioR.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuarioR() {
        return usuarioR;
    }

    /**
     * Define el valor de la propiedad usuarioR.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuarioR(String value) {
        this.usuarioR = value;
    }

    /**
     * Obtiene el valor de la propiedad contraseñaR.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContraseñaR() {
        return contraseñaR;
    }

    /**
     * Define el valor de la propiedad contraseñaR.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContraseñaR(String value) {
        this.contraseñaR = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreR.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreR() {
        return nombreR;
    }

    /**
     * Define el valor de la propiedad nombreR.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreR(String value) {
        this.nombreR = value;
    }

    /**
     * Obtiene el valor de la propiedad apellidoR.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellidoR() {
        return apellidoR;
    }

    /**
     * Define el valor de la propiedad apellidoR.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellidoR(String value) {
        this.apellidoR = value;
    }

    /**
     * Obtiene el valor de la propiedad correoR.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorreoR() {
        return correoR;
    }

    /**
     * Define el valor de la propiedad correoR.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorreoR(String value) {
        this.correoR = value;
    }

    /**
     * Obtiene el valor de la propiedad telefonoR.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefonoR() {
        return telefonoR;
    }

    /**
     * Define el valor de la propiedad telefonoR.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefonoR(String value) {
        this.telefonoR = value;
    }

}

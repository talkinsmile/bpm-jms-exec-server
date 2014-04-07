package org.acme.insurance;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement(name="policy")

/**
 * This class was automatically generated by the data modeler tool.
 */
@org.kie.api.definition.type.Label(value = "Policy")
public class Policy  implements java.io.Serializable {

static final long serialVersionUID = 1L;
    
    @org.kie.api.definition.type.Label(value = "Driver")
    @org.kie.api.definition.type.Position(value = 5)
    private org.acme.insurance.Driver driver;
    
    @org.kie.api.definition.type.Label(value = "Policy Type")
    @org.kie.api.definition.type.Position(value = 1)
    private java.lang.String policyType;
    
    @org.kie.api.definition.type.Label(value = "Price")
    @org.kie.api.definition.type.Position(value = 3)
    private java.lang.Integer price;
    
    @org.kie.api.definition.type.Label(value = "Price Discount")
    @org.kie.api.definition.type.Position(value = 4)
    private java.lang.Integer priceDiscount;
    
    @org.kie.api.definition.type.Label(value = "Request Date")
    @org.kie.api.definition.type.Position(value = 0)
    private java.util.Date requestDate;
    
    @org.kie.api.definition.type.Label(value = "Vehicle Year")
    @org.kie.api.definition.type.Position(value = 2)
    private java.lang.Integer vehicleYear;

    public Policy() {
    }

    public Policy(java.util.Date requestDate, java.lang.String policyType, java.lang.Integer vehicleYear, java.lang.Integer price, java.lang.Integer priceDiscount, org.acme.insurance.Driver driver) {
        this.requestDate = requestDate;
        this.policyType = policyType;
        this.vehicleYear = vehicleYear;
        this.price = price;
        this.priceDiscount = priceDiscount;
        this.driver = driver;
    }


    
    public org.acme.insurance.Driver getDriver() {
        return this.driver;
    }

    public void setDriver(  org.acme.insurance.Driver driver ) {
        this.driver = driver;
    }
    
    public java.lang.String getPolicyType() {
        return this.policyType;
    }

    public void setPolicyType(  java.lang.String policyType ) {
        this.policyType = policyType;
    }
    
    public java.lang.Integer getPrice() {
        return this.price;
    }

    public void setPrice(  java.lang.Integer price ) {
        this.price = price;
    }
    
    public java.lang.Integer getPriceDiscount() {
        return this.priceDiscount;
    }

    public void setPriceDiscount(  java.lang.Integer priceDiscount ) {
        this.priceDiscount = priceDiscount;
    }
    
    public java.util.Date getRequestDate() {
        return this.requestDate;
    }

    public void setRequestDate(  java.util.Date requestDate ) {
        this.requestDate = requestDate;
    }
    
    public java.lang.Integer getVehicleYear() {
        return this.vehicleYear;
    }

    public void setVehicleYear(  java.lang.Integer vehicleYear ) {
        this.vehicleYear = vehicleYear;
    }
    public String toString()
    {
        StringBuilder sBuilder = new StringBuilder("Policy properties =");
        sBuilder.append("\n\tpolicyType : " +policyType);
        sBuilder.append("\n\tprice : " +price);
        sBuilder.append("\n\tpriceDiscount : " +priceDiscount);
        sBuilder.append("\n\trequestDate : " +requestDate);
        sBuilder.append("\n\tvehicle year : "+vehicleYear);
        sBuilder.append("\n\tdriver : " +driver);
        return sBuilder.toString();
    }
}

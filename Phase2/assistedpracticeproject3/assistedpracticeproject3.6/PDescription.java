package com.ecommerce;

public class PDescription {
    private long descriptionID;
    private String descrip;

    public PDescription() {
    }

    public PDescription(String descrip) {
        this.descriptionID = 0;
        this.descrip = descrip;
    }

    public long getDescriptionID() {
        return this.descriptionID;
    }

    public String getDescrip() {
        return this.descrip;
    }

    public void setDescriptionID(long id) {
        this.descriptionID = id;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }
}

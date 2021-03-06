package edu.ijse.automobile_workshop_management_system.model;

public class ItemInvoiceDescriptionDetailDTO {

    private int iid;
    private int itindid;
    private int qty;
    private double price;
    private String description;

    public ItemInvoiceDescriptionDetailDTO() {
    }

    public ItemInvoiceDescriptionDetailDTO(int iid, int itindid, int qty, double price, String description) {
        this.iid = iid;
        this.itindid = itindid;
        this.qty = qty;
        this.price = price;
        this.description = description;
    }

    public ItemInvoiceDescriptionDetailDTO(int iid, int itindid, int qty, double price) {
        this.iid = iid;
        this.itindid = itindid;
        this.qty = qty;
        this.price = price;
    }

    public ItemInvoiceDescriptionDetailDTO(int itindid, String description, int qty, double price) {
        this.itindid = itindid;
        this.qty = qty;
        this.price = price;
        this.description = description;
    }

    public ItemInvoiceDescriptionDetailDTO(String description) {
        this.description = description;
    }

    /**
     * @return the iid
     */
    public int getIid() {
        return iid;
    }

    /**
     * @param iid the iid to set
     */
    public void setIid(int iid) {
        this.iid = iid;
    }

    /**
     * @return the itindid
     */
    public int getItindid() {
        return itindid;
    }

    /**
     * @param itindid the itindid to set
     */
    public void setItindid(int itindid) {
        this.itindid = itindid;
    }

    /**
     * @return the qty
     */
    public int getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(int qty) {
        this.qty = qty;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

}

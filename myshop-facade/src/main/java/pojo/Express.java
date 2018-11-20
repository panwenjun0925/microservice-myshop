package pojo;

import javax.persistence.*;

@Table(name = "shopping..express")
public class Express {
    @Id
    @Column(name = "expressId")
    private Integer expressid;

    @Column(name = "expressName")
    private String expressname;

    @Column(name = "orderDescribe")
    private String orderdescribe;

    private Float charge;

    @Column(name = "freeAllowances")
    private Float freeallowances;

    @Column(name = "quotationCost")
    private Float quotationcost;

    /**
     * @return expressId
     */
    public Integer getExpressid() {
        return expressid;
    }

    /**
     * @param expressid
     */
    public void setExpressid(Integer expressid) {
        this.expressid = expressid;
    }

    /**
     * @return expressName
     */
    public String getExpressname() {
        return expressname;
    }

    /**
     * @param expressname
     */
    public void setExpressname(String expressname) {
        this.expressname = expressname;
    }

    /**
     * @return orderDescribe
     */
    public String getOrderdescribe() {
        return orderdescribe;
    }

    /**
     * @param orderdescribe
     */
    public void setOrderdescribe(String orderdescribe) {
        this.orderdescribe = orderdescribe;
    }

    /**
     * @return charge
     */
    public Float getCharge() {
        return charge;
    }

    /**
     * @param charge
     */
    public void setCharge(Float charge) {
        this.charge = charge;
    }

    /**
     * @return freeAllowances
     */
    public Float getFreeallowances() {
        return freeallowances;
    }

    /**
     * @param freeallowances
     */
    public void setFreeallowances(Float freeallowances) {
        this.freeallowances = freeallowances;
    }

    /**
     * @return quotationCost
     */
    public Float getQuotationcost() {
        return quotationcost;
    }

    /**
     * @param quotationcost
     */
    public void setQuotationcost(Float quotationcost) {
        this.quotationcost = quotationcost;
    }
}
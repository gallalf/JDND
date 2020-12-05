package com.udacity.pricing.domain.price;

import java.math.BigDecimal;
import javax.persistence.*;


/**
 * Represents the price of a given vehicle, including currency.
 */
@Entity
public class Price {

    private String currency;
    private BigDecimal price;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long vehicleId;

    public Price() {
    }

    public Price(String currency, BigDecimal price) {
        this.currency = currency;
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }
}

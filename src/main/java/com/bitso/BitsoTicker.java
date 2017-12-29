package com.bitso;

import com.bitso.helpers.Helpers;
import org.json.JSONObject;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "bitso_ticker")
public class BitsoTicker {
    //BITSO Ticker
    private String book;
    //Exchange Ticker
    private BigDecimal last;
    private BigDecimal high;
    private BigDecimal low;
    private BigDecimal vwap;
    private BigDecimal volume;
    private BigDecimal bid;
    private BigDecimal ask;
    @Column(unique=true, nullable=false)
    private Date createdAt;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public BitsoTicker() {
    }

    public BitsoTicker(JSONObject o) {
        last = Helpers.getBD(o, "last");
        high = Helpers.getBD(o, "high");
        low = Helpers.getBD(o, "low");
        vwap = Helpers.getBD(o, "vwap");
        volume = Helpers.getBD(o, "volume");
        bid = Helpers.getBD(o, "bid");
        ask = Helpers.getBD(o, "ask");
        createdAt = Helpers.getZonedDatetime(o, "created_at");
        book = Helpers.getString(o, "book");
    }

    public String toString() {
        return Helpers.fieldPrinter(this, BitsoTicker.class) + super.toString();
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public BigDecimal getLast() {
        return last;
    }

    public void setLast(BigDecimal last) {
        this.last = last;
    }

    public BigDecimal getHigh() {
        return high;
    }

    public void setHigh(BigDecimal high) {
        this.high = high;
    }

    public BigDecimal getLow() {
        return low;
    }

    public void setLow(BigDecimal low) {
        this.low = low;
    }

    public BigDecimal getVwap() {
        return vwap;
    }

    public void setVwap(BigDecimal vwap) {
        this.vwap = vwap;
    }

    public BigDecimal getVolume() {
        return volume;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public BigDecimal getBid() {
        return bid;
    }

    public void setBid(BigDecimal bid) {
        this.bid = bid;
    }

    public BigDecimal getAsk() {
        return ask;
    }

    public void setAsk(BigDecimal ask) {
        this.ask = ask;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

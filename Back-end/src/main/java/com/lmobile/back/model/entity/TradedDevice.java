package com.lmobile.back.model.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "traded_device")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TradedDevice {
  
    @EmbeddedId
    private TradedDeviceId id = new TradedDeviceId();
    
    @Column(name = "created_at")
    private Date createdAt;
    
    @ManyToOne
    @MapsId("tradeinOfferId")
    @JoinColumn(name = "tradein_offer_id")
    private TradeinOffer tradeinOffer;
    
    @ManyToOne
    @MapsId("usedDeviceId")
    @JoinColumn(name = "used_device_id")
    @JsonBackReference
    private UsedDevice usedDevice;
}

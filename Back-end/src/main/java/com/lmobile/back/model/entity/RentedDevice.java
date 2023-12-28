package com.lmobile.back.model.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "rented_device")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RentedDevice  {
  
    @EmbeddedId
    private RentedDeviceId id = new RentedDeviceId();
    
    @Column(name = "created_at")
    private Date createdAt;
    
    @ManyToOne
    @MapsId("rentalOfferId")
    @JoinColumn(name = "rental_offer_id")
    private RentalOffer rentalOffer;
    
    @ManyToOne
    @MapsId("rentalDeviceId")
    @JoinColumn(name = "rental_device_id")
    private RentalDevice rentalDevice;

    @OneToOne
    @JoinColumn(name = "device_status_checklist_id")
    private DeviceStatusChecklist deviceStatusChecklist;
}

package com.lmobile.back.model.entity;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Embeddable
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RentedDeviceId implements Serializable {

    @Column(name = "rental_offer_id")
    private Long rentalOfferId;
    
    @Column(name = "rental_device_id")
    private Long rentalDeviceId;
    
    @Override
    public int hashCode() {
        return Objects.hash(rentalOfferId, rentalDeviceId);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RentedDeviceId other = (RentedDeviceId) obj;
        return Objects.equals(getRentalOfferId(), other.getRentalOfferId()) && Objects.equals(getRentalDeviceId(), other.getRentalDeviceId());
    }
}


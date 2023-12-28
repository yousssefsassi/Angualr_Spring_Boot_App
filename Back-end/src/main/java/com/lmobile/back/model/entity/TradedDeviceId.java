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
public class TradedDeviceId  implements Serializable {

    @Column(name = "tradein_offer_id")
    private Long tradeinOfferId;
    
    @Column(name = "used_device_id")
    private Long usedDeviceId;
    
    @Override
    public int hashCode() {
        return Objects.hash(tradeinOfferId, usedDeviceId);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TradedDeviceId other = (TradedDeviceId) obj;
        return Objects.equals(getTradeinOfferId(), other.getTradeinOfferId()) && Objects.equals(getUsedDeviceId(), other.getUsedDeviceId());
    }
}


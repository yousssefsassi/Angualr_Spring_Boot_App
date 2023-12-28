package com.lmobile.back.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lmobile.back.model.entity.Device;

@Repository
public interface DeviceRepository extends JpaRepository<Device, Long> {

}

package com.lmobile.back;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.lmobile.back.model.dto.CountryDto;
import com.lmobile.back.model.entity.Country;
import com.lmobile.back.model.mapper.CountryMapper;
import com.lmobile.back.repository.AddressRepository;

@Component
public class DBTestDataLoader implements CommandLineRunner {
  
  @Autowired
  private AddressRepository addressRepository;

  @Override
  public void run(String... args) throws Exception {
    // testMappers();
  }
  
  public void testMappers() {
    Country tunisia = Country.builder().id(10L).name("Tunisia").build();
    Country algeria = Country.builder().id(20L).name("Algeria").build();
    System.out.println(CountryMapper.toDto(tunisia));
    System.out.println(CountryMapper.toDto(List.of(tunisia, algeria)));
    
    CountryDto tunisiaDto = CountryDto.builder().id(10L).name("Tunisia").build();
    CountryDto algeriaDto = CountryDto.builder().id(20L).name("Algeria").build();
    System.out.println(CountryMapper.toEntity(tunisiaDto));
    System.out.println(CountryMapper.toEntity(List.of(tunisiaDto, algeriaDto)));
  }

}

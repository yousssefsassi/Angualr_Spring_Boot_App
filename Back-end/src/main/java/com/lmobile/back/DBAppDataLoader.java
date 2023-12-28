package com.lmobile.back;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.lmobile.back.model.entity.Country;
import com.lmobile.back.repository.AddressRepository;
import com.lmobile.back.repository.CountryRepository;
import com.lmobile.back.security.constant.RoleType;
import com.lmobile.back.security.model.entity.Role;
import com.lmobile.back.security.repository.RoleRepository;


@Component
public class DBAppDataLoader implements CommandLineRunner {
  
  @Autowired
  private AddressRepository addressRepository;
  @Autowired
  private CountryRepository countryRepository;
  @Autowired
  private RoleRepository roleRepository;

  @Override
  public void run(String... args) throws Exception {

    loadRoles();
    loadCountryList();
  }
  
  private void loadRoles() {
    Role adminRole = Role.builder().name(RoleType.ROLE_ADMIN).build();
    Role salesmanRole = Role.builder().name(RoleType.ROLE_SALESMAN).build();
    roleRepository.saveAll(List.of(
      adminRole,
      salesmanRole
    ));
  }
  
  private void loadCountryList() {

    countryRepository.saveAll(List.of(
        Country.builder().name("Afghanistan").build(),
        Country.builder().name("Albania").build(),
        Country.builder().name("Algeria").build(),
        Country.builder().name("Andorra").build(),
        Country.builder().name("Angola").build(),
        Country.builder().name("Antigua and Barbuda").build(),
        Country.builder().name("Argentina").build(),
        Country.builder().name("Armenia").build(),
        Country.builder().name("Australia").build(),
        Country.builder().name("Austria").build(),
        Country.builder().name("Azerbaijan").build(),
        Country.builder().name("The Bahamas").build(),
        Country.builder().name("Bahrain").build(),
        Country.builder().name("Bangladesh").build(),
        Country.builder().name("Barbados").build(),
        Country.builder().name("Belarus").build(),
        Country.builder().name("Belgium").build(),
        Country.builder().name("Belize").build(),
        Country.builder().name("Benin").build(),
        Country.builder().name("Bhutan").build(),
        Country.builder().name("Bolivia").build(),
        Country.builder().name("Bosnia and Herzegovina").build(),
        Country.builder().name("Botswana").build(),
        Country.builder().name("Brazil").build(),
        Country.builder().name("Brunei").build(),
        Country.builder().name("Bulgaria").build(),
        Country.builder().name("Burkina Faso").build(),
        Country.builder().name("Burundi").build(),
        Country.builder().name("Cabo Verde").build(),
        Country.builder().name("Cambodia").build(),
        Country.builder().name("Cameroon").build(),
        Country.builder().name("Canada").build(),
        Country.builder().name("Central African Republic").build(),
        Country.builder().name("Chad").build(),
        Country.builder().name("Chile").build(),
        Country.builder().name("China").build(),
        Country.builder().name("Colombia").build(),
        Country.builder().name("Comoros").build(),
        Country.builder().name("Congo, Democratic Republic of the").build(),
        Country.builder().name("Congo, Republic of the").build(),
        Country.builder().name("Costa Rica").build(),
        Country.builder().name("Côte d’Ivoire").build(),
        Country.builder().name("Croatia").build(),
        Country.builder().name("Cuba").build(),
        Country.builder().name("Cyprus").build(),
        Country.builder().name("Czech Republic").build(),
        Country.builder().name("Denmark").build(),
        Country.builder().name("Djibouti").build(),
        Country.builder().name("Dominica").build(),
        Country.builder().name("Dominican Republic").build(),
        Country.builder().name("East Timor (Timor-Leste)").build(),
        Country.builder().name("Ecuador").build(),
        Country.builder().name("Egypt").build(),
        Country.builder().name("El Salvador").build(),
        Country.builder().name("Equatorial Guinea").build(),
        Country.builder().name("Eritrea").build(),
        Country.builder().name("Estonia").build(),
        Country.builder().name("Eswatini").build(),
        Country.builder().name("Ethiopia").build(),
        Country.builder().name("Fiji").build(),
        Country.builder().name("Finland").build(),
        Country.builder().name("France").build(),
        Country.builder().name("Gabon").build(),
        Country.builder().name("The Gambia").build(),
        Country.builder().name("Georgia").build(),
        Country.builder().name("Germany").build(),
        Country.builder().name("Ghana").build(),
        Country.builder().name("Greece").build(),
        Country.builder().name("Grenada").build(),
        Country.builder().name("Guatemala").build(),
        Country.builder().name("Guinea").build(),
        Country.builder().name("Guinea-Bissau").build(),
        Country.builder().name("Guyana").build(),
        Country.builder().name("Haiti").build(),
        Country.builder().name("Honduras").build(),
        Country.builder().name("Hungary").build(),
        Country.builder().name("Iceland").build(),
        Country.builder().name("India").build(),
        Country.builder().name("Indonesia").build(),
        Country.builder().name("Iran").build(),
        Country.builder().name("Iraq").build(),
        Country.builder().name("Ireland").build(),
        Country.builder().name("Israel").build(),
        Country.builder().name("Italy").build(),
        Country.builder().name("Jamaica").build(),
        Country.builder().name("Japan").build(),
        Country.builder().name("Jordan").build(),
        Country.builder().name("Kazakhstan").build(),
        Country.builder().name("Kenya").build(),
        Country.builder().name("Kiribati").build(),
        Country.builder().name("Korea, North").build(),
        Country.builder().name("Korea, South").build(),
        Country.builder().name("Kosovo").build(),
        Country.builder().name("Kuwait").build(),
        Country.builder().name("Kyrgyzstan").build(),
        Country.builder().name("Laos").build(),
        Country.builder().name("Latvia").build(),
        Country.builder().name("Lebanon").build(),
        Country.builder().name("Lesotho").build(),
        Country.builder().name("Liberia").build(),
        Country.builder().name("Libya").build(),
        Country.builder().name("Liechtenstein").build(),
        Country.builder().name("Lithuania").build(),
        Country.builder().name("Luxembourg").build(),
        Country.builder().name("Madagascar").build(),
        Country.builder().name("Malawi").build(),
        Country.builder().name("Malaysia").build(),
        Country.builder().name("Maldives").build(),
        Country.builder().name("Mali").build(),
        Country.builder().name("Malta").build(),
        Country.builder().name("Marshall Islands").build(),
        Country.builder().name("Mauritania").build(),
        Country.builder().name("Mauritius").build(),
        Country.builder().name("Mexico").build(),
        Country.builder().name("Micronesia, Federated States of").build(),
        Country.builder().name("Moldova").build(),
        Country.builder().name("Monaco").build(),
        Country.builder().name("Mongolia").build(),
        Country.builder().name("Montenegro").build(),
        Country.builder().name("Morocco").build(),
        Country.builder().name("Mozambique").build(),
        Country.builder().name("Myanmar (Burma)").build(),
        Country.builder().name("Namibia").build(),
        Country.builder().name("Nauru").build(),
        Country.builder().name("Nepal").build(),
        Country.builder().name("Netherlands").build(),
        Country.builder().name("New Zealand").build(),
        Country.builder().name("Nicaragua").build(),
        Country.builder().name("Niger").build(),
        Country.builder().name("Nigeria").build(),
        Country.builder().name("North Macedonia").build(),
        Country.builder().name("Norway").build(),
        Country.builder().name("Oman").build(),
        Country.builder().name("Pakistan").build(),
        Country.builder().name("Palau").build(),
        Country.builder().name("Panama").build(),
        Country.builder().name("Papua New Guinea").build(),
        Country.builder().name("Paraguay").build(),
        Country.builder().name("Peru").build(),
        Country.builder().name("Philippines").build(),
        Country.builder().name("Poland").build(),
        Country.builder().name("Portugal").build(),
        Country.builder().name("Qatar").build(),
        Country.builder().name("Romania").build(),
        Country.builder().name("Russia").build(),
        Country.builder().name("Rwanda").build(),
        Country.builder().name("Saint Kitts and Nevis").build(),
        Country.builder().name("Saint Lucia").build(),
        Country.builder().name("Saint Vincent and the Grenadines").build(),
        Country.builder().name("Samoa").build(),
        Country.builder().name("San Marino").build(),
        Country.builder().name("Sao Tome and Principe").build(),
        Country.builder().name("Saudi Arabia").build(),
        Country.builder().name("Senegal").build(),
        Country.builder().name("Serbia").build(),
        Country.builder().name("Seychelles").build(),
        Country.builder().name("Sierra Leone").build(),
        Country.builder().name("Singapore").build(),
        Country.builder().name("Slovakia").build(),
        Country.builder().name("Slovenia").build(),
        Country.builder().name("Solomon Islands").build(),
        Country.builder().name("Somalia").build(),
        Country.builder().name("South Africa").build(),
        Country.builder().name("Spain").build(),
        Country.builder().name("Sri Lanka").build(),
        Country.builder().name("Sudan").build(),
        Country.builder().name("Sudan, South").build(),
        Country.builder().name("Suriname").build(),
        Country.builder().name("Sweden").build(),
        Country.builder().name("Switzerland").build(),
        Country.builder().name("Syria").build(),
        Country.builder().name("Taiwan").build(),
        Country.builder().name("Tajikistan").build(),
        Country.builder().name("Tanzania").build(),
        Country.builder().name("Thailand").build(),
        Country.builder().name("Togo").build(),
        Country.builder().name("Tonga").build(),
        Country.builder().name("Trinidad and Tobago").build(),
        Country.builder().name("Tunisia").build(),
        Country.builder().name("Turkey").build(),
        Country.builder().name("Turkmenistan").build(),
        Country.builder().name("Tuvalu").build(),
        Country.builder().name("Uganda").build(),
        Country.builder().name("Ukraine").build(),
        Country.builder().name("United Arab Emirates").build(),
        Country.builder().name("United Kingdom").build(),
        Country.builder().name("United States").build(),
        Country.builder().name("Uruguay").build(),
        Country.builder().name("Uzbekistan").build(),
        Country.builder().name("Vanuatu").build(),
        Country.builder().name("Vatican City").build(),
        Country.builder().name("Venezuela").build(),
        Country.builder().name("Vietnam").build(),
        Country.builder().name("Yemen").build(),
        Country.builder().name("Zambia").build(),
        Country.builder().name("Zimbabwe").build()
    ));
    
  }

}

package se.lexicon.rajashree.model;

import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode

public class CustomerDetails {

private String detailsId;
private String street;
private String zipcode;
private String city;
private String homePhone;
public  String cellPhone;


}

package se.lexicon.rajashree.model.dto;
import lombok.*;
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class CustomerDetailsView
{
    private String detailsId;
    private String street;
    private String zipcode;
    private String city;
    private String homePhone;
    public  String cellPhone;

}

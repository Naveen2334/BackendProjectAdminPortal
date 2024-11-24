package fleet.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import parameters.models.CommonObject;

import javax.persistence.Entity;

@Entity
@Data
@EqualsAndHashCode(callSuper=false)
public class VehicleModel extends CommonObject {

}

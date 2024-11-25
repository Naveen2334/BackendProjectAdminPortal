package fleet.models;

import lombok.Data;

import lombok.EqualsAndHashCode;
import parameters.models.CommonObject;

import jakarta.persistence.*;

@Entity
@Data
@EqualsAndHashCode(callSuper=false)
public class VehicleModel extends CommonObject {

}

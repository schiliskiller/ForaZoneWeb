package sch.uv.mx.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;

import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class ObjetoMongo
{
    @Id
    private ObjectId oid;
}

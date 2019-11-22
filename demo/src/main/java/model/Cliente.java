package model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "Cliente")
public class Cliente implements Serializable {

    @NotEmpty
    private String nombre;
    @NotEmpty
    private String apellido;
    @NotEmpty
    private String edad;
    @NotEmpty
    private String fecha;
    @Id
    private String numDoc;
    @NotEmpty
    private String tipoDoc;

    public Cliente(@NotEmpty String nombre, @NotEmpty String apellido, @NotEmpty String edad, @NotEmpty String fecha, String numDoc, @NotEmpty String tipoDoc) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.fecha = fecha;
        this.numDoc = numDoc;
        this.tipoDoc = tipoDoc;
    }

    public Cliente() {
    }
}

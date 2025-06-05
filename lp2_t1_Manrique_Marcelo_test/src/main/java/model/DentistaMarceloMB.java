package model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "tbl_dentista")
@Getter
@Setter
public class DentistaMarceloMB {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_dentista")
    private int idDentista;

    @Column(name = "cop", nullable = false)
    private String cop;

    @Column(name = "nombre_completo", nullable = false)
    private String nombreCompleto;

    @Column(name = "fecha_inicio_contrato", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaInicioContrato;

    @Column(name = "turno", nullable = false)
    private String turno;

    @Column(name = "correo", nullable = false)
    private String correo;

    @ManyToOne
    @JoinColumn(name = "id_especialidad", referencedColumnName = "id_especialidad")
    private EspecialidadMarceloMB especialidad;

    
    public String getNombreDentista() {
        return nombreCompleto;  
    }

    @Override
    public String toString() {
        return nombreCompleto;  
    }
}

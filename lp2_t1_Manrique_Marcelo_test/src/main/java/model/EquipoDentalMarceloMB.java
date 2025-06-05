package model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tbl_equipo_dental")
@Getter
@Setter
public class EquipoDentalMarceloMB {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "nro_equipo")
	private int id;

	@Column(name = "nombre", nullable = false)
	private String nombre;

	@Column(name = "costo", nullable = false)
	private double costo;

	@Column(name = "fecha_adquisicion", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaAdquisicion;

	@Column(name = "estado", nullable = false)
	private String estado;

	@ManyToOne
	@JoinColumn(name = "id_dentista", referencedColumnName = "id_dentista")
	private DentistaMarceloMB dentista;

	public int getId() {
		return id;
	}

	public String getNombreEquipo() {
		return nombre;
	}
}

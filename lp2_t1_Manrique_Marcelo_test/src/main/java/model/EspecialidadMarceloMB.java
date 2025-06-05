package model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "tbl_especialidad")
@Getter
@Setter
public class EspecialidadMarceloMB {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_especialidad")
	private int idEspecialidad;

	@Column(name = "titulo", nullable = false)
	private String titulo;

	@Override
	public String toString() {
		return titulo;
	}
}

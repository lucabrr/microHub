package com.ThunderGym.maintenance;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.GamesCompilation.classes.UserRecord;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	@Column
	String nome;
	@Column
	List<LocalDateTime> data;
	
	
	public Project(String nome) {
		super();
		this.nome = nome;
		this.data = new ArrayList<LocalDateTime>();
	}
	

}

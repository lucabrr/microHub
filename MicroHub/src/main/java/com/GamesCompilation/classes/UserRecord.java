package com.GamesCompilation.classes;

import java.time.LocalDate;

import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UserRecord {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	@Column(nullable = false ,unique = true )
	@Length(min = 4 , max = 8)
	String username;
	@Column(nullable = false)
	int move;
	@Column(nullable = false)
	LocalDate data;

}

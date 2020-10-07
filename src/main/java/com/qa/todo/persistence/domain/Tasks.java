package com.qa.todo.persistence.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import jdk.jfr.BooleanFlag;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Tasks 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Size(min = 0, max = 40)
	private String task;
	
	private Boolean completed;
	
	private Date Deadline;
	
	@ManyToOne
	private ToDo todo;

	public Tasks(Long id, @NotNull @Size(min = 0, max = 40) String task, Boolean completed, Date deadline) 
	{
		super();
		this.id = id;
		this.task = task;
		this.completed = completed;
		Deadline = deadline;
	}
}
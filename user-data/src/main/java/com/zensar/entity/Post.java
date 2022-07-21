package com.zensar.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="posts")
@Data
@NoArgsConstructor
public class Post {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="post_tittle",length=100,nullable=false)
	private String tittle;
	
	@Column(length = 1000)
	private String content;

	private String imageName;

	//private Date addedDate;
	@ManyToOne
	@JoinColumn(name= "cartegory_id")
	private Category category;
	@ManyToOne
	private User user;

}

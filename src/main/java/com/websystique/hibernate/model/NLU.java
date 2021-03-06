// Generated by delombok at Sat Jun 24 22:59:11 EDT 2017
package com.websystique.hibernate.model;

import java.sql.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.Query;
import org.hibernate.Session;
import com.websystique.hibernate.HibernateUtil;
// tag::code[]
/**
 * @author Greg Turnquist
 */
@Entity
@Table(name = "NLU")
public class NLU {
	@Column(name = "Id")
	@Id
	@GeneratedValue
	private Long id;
	@Column(name = "filename")
	private String filename;
	@Column(name = "item") //Concept, entity, keyword, category
	private String item;	
	@Column(name = "itemtext")
	private String itemtext;
	@Column(name = "type")
	private String type;
	@Column(name = "relevance") // relevance. score
    public Double relevance;
	@Column(name = "count")
    public long count;
	@Column(name = "year")
    public int year;
	@Column(name = "sentiment")
    public Double sentiment;
	@Column(name = "anger")
    public Double anger;
	@Column(name = "disgust")
    public Double disgust;
	@Column(name = "fear")
    public Double fear;
	@Column(name = "joy")
    public Double joy;
	@Column(name = "sadness")
    public Double sadness;

	public NLU() {
	}



	public NLU(String filename, String item, String itemtext,String type, Double relevance, long count, int year, Double sentiment,
			Double anger, Double disgust, Double fear, Double joy, Double sadness) {
		this.filename = filename;
		this.item = item;
		this.itemtext = itemtext;
		this.type = type;
		this.relevance = relevance;
		this.count = count;
		this.year = year;
		this.sentiment = sentiment;
		this.anger = anger;
		this.disgust = disgust;
		this.fear = fear;
		this.joy = joy;
		this.sadness = sadness;
	}


}
// end::code[]
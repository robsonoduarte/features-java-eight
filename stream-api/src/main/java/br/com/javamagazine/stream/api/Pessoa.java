package br.com.javamagazine.stream.api;

import static org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals;
import static org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode;
import static org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString;
import static org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {


	public int idade;
	public String nome;
	private List<String> hobbys;
	

	public Pessoa(int idade, String nome, List<String> hobbys) {
		this.idade = idade;
		this.nome = nome;
		this.hobbys = hobbys;
	}
	
	
	public Pessoa(int idade, String nome) {
		this.idade = idade;
		this.nome = nome;
	}




	public int getIdade() {
		return idade;
	}


	public String getNome() {
		return nome;
	}


	public List<String> getHobbys() {
		if(hobbys == null){
			return new ArrayList<>();
		}
		return hobbys;
	}

	

	@Override
	public int hashCode() {
		return reflectionHashCode(this);
	}


	@Override
	public boolean equals(Object obj) {
		return reflectionEquals(this, obj);
	}



	@Override
	public String toString() {
		return reflectionToString(this, SHORT_PREFIX_STYLE);
	}




	





}

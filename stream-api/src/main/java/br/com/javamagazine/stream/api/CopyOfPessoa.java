package br.com.javamagazine.stream.api;

import static org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals;
import static org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode;
import static org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString;
import static org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;

public class CopyOfPessoa {


	public int idade;
	public String nome;


	public CopyOfPessoa(int idade, String nome) {
		this.idade = idade;
		this.nome = nome;
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

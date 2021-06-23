package io.brookrock.hibernate.convert;

import javax.persistence.Converter;

@Converter(autoApply = true)
public class StringListConverter extends AbstractListConverter<String> {

	@Override
	protected String convert(String s) {
		return s;
	}

}
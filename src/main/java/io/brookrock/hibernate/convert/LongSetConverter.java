package io.brookrock.hibernate.convert;

import javax.persistence.Converter;

@Converter(autoApply = true)
public class LongSetConverter extends AbstractSetConverter<Long> {

	@Override
	protected Long convert(String s) {
		return Long.valueOf(s);
	}

}
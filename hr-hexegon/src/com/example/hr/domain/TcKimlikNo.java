package com.example.hr.domain;

import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

//value object, value tutar, identitysi yok, immutable-deðiþtirilemez.
// effective java ed.3
public class TcKimlikNo {

	private final String value;// immutable olmasý için final
	private static final Map<String, TcKimlikNo> identityCache = new WeakHashMap<>();

	private TcKimlikNo(String value) { /* Nesne yaratmayý engelledik */
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public static TcKimlikNo valueOf(String value) {
		// validasyon
		if (!isValid(value))
			throw new IllegalArgumentException("Not valid identity");
		// object pooling--> caching. Cache ancak immutablelar için yaparýz
		var tcKimlikNo = identityCache.get(value);
		if (Objects.nonNull(tcKimlikNo))
			return tcKimlikNo;

		tcKimlikNo = new TcKimlikNo(value);
		identityCache.put(value, tcKimlikNo);
		return new TcKimlikNo(value);

	}

	private static boolean isValid(String value2) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TcKimlikNo other = (TcKimlikNo) obj;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TcKimlikNo [value=" + value + "]";
	}

}

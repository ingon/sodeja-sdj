package org.sodeja.sil.compiler.model;

import java.util.List;

public class KeywordMethodHeader implements MethodHeader {
	public final List<KeywordMethodHeaderSegment> segments;

	public KeywordMethodHeader(List<KeywordMethodHeaderSegment> segments) {
		this.segments = segments;
	}
}

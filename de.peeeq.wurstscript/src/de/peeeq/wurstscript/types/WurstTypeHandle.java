package de.peeeq.wurstscript.types;

import de.peeeq.wurstscript.ast.AstElement;
import de.peeeq.wurstscript.jassIm.ImExprOpt;
import de.peeeq.wurstscript.jassIm.JassIm;


public class WurstTypeHandle extends WurstTypePrimitive {

	private static final WurstTypeHandle instance = new WurstTypeHandle();

	// make constructor private as we only need one instance
	private WurstTypeHandle() {
		super("handle");
	}
	
	@Override
	public boolean isSubtypeOf(WurstType other, AstElement location) {
		return other instanceof WurstTypeHandle;
	}



	public static WurstTypeHandle instance() {
		return instance;
	}

	@Override
	public ImExprOpt getDefaultValue() {
		return JassIm.ImNull();
	}

	
}

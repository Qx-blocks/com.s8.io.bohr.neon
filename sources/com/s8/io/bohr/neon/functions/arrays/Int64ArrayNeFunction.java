package com.s8.io.bohr.neon.functions.arrays;

import com.s8.arch.fluor.S8AsyncFlow;
import com.s8.io.bohr.atom.BOHR_Types;
import com.s8.io.bohr.neon.functions.NeFunction;

@FunctionalInterface
public interface Int64ArrayNeFunction extends NeFunction {
	
	
	public final static long SIGNATURE = (BOHR_Types.ARRAY << 8) & BOHR_Types.INT64;

	public @Override default long getSignature() { return SIGNATURE; }

	public abstract void operate(S8AsyncFlow flow, long[] arg);
}

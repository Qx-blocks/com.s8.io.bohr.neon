package com.s8.io.bohr.neon.methods.primitives;

import java.io.IOException;

import com.s8.io.bohr.atom.BOHR_Types;
import com.s8.io.bohr.neon.core.NeBranch;
import com.s8.io.bohr.neon.core.NeObjectTypeHandler;
import com.s8.io.bohr.neon.functions.NeFunction;
import com.s8.io.bohr.neon.functions.primitives.Int8NeFunction;
import com.s8.io.bohr.neon.methods.NeMethodRunner;
import com.s8.io.bytes.alpha.ByteInflow;


/**
 * 
 * @author pierreconvert
 *
 */
public class Int8NeMethod extends NeMethodRunner {

	public final static long SIGNATURE = BOHR_Types.INT8;
	
	public @Override long getSignature() { return SIGNATURE; }

	
	public Int8NeMethod(NeObjectTypeHandler prototype, String name, int ordinal) {
		super(prototype, name, ordinal);
	}

	@Override
	public void run(NeBranch<?> branch, ByteInflow inflow, NeFunction function) throws IOException {
		int arg =  inflow.getInt8();
		((Int8NeFunction) function).run(arg);
	}
}
package com.s8.io.bohr.neon.control;

import com.s8.io.bohr.neon.functions.arrays.Float32ArrayNeFunction;
import com.s8.io.bohr.neon.functions.arrays.Float64ArrayNeFunction;
import com.s8.io.bohr.neon.functions.arrays.Int16ArrayNeFunction;
import com.s8.io.bohr.neon.functions.arrays.Int32ArrayNeFunction;
import com.s8.io.bohr.neon.functions.arrays.Int64ArrayNeFunction;
import com.s8.io.bohr.neon.functions.arrays.Int8ArrayNeFunction;
import com.s8.io.bohr.neon.functions.arrays.StringUTF8ArrayNeFunction;
import com.s8.io.bohr.neon.functions.arrays.UInt16ArrayNeFunction;
import com.s8.io.bohr.neon.functions.arrays.UInt32ArrayNeFunction;
import com.s8.io.bohr.neon.functions.arrays.UInt64ArrayNeFunction;
import com.s8.io.bohr.neon.functions.arrays.UInt8ArrayNeFunction;
import com.s8.io.bohr.neon.functions.none.VoidNeFunction;
import com.s8.io.bohr.neon.functions.primitives.Float32NeFunction;
import com.s8.io.bohr.neon.functions.primitives.Float64NeFunction;
import com.s8.io.bohr.neon.functions.primitives.Int16NeFunction;
import com.s8.io.bohr.neon.functions.primitives.Int32NeFunction;
import com.s8.io.bohr.neon.functions.primitives.Int64NeFunction;
import com.s8.io.bohr.neon.functions.primitives.Int8NeFunction;
import com.s8.io.bohr.neon.functions.primitives.StringUTF8NeFunction;
import com.s8.io.bohr.neon.functions.primitives.UInt16NeFunction;
import com.s8.io.bohr.neon.functions.primitives.UInt32NeFunction;
import com.s8.io.bohr.neon.functions.primitives.UInt64NeFunction;
import com.s8.io.bohr.neon.functions.primitives.UInt8NeFunction;
import com.s8.io.bohr.neon.lambdas.VoidLambda;
import com.s8.io.bohr.neon.lambdas.arrays.Float32ArrayLambda;
import com.s8.io.bohr.neon.lambdas.arrays.Float64ArrayLambda;
import com.s8.io.bohr.neon.lambdas.arrays.Int16ArrayLambda;
import com.s8.io.bohr.neon.lambdas.arrays.Int32ArrayLambda;
import com.s8.io.bohr.neon.lambdas.arrays.Int64ArrayLambda;
import com.s8.io.bohr.neon.lambdas.arrays.Int8ArrayLambda;
import com.s8.io.bohr.neon.lambdas.arrays.StringUTF8ArrayLambda;
import com.s8.io.bohr.neon.lambdas.arrays.UInt16ArrayLambda;
import com.s8.io.bohr.neon.lambdas.arrays.UInt32ArrayLambda;
import com.s8.io.bohr.neon.lambdas.arrays.UInt64ArrayLambda;
import com.s8.io.bohr.neon.lambdas.arrays.UInt8ArrayLambda;
import com.s8.io.bohr.neon.lambdas.primitives.Float32Lambda;
import com.s8.io.bohr.neon.lambdas.primitives.Float64Lambda;
import com.s8.io.bohr.neon.lambdas.primitives.Int16Lambda;
import com.s8.io.bohr.neon.lambdas.primitives.Int32Lambda;
import com.s8.io.bohr.neon.lambdas.primitives.Int64Lambda;
import com.s8.io.bohr.neon.lambdas.primitives.Int8Lambda;
import com.s8.io.bohr.neon.lambdas.primitives.StringUTF8Lambda;
import com.s8.io.bohr.neon.lambdas.primitives.UInt16Lambda;
import com.s8.io.bohr.neon.lambdas.primitives.UInt32Lambda;
import com.s8.io.bohr.neon.lambdas.primitives.UInt64Lambda;
import com.s8.io.bohr.neon.lambdas.primitives.UInt8Lambda;

public class StubNeController implements NeController {

	@Override
	public VoidNeFunction createUint8Func(VoidLambda lambda) {
		return null;
	}

	@Override
	public UInt8NeFunction createUint8Func(UInt8Lambda lambda) {
		return null;
	}

	@Override
	public UInt8ArrayNeFunction createUint8ArrayFunc(UInt8ArrayLambda lambda) {
		return null;
	}

	@Override
	public UInt16NeFunction createUint16Func(UInt16Lambda lambda) {
		return null;
	}

	@Override
	public UInt16ArrayNeFunction createUint16ArrayFunc(UInt16ArrayLambda lambda) {
		return null;
	}

	@Override
	public UInt32NeFunction createUint32Func(UInt32Lambda lambda) {
		return null;
	}

	@Override
	public UInt32ArrayNeFunction createUint32Func(UInt32ArrayLambda lambda) {
		return null;
	}

	@Override
	public UInt64NeFunction createUint64Func(UInt64Lambda lambda) {
		return null;
	}

	@Override
	public UInt64ArrayNeFunction createUint64Func(UInt64ArrayLambda lambda) {
		return null;
	}

	@Override
	public Int8NeFunction createInt8Func(Int8Lambda lambda) {
		return null;
	}

	@Override
	public Int8ArrayNeFunction createInt8ArrayFunc(Int8ArrayLambda lambda) {
		return null;
	}

	@Override
	public Int16NeFunction createInt16Func(Int16Lambda lambda) {
		return null;
	}

	@Override
	public Int16ArrayNeFunction createInt16ArrayFunc(Int16ArrayLambda lambda) {
		return null;
	}

	@Override
	public Int32NeFunction createInt32Func(Int32Lambda lambda) {
		return null;
	}

	@Override
	public Int32ArrayNeFunction createInt32ArrayFunc(Int32ArrayLambda lambda) {
		return null;
	}

	@Override
	public Int64NeFunction createInt64Func(Int64Lambda lambda) {
		return null;
	}

	@Override
	public Int64ArrayNeFunction createInt64ArrayFunc(Int64ArrayLambda lambda) {
		return null;
	}

	@Override
	public Float32NeFunction createFloat32Func(Float32Lambda lambda) {
		return null;
	}

	@Override
	public Float32ArrayNeFunction createFloat32ArrayFunc(Float32ArrayLambda lambda) {
		return null;
	}

	@Override
	public Float64NeFunction createFloat64Func(Float64Lambda lambda) {
		return null;
	}

	@Override
	public Float64ArrayNeFunction createFloat64ArrayFunc(Float64ArrayLambda lambda) {
		return null;
	}

	@Override
	public StringUTF8NeFunction createStringUTF8Func(StringUTF8Lambda lambda) {
		return null;
	}

	@Override
	public StringUTF8ArrayNeFunction createStringUTF8ArrayFunc(StringUTF8ArrayLambda lambda) {
		return null;
	}

}
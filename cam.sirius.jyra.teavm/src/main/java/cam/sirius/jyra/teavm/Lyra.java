/*
 * Thine, the communication platform of the future.
 * Copyright 2023 © Sirius, all rights reserved.
 *
 * This computer program is protected by copyright law.
 * Unauthorized reproduction or distribution of this program, or any
 * portion of it, may result in severe civil and criminal penalties, and
 * will be prosecuted to the maximum extent possible under the law.
 */
package cam.sirius.jyra.teavm;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSObject;
import org.teavm.jso.typedarrays.Float32Array;
import org.teavm.jso.typedarrays.Uint8Array;

/**
 * Wrapper class for Lyra. Requires that "META-INF/resources/webjars/" is
 * available relative to where the built TeaVM binary is. This will be
 * achieved by default if using the Maven WAR plugin to build.
 */
public abstract class Lyra implements JSObject {
	
	@JSBody(script = "return await import('META-INF/resources/webjars/lyra-codec/1.1.1/src/lyra.js')")
	public static native Lyra create();
	
	/**
	 * Encode the provided audio data, requiring at least 20ms of audio
	 * (0.02 * sampleRate) samples in the provided data.
	 */
	public abstract Uint8Array encodeWithLyra(Float32Array data, int sampleRate);
	
	/**
	 * Decode the provided encoded audio data.
	 */
	public abstract Float32Array decodeWithLyra(Uint8Array encodedData, int sampleRate, int expectedSamples);
	
	/**
	 * Assert whether the WebAssembly module for Lyra has already been loaded.
	 */
	public abstract boolean isLyraReady();
}
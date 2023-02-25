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

import lombok.SneakyThrows;
import org.teavm.jso.typedarrays.Float32Array;
import org.teavm.jso.typedarrays.Uint8Array;
import org.teavm.jso.webaudio.AudioContext;
import org.teavm.jso.webaudio.MediaStream;
import org.teavm.jso.webaudio.MediaStreamAudioSourceNode;
import org.teavm.jso.webaudio.ScriptProcessorNode;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 * Extra utilities to use with {@link Lyra} for, e.g.
 * streaming, producing a more Java-friendly interface.
 */
public class Jyra {
	
	/**
	 * Streams a compressed version of the provided {@link MediaStream}
	 * using Lyra for compression to a bitrate of 3kbps.
	 */
	@SneakyThrows
	public MediaStream compress(MediaStream stream) {
	
	
//		Lyra lyra = Lyra.create();
//		AudioContext audioContext = AudioContext.create();
//		MediaStreamAudioSourceNode source = audioContext.createMediaStreamSource(stream);
//
//		int bufferSize = (int) Math.ceil(0.02 * audioContext.getSampleRate());
//		ScriptProcessorNode processor = audioContext.createScriptProcessor(bufferSize, 1, 1);
//
//		source.connect(processor);
//		processor.connect(audioContext.getDestination());
//
//		processor.setOnAudioProcess(event -> {
//			Float32Array audio = event.getInputBuffer().getChannelData(0);
//			Uint8Array encodedAudio = lyra.encodeWithLyra(audio, (int) audioContext.getSampleRate());
//			// write audio to stream here
//		});
		return null;
		
	}
	
	@SneakyThrows
	public MediaStream compressWithOpus(MediaStream stream, int bitRate) {
		throw new IllegalStateException("Not implemented yet");
	}
	
	public MediaStream decompress(MediaStream stream) {
		throw new IllegalStateException("Not implemented yet");
	}
	// Float32Array compressedAudio = lyra.decodeWithLyra(encodedAudio, (int) audioContext.getSampleRate(), bufferSize);
	public MediaStream decompressWithOpus(MediaStream stream) {
		throw new IllegalStateException("Not implemented yet");
	}
}
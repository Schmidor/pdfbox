package org.apache.pdfbox.filter;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReference;

import org.apache.pdfbox.cos.COSDictionary;

public abstract class BIFilter extends Filter
{

    /**
     * Decodes data, with optional DecodeOptions. Not all filters support all options, and so
     * callers should check the options' <code>honored</code> flag to test if they were applied.
     *
     * @param encoded the encoded byte stream
     * @param decoded the stream where decoded data will be written
     * @param parameters the parameters used for decoding
     * @param index the index to the filter being decoded
     * @param options additional options for decoding
     * @throws IOException if the stream cannot be decoded
     */
    public abstract DecodeResult decode(InputStream encoded, AtomicReference<BufferedImage> outImage,
            COSDictionary parameters, int index, DecodeOptions options) throws IOException;
}

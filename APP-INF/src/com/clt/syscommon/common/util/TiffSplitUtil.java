/*=========================================================
 *Copyright(c) 2008 CyberLogitec
 *@FileName : TiffSplitUtil.java
 *@FileTitle : TiffSplitUtil
 *Open Issues :
 *Change history :
 *@LastModifyDate : 2009.11.10
 *@LastModifier : 김경범
 *@LastVersion : 1.0
 * 2009.11.10 김경범
 * 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.common.util;

import java.awt.image.RenderedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Vector;

import com.sun.media.jai.codec.FileSeekableStream;
import com.sun.media.jai.codec.ImageCodec;
import com.sun.media.jai.codec.ImageDecoder;
import com.sun.media.jai.codec.ImageEncoder;
import com.sun.media.jai.codec.SeekableStream;
import com.sun.media.jai.codec.TIFFDirectory;
import com.sun.media.jai.codec.TIFFEncodeParam;

/**
 * fax tiff format file splitter
 * 
 * @author desis
 * @since J2EE 1.4
 * @see
 */
public class TiffSplitUtil {
	
	/**
	 * tiff format file cut
	 * usage :
	 * (new TiffSplitUtil()).splitBetween("/absolute_path/source.tif","/absolute_path/destination.tif",0,2);
	 * source.tif(5장) 이면 destination.tif(3장) 생성됨
	 * 
	 * @param String src_tiff_filepath
	 * @param String dest_tiff_filepath
	 * @param int start_page
	 * @param int end_page
	 * @throws IOException 
	 */
	public void splitBetween(String src_tiff_filepath, String dest_tiff_filepath, int start_page, int end_page) throws IOException {
		saveAsMultipageTIFF(readMultiPageTiff(src_tiff_filepath, start_page, end_page), dest_tiff_filepath);
	}
	
	private RenderedImage[] readMultiPageTiff(String fileName, int startPage, int endPage) throws IOException {
		File file = new File(fileName);
		SeekableStream seekableStream = new FileSeekableStream(file);
		ImageDecoder decoder = ImageCodec.createImageDecoder("tiff", seekableStream, null);
		int count = 0;
		RenderedImage image[] = new RenderedImage[endPage - startPage + 1];
		
		for (int i = 0; i < decoder.getNumPages(); i++) {
			if (i >= startPage && i <= endPage) {
				image[count++] = decoder.decodeAsRenderedImage(i);
			}
		}
		return image;
	}

	private void saveAsMultipageTIFF(RenderedImage[] image, String filename) throws java.io.IOException {
        OutputStream out = new FileOutputStream(filename);
        TIFFEncodeParam param = new TIFFEncodeParam();
        param.setCompression(4);
        param.setLittleEndian(true);
        param.setWriteTiled(false);
        RenderedImage first = image[0];
        TIFFDirectory tiffDirectory = (TIFFDirectory)first.getProperty("tiff_directory");
        param.setExtraFields(tiffDirectory.getFields());
        ImageEncoder encoder = ImageCodec.createImageEncoder("TIFF", out, param);
        Vector<RenderedImage> vector = new Vector<RenderedImage>();
        for(int i = 1; i < image.length; i++)
            vector.add(image[i]);

        param.setExtraImages(vector.iterator());
        encoder.encode(image[0]);
        out.close();
    }
}

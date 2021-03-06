package org.jcodec.api;

import org.jcodec.common.DemuxerTrackMeta;
import org.jcodec.common.model.Picture8Bit;

/**
 * This class is part of JCodec ( www.jcodec.org ) This software is distributed
 * under FreeBSD License
 * 
 * @author The JCodec project
 * 
 */
public class PictureWithMetadata8Bit {
    private Picture8Bit picture;
    private double timestamp;
    private double duration;
    private DemuxerTrackMeta.Orientation orientation;

    public PictureWithMetadata8Bit(Picture8Bit picture, double timestamp, double duration) {
        this.picture = picture;
        this.timestamp = timestamp;
        this.duration = duration;
        this.orientation = DemuxerTrackMeta.Orientation.D_0;
    }

    public PictureWithMetadata8Bit(Picture8Bit picture, double timestamp, double duration, DemuxerTrackMeta.Orientation orientation) {
        this.picture = picture;
        this.timestamp = timestamp;
        this.duration = duration;
        this.orientation = orientation;
    }

    public Picture8Bit getPicture() {
        return picture;
    }

    public double getTimestamp() {
        return timestamp;
    }

    public double getDuration() {
        return duration;
    }

    public DemuxerTrackMeta.Orientation getOrientation() {
        return orientation;
    }
}

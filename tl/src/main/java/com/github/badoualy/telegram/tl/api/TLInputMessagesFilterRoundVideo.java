package com.github.badoualy.telegram.tl.api;

/**
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
public class TLInputMessagesFilterRoundVideo extends TLAbsMessagesFilter {
    public static final int CONSTRUCTOR_ID = 0xb549da53;

    private final String _constructor = "inputMessagesFilterRoundVideo#b549da53";

    public TLInputMessagesFilterRoundVideo() {
    }

    @Override
    public String toString() {
        return _constructor;
    }

    @Override
    public int getConstructorId() {
        return CONSTRUCTOR_ID;
    }
}

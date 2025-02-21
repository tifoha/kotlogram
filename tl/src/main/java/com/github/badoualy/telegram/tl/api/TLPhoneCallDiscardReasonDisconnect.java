package com.github.badoualy.telegram.tl.api;

/**
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
public class TLPhoneCallDiscardReasonDisconnect extends TLAbsPhoneCallDiscardReason {
    public static final int CONSTRUCTOR_ID = 0xe095c1a0;

    private final String _constructor = "phoneCallDiscardReasonDisconnect#e095c1a0";

    public TLPhoneCallDiscardReasonDisconnect() {
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
